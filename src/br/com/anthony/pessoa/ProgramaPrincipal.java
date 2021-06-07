package br.com.anthony.pessoa;

import java.util.ArrayList;
import java.util.List;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		PessoaController pessoaControler = new PessoaController();
		
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
