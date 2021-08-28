package com.java;

public class IncrementoDecremento {

	public static void main(String[] args) {
		 int x = 10;
		 x = x + 1;
		 System.out.println("x = x + 1 é igual a " + x);
		 
		 x++;
		System.out.println("x++ é igual a " + x);
		
		x--;
		System.out.println("x = " + x);
		
		//também podemos usar antes da variável
		int y = 10;
		++y;
		System.out.println("y = " + y);
		
		--y;
		System.out.println("y = " + y);
		
		//variaveis podem ser criadas na mesma linha
		int z = 10, w = 5, a = 5;
		
		z = w++;
		System.out.println("z = w++ " + z);
		//z recebe o valor de w e w recebe o incremento
		System.out.println("w = " + w);
		
		
		z = --a;
		//variavel alterada
		System.out.println("z = --a " + z);
		System.out.println("a = " + a);
				
	}

}
