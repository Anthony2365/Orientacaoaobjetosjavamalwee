package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.anthony.pessoa.Pessoa;
import br.com.senai.produto.Produto;

public class ProdutoController {

	
	private Scanner tec;
	
	public ProdutoController() {
	
		tec = new Scanner(System.in);
	}
	
		
		public Produto cadastrarProduto() {
			Produto produto = new Produto();
		
		 
		System.out.println("--- CADASTRAR PRODUTO ---");
		
		System.out.println("Nome do Produto: ");
		tec.nextLine();
		produto.setNomeDoProduto(tec.nextLine());
		
		System.out.println("Valor Unitario do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.println("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		
	
		
		
		
		
		
		return produto;

		
		
		}	
		public List<Produto> ListarProduto(List<Produto> produtos) {
			
			
			System.out.printf( " | %15s | %6s | %3s | \n " , "nome" , "ValorUnitario" , "Quantidade");
			for(int i = 0; i < produtos.size(); i ++) { 
				System.out.printf("| %15s | %6.2d | %3d | \n" ,
						
				produtos.get(i).getNomeDoProduto(),
				produtos.get(i).getValorUnitarioDoProduto(),
				produtos.get(i).getQuantidadeDoProduto(),
				produtos.get(i).getValorTotalDoProduto());
			
			}
			
			
			
			return produtos;
			
		}
	}		

