package com.java;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal ();
		animal.setAlimentar("Todo animal se alimenta");
		animal.setLocomover("Todo animal se locomove");
		
		Gato gato = new Gato();
		gato.setAlimentar("Gato come ra��o");
		gato.setLocomover("Gatos tem 4 patas");
		gato.setMiar("Gatos miam quando querem se comunicar com humanos e entre eles");
		
		
		// s� consigo acessar os m�todos da superclasse, a vari�vel de controle n�o possui as informa��es sobre Miar
		Animal gatoSiames = new Gato();
		gatoSiames.setAlimentar("S�o exigentes na alimenta��o");
		gatoSiames.setLocomover("se locomovem lindamente!");
		

	}

}
