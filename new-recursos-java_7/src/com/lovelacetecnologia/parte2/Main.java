package com.lovelacetecnologia.parte2;

public class Main {

	public static void main(String[] args) {
		
		String carro = "Audi";
	

		switch (carro) {
		case "Audi":

			System.out.println("Alemão");

			break;

		case "Ferrari":

			System.out.println("Italiano");

			break;

		case "Honda":

			System.out.println("Japão");

			break;	
			
		default:
			
			System.out.println("Não Informou nenhum carro");
			
			break;
		}

	}

}
