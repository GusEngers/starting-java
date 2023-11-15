public class Figuras {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(2.0, 3.0);
		Triangulo t2 = new Triangulo(4.0, 7.0);

		System.out.println("Area - Triangulo");
		System.out.println(t1.area());
		System.out.println(t2.area());

		Rectangulo r1 = new Rectangulo(2.0, 3.0);
		Rectangulo r2 = new Rectangulo(4.0, 7.0);

		System.out.println("Area - Rectangulo");
		System.out.println(r1.area());
		System.out.println(r2.area());

		System.out.println("Perimetro - Rectangulo");
		System.out.println(r1.perimetro());
		System.out.println(r2.perimetro());
	}
}

// POO - Class
class Triangulo {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return (base * altura) / 2;
	}
}

// POO - Class + Interface
interface Figura {
	public double area();
	public double perimetro();
}

class Rectangulo implements Figura {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return Math.pow(base, 2) + Math.pow(altura, 2);
	}
}