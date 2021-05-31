package br.com.anthony.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa Pessoa1 = new Pessoa();
		Pessoa Pessoa2 = new Pessoa();
		Pessoa Pessoa3 = new Pessoa();
		Pessoa Pessoa4 = new Pessoa();
		
		
		Pessoa1.setNome("Anthony");
		Pessoa1.setAnoDeNascimento(2004);
		Pessoa1.setSexo("M");
		
		Pessoa2.setNome("Jonhatam");
		Pessoa2.setAnoDeNascimento(1990);
		Pessoa2.setSexo("M");
		
		Pessoa3.setNome("Mayara");
		Pessoa3.setAnoDeNascimento(1995);
		Pessoa3.setSexo("F");
		
		Pessoa4.setNome("Livia");
		Pessoa4.setAnoDeNascimento(1990);
		Pessoa4.setSexo("F");
		
		pessoas.add(Pessoa1);
		pessoas.add(Pessoa2);
		pessoas.add(Pessoa3);
		pessoas.add(Pessoa4);
		
		System.out.println("-- PESSOAS com FOR ---");
		for(int i = 0; i < pessoas.size(); i++ ) {
			System.out.println(pessoas.get(i));
			System.out.println("#####################");
		}
		
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		for(Pessoa people : pessoas ) {
			System.out.println(people.getNome());
			System.out.println(people.getAnoDeNascimento());
			System.out.println(people.getSexo());
			System.out.println("------------------------");
	
		}
		
		System.out.println("--- PESSOAS com ForEach lambda ---");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			
		});
		
		Scanner tec = new Scanner(System.in);
		
		
		System.out.println("--- TABUADA ---");
		MetodoController metodoController = new MetodoController();
		metodoController.multiplicar();
		
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println(" A soma d�: " + metodoController.somar());
		
		System.out.println("--- SUBTRA��O DE VALORES POR PAR�METRO ---");
		System.out.println("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundpo valor: ");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtra��o d�: " + metodoController.subtrair(valor1, valor2));
				
		
	}

}
