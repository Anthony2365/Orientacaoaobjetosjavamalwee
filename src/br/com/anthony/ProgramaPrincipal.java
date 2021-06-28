package br.com.anthony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.anthony.pessoa.Pessoa;
import br.com.anthony.pessoa.PessoaController;
import br.com.senai.loja.ProdutoController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.produto.Produto;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		
		
		
		Produto produto = new Produto(
			"Abacate",
			2.5,
			35,
			2.5 * 35
			);
		produtos.add(produto);
		
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;
		
		
		do {
			 System.out.println("\n--- MENU ---");
			 System.out.println("1) Pessoa");
			 System.out.println("2) Produto");
			 System.out.println("3) Venda");
			 System.out.println("4) Sair do Sistema");
			 System.out.print("Informe o campo para ser editado: ");
			 int opcao = pessoaController.leOpcao();
			 
			 
				
				switch(opcao) {
				
				case 1 :	
					pessoaController.menu(pessoas);
					
					break;
				
				case 2 :
					produtoController.menu(produtos);
					break;
					
					
				case 3 :
					vendaController.menu(pessoas , produtos);
					break;
					
					
				case 4 :
					sair = true;
					break;
					
				default: 
					System.out.println("opção invalida");
				}
			
			
			
			
		}while(!sair); 
		
		
		System.out.println("Sistema finalizado!");
		
	}
	
	

	
	}


