package atividades;

import javax.swing.JOptionPane;

public class MainCirculo {

	public static void main(String[] args) {
		String inputRaio = JOptionPane.showInputDialog("Digite o raio: ");
		double raio = Double.parseDouble(inputRaio);

		Circulo circulo = new Circulo(raio);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		
		JOptionPane.showMessageDialog(null, "A área do circulo é: " + circulo.getArea(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O perímetro do circulo é: " + String.format("%.2f", circulo.getPerimetro()), "Resultado ", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
