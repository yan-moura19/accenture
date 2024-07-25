package atividades;

import javax.swing.JOptionPane;

public class MainRetangulo {

	public static void main(String[] args) {
		String inputLado1 = JOptionPane.showInputDialog("Digite o lado1 do retângulo: ");
		double lado1 = Double.parseDouble(inputLado1);
		String inputLado2 = JOptionPane.showInputDialog("Digite o lado2 do retângulo: ");
		double lado2 = Double.parseDouble(inputLado2);
		
		Retangulo retangulo = new Retangulo(lado1,lado2);
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		
		JOptionPane.showMessageDialog(null, "A área do retângulo é: " + retangulo.getArea(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O perímetro do retângulo é: " + retangulo.getPerimetro(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
