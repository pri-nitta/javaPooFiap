package com.java;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int idade = 10;
		double preco = 10.0;
		char genero = 'M';
		//aspas simples, um único caractere
		boolean temFilhos = false;
		
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(genero);
		System.out.println(temFilhos);
		
		//convertendo variáveis numéricas
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		short s = 20;
		x = s;
		
		double valorDouble = 9.99;
		//cast
		
		int valorInt = (int) valorDouble;
		System.out.println(valorInt);
	
	}

}
