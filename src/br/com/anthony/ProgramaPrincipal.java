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
		List<Venda> vendas = new ArrayList<Venda>();
		
		
		Produto produto = new Produto(
			"Abacate",
			2.5,
			35,
			2.5 * 35
			);
		produtos.add(produto);
		
		
		PessoaController pessoaControler = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;
		
		
		do {
			
		
			
			int opcao = pessoaControler.leOpcao();
			
			switch(opcao) {
			
			case 1 : 
				pessoas.add(pessoaControler.cadastrarPessoa());
				break;
				
			case 2:
				pessoaControler.ListarPessoas(pessoas);
				break;
				
			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;
				
			case 4 : 
				produtoController.ListarProduto(produtos);
				break;
				
			case 5 :
				produtoController.editarProduto(produtos);
				break;
				
			case 6 :
				produtoController.excluirProduto(produtos);
				break;
				
			case 7 : 
				pessoaControler.editarPessoa(pessoas);
				break;
				
			case 8 :
				pessoaControler.excluirPessoa(pessoas);
				break;
				
			case 9 :
				vendaController.listarVenda(vendas);
				break;
				
			case 10 :
				vendas.add(vendaController.cadastrarVenda(produtos, pessoas));
				vendaController.cadastrarVenda(produtos, pessoas);
				break;
				
				
			case 12:
				sair = true; 
				break;
				
				default: 
					System.out.println("opção invalida");
			}
			
		}while(!sair); 
		
		
		System.out.println("Sistema finalizado!");
		
	}
	public void menu() {
		 System.out.println("\n--- MENU ---");
		 System.out.println("1) Pessoa");
		 System.out.println("2) Produto");
		 System.out.println("3) Venda");
		 System.out.println("4) Sair do Sistema");
		 System.out.println("Informe o campo para ser editado: ");
		 
		 Scanner tec = new Scanner(System.in);
		 
			int opcao = tec.nextInt();
			
			switch(opcao) {
			
			case 1 :	
				
				break;
			
			case 2 :
				break;
				
				
			case 3 :
				break;
				
				
			case 4 :
				break;
				
			
			}
	}
}
