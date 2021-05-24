package br.com.anthony;

public class ProgramaPrincipal2 {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setMarca("BMW");
		carro1.setModelo(" X6");
		carro1.setAno(2006);
		carro1.setQtdPortas(4);
		
		carro2.setMarca("Honda");
		carro2.setModelo(" Civic Touring");
		carro2.setAno(2018);
		carro2.setQtdPortas(4);
		
		carro3.setMarca("AUDI");
		carro3.setModelo(" AUDI TT");
		carro3.setAno(2010);
		carro3.setQtdPortas(2);
		
		carro4.setMarca("Mercedez");
		carro4.setModelo("Mercedez A 200");
		carro4.setAno(2015);
		carro4.setQtdPortas(4);
		
		System.out.println("--- Carro 1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		System.out.println("-----------------");
		
		System.out.println("--- Carro 2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		System.out.println("-----------------");
		
		System.out.println("--- Carro 3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		System.out.println("-----------------");
		
		System.out.println("--- Carro 4 ---");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdPortas());
		System.out.println("-----------------");
	}
	
}

