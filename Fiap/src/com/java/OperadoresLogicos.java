package com.java;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//and && or || 

		int idade = 20;
		boolean precisaVotar = idade >= 18 || idade >= 70;
		System.out.println("precisa votar tendo " +idade +precisaVotar);

		int nrAmarelo = 0, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println("O jogador está suspenso? " +suspenso);

		//or exclusivo, XOR, quando um ou outro for exclusivamente verdadeiro, somente uma das comparações for verdadeira
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println("somente uma expressão é verdadeira? " +teste);

		//not, negar, representada pelo !
		int age = 56;
		boolean idoso = !(age <= 60);
		System.out.println("a pessoa é idosa? " +idoso);

	}

}
