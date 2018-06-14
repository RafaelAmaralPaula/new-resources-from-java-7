package com.lovelacetecnologia.parte4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Informe seu nome :");
			String nome = teclado.nextLine();
			System.out.println(nome);

			System.out.println("Informe sua Idade :");
			String idade = teclado.nextLine();

			try {

				SalvarAluno.salvar(nome, idade);
			} catch (NegocioException | NumberFormatException e) {
				System.err.println("Impossivel erro !");

			}

		}

	}
}
