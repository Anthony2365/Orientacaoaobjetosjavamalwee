package br.com.anthony.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {
	
	
	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
		
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public void menu() {
		 System.out.println("\n--- MENU ---");
		 System.out.println("1) Cadastrar pessoa");
		 System.out.println("2) Listar pessoas cadastradas");
		 System.out.println("3) cadastrar produtos");
		 System.out.println("4) Listar produtos");
		 System.out.println("5) Editar produto");
		 System.out.println("6) Excluir produto");
		 System.out.println("7) Editar Pessoas");
		 System.out.println("8) excluir Pessoas");
		 System.out.println("9) Sair do sistema");
		 System.out.println("--------------------");

	 }

		public Pessoa cadastrarPessoa() {
			Pessoa pessoa = new Pessoa();
			
			System.out.println("--- CADASTRAR PESSOA ---");
			System.out.println("Informe o nome: ");
			tec.nextLine();
			pessoa.setNome(tec.nextLine());
			
			System.out.println("Informe o ano de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			System.out.println("Informe a altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			System.out.println("Informe o pais: ");
			tec.nextLine();
			pessoa.setNomeDoPais(tec.nextLine());
			
			System.out.println("Informe a sigla do Pais: ");
			
			pessoa.setSiglaDoPais(tec.nextLine());
			
			System.out.println("Informe o Estado: ");
			
			pessoa.setNomeDoEstado(tec.nextLine());
			
			System.out.println("Uf: ");
			pessoa.setUf(tec.next());
			
			System.out.println("Informe a Cidade: ");
			tec.nextLine();
			pessoa.setNomeDaCidade(tec.nextLine());
			
			System.out.println("Informe o bairro: ");
			
			pessoa.setNomeDoBairro(tec.nextLine());
			
			System.out.println("Informe a Rua: ");
			pessoa.setNomeDaRua(tec.nextLine());
			
			System.out.println("Informe o Complemento: ");
			pessoa.setComplemento (tec.nextLine());
			
			System.out.println("Informe o Numero: ");
			
			pessoa.setNumero(tec.nextLine());
			
			return pessoa;
			
		}
		
		public List<Pessoa> ListarPessoas(List<Pessoa> pessoas){
			
		
		
		if(pessoas.isEmpty()){
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		
			System.out.printf("| %2s |  %8s | %4s | %5s | %6s | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s | \n", 
					 "Id", "Nome" , "Ano" , "Idade" , "Altura" , "Pais" , "sigla" , "Estado" , "Uf" , "Cidade" , "Bairro" , "Rua" , "Complemento" , "Numero" ); 
			
			
			for(int i = 0; i < pessoas.size(); i++ ) {
				System.out.printf("| %2d | %8s | %4d | %5d | %6.2f | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s | \n",
						i + 1,
						pessoas.get(i).getNome(),
						pessoas.get(i).getAnoDeNascimento(),
						pessoas.get(i).getIdade(),
						pessoas.get(i).getAltura(),
						pessoas.get(i).getNomeDoPais(),
				        pessoas.get(i).getSiglaDoPais(),
						pessoas.get(i).getNomeDoEstado(),
						pessoas.get(i).getUf(),
						pessoas.get(i).getNomeDaCidade(),
						pessoas.get(i).getNomeDoBairro(),
						pessoas.get(i).getNomeDaRua(),
						pessoas.get(i).getComplemento(),
						pessoas.get(i).getNumero());
				
				
										        
			}				
				
		
			return pessoas;
	}	
		public List<Pessoa> editarPessoa(List<Pessoa> pessoas ) {
			Pessoa pessoa = new Pessoa();
			ListarPessoas(pessoas);
			
			if(pessoas.isEmpty()) {
				return null;
				
			}
			
			System.out.println("Informe o Id da pessoa para editar: ");
			int idPessoa = tec.nextInt() - 1;
			 
			System.out.println("1) Nome da Pessoa: ");
			System.out.println("2) Ano de Nascimento: ");
			System.out.print("3)  Altura: ");
			
			System.out.println("Informe o campo para ser editado: ");
			int Opcao = tec.nextInt();
			
			switch (Opcao) {
			case 1:
				
				System.out.println("--- EDITAR O NOME  ---");
				System.out.println("Informe o novo nome: ");
				pessoa.setNome(tec.next());
				 
				
				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
				pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
				pessoa.setUf(pessoas.get(idPessoa).getUf());
				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
				
				
				break;
				
				
				
			case 2:
				System.out.println("---  EDITAR O ANO DE NASCIMENTO ---");
				System.out.println("Informe o novo ano de nascimento: ");
				pessoa.setAnoDeNascimento(tec.nextInt());
				
				pessoa.setNome(pessoas.get(idPessoa).getNome());
				pessoa.setAltura(pessoas.get(idPessoa).getAltura());
				pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
				pessoa.setUf(pessoas.get(idPessoa).getUf());
				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
				
				
				break;
				
			case 3:
				System.out.println("--- EDITAR A ALTURA  ---");
				System.out.println("Informe uma nova altura: ");
				pessoa.setAltura(tec.nextDouble());
				
				pessoa.setNome(pessoas.get(idPessoa).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
				pessoa.setUf(pessoas.get(idPessoa).getUf());
				pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
				pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
				pessoa.setNumero(pessoas.get(idPessoa).getNumero());
				
				
				
				break;
				
			
			default: 
				System.out.println("opção inválida!");
				break;
			}
			
			pessoas.set(idPessoa,pessoa);
		
			return pessoas;
			
		}
		
		public void excluirPessoa(List<Pessoa> pessoas) {
			ListarPessoas(pessoas);
			if(pessoas.isEmpty()) {
				return;
				
			}
			
			System.out.println("--- EXCLUIR PESSOA ---");
			System.out.println("Informe o Id da pessoa para excluir:");
			int idPessoa = tec.nextInt() -1;
			
			if(pessoas.size() <= idPessoa) {
				
				System.out.println("Produto não cadastrado.");
				return;
			}
			pessoas.remove(idPessoa);
		}
		
	
	}				
		




