package com.java;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal ();
		animal.setAlimentar("Todo animal se alimenta");
		animal.setLocomover("Todo animal se locomove");
		
		Gato gato = new Gato();
		gato.setAlimentar("Gato come ração");
		gato.setLocomover("Gatos tem 4 patas");
		gato.setMiar("Gatos miam quando querem se comunicar com humanos e entre eles");
		
		
		// só consigo acessar os métodos da superclasse, a variável de controle não possui as informações sobre Miar
		Animal gatoSiames = new Gato();
		gatoSiames.setAlimentar("São exigentes na alimentação");
		gatoSiames.setLocomover("se locomovem lindamente!");
		

	}

}
