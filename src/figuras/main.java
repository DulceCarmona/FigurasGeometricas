package figuras;

public class main {

	public static void main(String[] args) {
	    Triangulo t = new Triangulo(5, 3, 5, 5, 5);
	    System.out.println("Área: " + t.calcularArea());
	    System.out.println("Perímetro: " + t.calcularPerimetro());
	}
}