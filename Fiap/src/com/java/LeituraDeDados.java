package com.java;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// para pegar dados
		//ctrl espaço faz o import
		
		int nota =0;
		
		System.out.print("Digite o nome do aluno: ");
		String nome = sc.next();
		//next vai receber uma string, não captura as demais strings
		//nextLine captura uma frase toda
		
		System.out.print("Digite a nota do aluno: ");
		nota = sc.nextInt();
		
		if (nota <= 3) {
			System.out.println("Aluno reprovado");
		} else if (nota > 3 && nota < 7) {
			System.out.println("Aluno de recuperação");
		} else {
			System.out.println("Aluno aprovado!");
		}
	}
}
