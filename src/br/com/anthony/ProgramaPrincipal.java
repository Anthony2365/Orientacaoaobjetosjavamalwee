package br.com.anthony;

import java.util.ArrayList;
import java.util.List;

import br.com.anthony.pessoa.Pessoa;
import br.com.anthony.pessoa.PessoaController;
import br.com.senai.loja.ProdutoController;
import br.com.senai.produto.Produto;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		PessoaController pessoaControler = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		
		
		boolean sair = false;
		
		
		do {
			
			pessoaControler.menu();
			
			
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
				
			case 9:
				sair = true; 
				break;
				
				default: 
					System.out.println("opção invalida");
			}
			
		}while(!sair); 
		
		
		System.out.println("Sistema finalizado!");
		
		
	}

}
