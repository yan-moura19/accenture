package atividades;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		String[][] tabuleiro = { 
				{" "," "," "},
				{" "," "," "},
				{" "," "," "}};
		Scanner scanner = new Scanner(System.in);
		int jogador = 1;
		Boolean continua = true;
		
		do {		
			
			imprimeTabuleiro(tabuleiro);
			String inputLinha = JOptionPane.showInputDialog(null, "Jogador " + jogador + " digite a posição na linha:");
	        int i = Integer.parseInt(inputLinha); 
	        
	        
	        String inputColuna = JOptionPane.showInputDialog(null, "Jogador " + jogador + " digite a posição na coluna:");
	        int j = Integer.parseInt(inputColuna);
	        
            
            
            if(tabuleiro[i][j] != " ") {
            	System.out.println("Posição já ocupada. Tente novamente.");
            }else {
            	tabuleiro[i][j] = (jogador == 1)? "O":"X";
            	
            	if (verificaGanhador(tabuleiro, (jogador == 1) ? "O":"X")) {
                    
                    imprimeTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogador + " venceu!");
                    continua = false;
                    
                }else {
                	jogador = (jogador == 1)? 2 : 1;
                }
            	
            }
            
            
            
		} while (continua);
		scanner.close();
		

	}
	public static void imprimeTabuleiro(String[][] tabuleiro2) {
		System.out.print("\n\n 0   1    2\n\n");
		for (int posicao1 = 0; posicao1 < 3; posicao1++) {
			for (int posicao2 = 0; posicao2 < 3; posicao2++) {
				System.out.print(" " + tabuleiro2[posicao1][posicao2]);
				if (posicao2 < 2) {
					System.out.print(" | ");
				}
				if (posicao2 == 2) {
					System.out.print("  " + posicao1);
				}
			}
			if (posicao1 < 2) {
				System.out.print("\n------------");
			}
			System.out.println("\n");
		}
	}
	public static boolean verificaGanhador(String[][] tabuleiro, String simbolo) {
		for (int i = 0; i < 3; i++) {
	        if (tabuleiro[i][0].equals(simbolo) &&
	            tabuleiro[i][1].equals(simbolo) &&
	            tabuleiro[i][2].equals(simbolo)) {
	            return true;
	        }
	    }

	    for (int j = 0; j < 3; j++) {
	        if (tabuleiro[0][j].equals(simbolo) &&
	            tabuleiro[1][j].equals(simbolo) &&
	            tabuleiro[2][j].equals(simbolo)) {
	            return true;
	        }
	    }

	  
	    if (tabuleiro[0][0].equals(simbolo) &&
	        tabuleiro[1][1].equals(simbolo) &&
	        tabuleiro[2][2].equals(simbolo)) {
	        return true;
	    }

	    
	    if (tabuleiro[0][2].equals(simbolo) &&
	        tabuleiro[1][1].equals(simbolo) &&
	        tabuleiro[2][0].equals(simbolo)) {
	        return true;
	    }

	    return false;
    }

}
