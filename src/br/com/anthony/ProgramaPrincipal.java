package br.com.anthony;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Pessoa aluno1 = new Pessoa();
		
		aluno1.setNome("Anthony");
		aluno1.setAnoDeNascimento(2004);
		aluno1.setSexo("M");
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getAnoDeNascimento());
		System.out.println(aluno1.getSexo());

	}

}
