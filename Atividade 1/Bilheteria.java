package atividades;

import java.util.Scanner;

public class Bilheteria {

	public static void main(String[] args) {
		
		int bilheteA;
		int bilheteB;
		int bilheteC;
		int valorTotal = 0;
		
		System.out.print("Digite quantos bilhetes A foram vendidos: ");
		Scanner teclado = new Scanner(System.in);
		bilheteA = teclado.nextInt();
		System.out.print("Digite quantos bilhetes B foram vendidos: ");
		bilheteB = teclado.nextInt();
		System.out.print("Digite quantos bilhetes C foram vendidos: ");
		bilheteC = teclado.nextInt();
		
		valorTotal = (bilheteA * 50) + (bilheteB * 30) + (bilheteC * 20);
		
		System.out.printf("A renda gerada foi de R$ %d.",  valorTotal);

	}

}
