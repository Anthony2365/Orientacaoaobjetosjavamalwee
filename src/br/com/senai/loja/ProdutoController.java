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
		produto.setNomeDoProduto(tec.next());
		
		System.out.println("Valor Unitario do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.println("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto() );
	
		
		
		
		
		
		return produto;

		
		
		}	
		public List<Produto> ListarProduto(List<Produto> produtos) {
			
			if(produtos.isEmpty()) { 
				System.out.println("Não possui produtos cadastrados.");
				return null;
			}
			
			 
			System.out.printf( "| %2s | %10s | %15s | %10s | %6s |\n " , "Id" ,"nome" , "ValorUnitario" , "Quantidade", "Total");
			for(int i = 0; i < produtos.size(); i ++) { 
				System.out.printf("| %2d | %10s | %15.2f | %10d | %6.2f \n" ,
				i + 1,			
				produtos.get(i).getNomeDoProduto(),
				produtos.get(i).getValorUnitarioDoProduto(),
				produtos.get(i).getQuantidadeDoProduto(),
				produtos.get(i).getValorTotalDoProduto());
			
			}
			
			
			
			return produtos;
			
		}
		
		public List<Produto> editarProduto(List<Produto> produtos ) {
			
       
			Produto produto = new Produto();
			
			ListarProduto(produtos);
			
			if(produtos.isEmpty()) {
				return null;
				
			}
			
			
			System.out.println("Informe o Id do produto para editar: ");
			int idProduto = tec.nextInt() - 1;
			
			System.out.println("1) Nome do produto");
			System.out.println("2) Quantidade de produto");
			System.out.println("3) Valor unitário do produto");
			System.out.print("Informe o campo para ser editado");
			int Opcao = tec.nextInt();
			
			switch (Opcao) {
			case 1:
				System.out.println("--- EDITAR O NOME DE PRODUTO ---");
				System.out.println("Informe o novo nome do produto: ");
				produto.setNomeDoProduto(tec.next());
				
				produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
				produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
				produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
				
				produtos.set(idProduto, produto);
				
			break;
			
			case 2:
				System.out.println("---  EDITAR A QUANTIDADE DE PRODUTO ---");
				System.out.println("Informe a nova quantidade do produto: ");
				
                produto.setQuantidadeDoProduto(tec.nextInt());
				
				produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
				produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
				produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
				
				produtos.set(idProduto , produto);
				
			break;
			
			case 3:
				System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
				System.out.println("Informe um novo valor do produto: ");
				
				 produto.setValorUnitarioDoProduto(tec.nextDouble());
					
					produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
					produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
					produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
					produtos.set(idProduto, produto);
				break;
				
				default: 
					System.out.println("opção inválida!");
					break;
			
			}
			
			return produtos;
		
			
		}
		
		public void excluirProduto(List<Produto> produtos) {
			ListarProduto(produtos);
			if(produtos.isEmpty()) {
				return;
			}
			
			System.out.println("--- EXCLUIR PRODUTO ---");
			
			System.out.println("Informe o Id do produto para excluir:");
			int idProduto = tec.nextInt() -1;
			
			
			if(produtos.size() <= idProduto) {
				System.out.println("Produto não cadastrado.");
				return;
			}
			
			produtos.remove(idProduto);
		}
		
		public void menu(List<Produto> produtos) {
			System.out.println("1) Cadastrar ");
			System.out.println("2) Listar ");
			System.out.println("3) Editar");
			System.out.println("4) Excluir");
		
			
			
			System.out.print("Informe o campo para ser editado: ");
			int opcao = tec.nextInt();
			
			switch(opcao) {
			
			case 1 :
				produtos.add(cadastrarProduto());
				
				break;
			
			case 2 :
				ListarProduto(produtos);
				
				break;
				
				
			case 3 :
				editarProduto(produtos);
				
				break;
				
				
			case 4 :
				excluirProduto(produtos);
			
				break;
				
			
			}
			
		
		}
}	


