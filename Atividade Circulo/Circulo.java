package atividades;

public class Circulo {
	  private double raio;
	  private double area;
	  private double perimetro;
	  
	  public Circulo() {};
	  
	  public Circulo(double raio) {
		  this.raio = raio;
	  }
	  public void calcularArea() {
	        this.area = 3.14 * raio * raio;
	  }
	    
	  public void calcularPerimetro() {
	        this.perimetro = 2 * 3.14 * raio;
	  }

		public double getRaio() {
			return raio;
		}
	
		public void setRaio(double raio) {
			this.raio = raio;
		}
	
		public double getArea() {
			return area;
		}
	
		public void setArea(double area) {
			this.area = area;
		}
	
		public double getPerimetro() {
			return perimetro;
		}
	
		public void setPerimetro(double perimetro) {
			this.perimetro = perimetro;
		}
	  
}
