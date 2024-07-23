package atividades;

import java.util.Scanner;

public class LocalizaNumero {

	// Corrigir este algoritmo.
		public static void main(String[] args) {
			int vetor[] = {1,2,3,4,5,6,7,8,9,10};
			int numero;
			int index = 0;
			boolean achou = false;
			
			System.out.print("Digite um número: ");
			Scanner teclado = new Scanner(System.in);
			numero = teclado.nextInt();
			
			for (int i=0; i<10; i++) {
				if (vetor[i] == numero){
					achou = true;
					index = i;
			    }
			}
			if (achou) {
		        System.out.println("Achei");
		        System.out.printf("O número %d está localizado no índice %d.",  numero, index);			
			}else {
		        System.out.printf("Não existe o número %d dentro do vetor.", numero);	
			}
		}

}
