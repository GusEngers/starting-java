public class Figuras {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(2.0, 3.0);
		Triangulo t2 = new Triangulo(4.0, 7.0);

		t1.area();
		t2.area();
	}
}

class Triangulo {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public void area() {
		double total = (base * altura) / 2;
		System.out.println(total);
	}
}
