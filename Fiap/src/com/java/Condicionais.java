package com.java;

public class Condicionais {

	public static void main(String[] args) {
		// if else
		//bloco de instrução = abrir e fechar a chave
		int temperatura = 40;

		if (temperatura < 38 && temperatura >= 35 ) {
			System.out.println("Sem febre! Temperatura normal");
		} else if (temperatura >38) {
			System.out.println("Febre!");
		} else {
			System.out.println("Hipotermia...");
		}
	}
}
