public class Primitivos {
	public static void main(String[] args) {
		// PRIMITIVOS NUMÉRICOS

		byte __byte = 0;
		System.out.println("El valor mínimo de un tipo byte es: " + ((Byte) __byte).MIN_VALUE);
		System.out.println("El valor máximo de un tipo byte es: " + ((Byte) __byte).MAX_VALUE);

		short __short = 0;
		System.out.println("El valor mínimo de un tipo short es: " + ((Short) __short).MIN_VALUE);
		System.out.println("El valor máximo de un tipo short es: " + ((Short) __short).MAX_VALUE);

		int __int = 0;
		System.out.println("El valor mínimo de un tipo int es: " + ((Integer) __int).MIN_VALUE);
		System.out.println("El valor máximo de un tipo int es: " + ((Integer) __int).MAX_VALUE);

		long __long = 0;
		System.out.println("El valor mínimo de un tipo long es: " + ((Long) __long).MIN_VALUE);
		System.out.println("El valor máximo de un tipo long es: " + ((Long) __long).MAX_VALUE);

		float __float = 0.0f;
		System.out.println("El valor mínimo de un tipo float es: " + ((Float) __float).MIN_VALUE);
		System.out.println("El valor máximo de un tipo float es: " + ((Float) __float).MAX_VALUE);

		double __double = 0.0;
		System.out.println("El valor mínimo de un tipo double es: " + ((Double) __double).MIN_VALUE);
		System.out.println("El valor máximo de un tipo double es: " + ((Double) __double).MAX_VALUE);
	}

	// PRIMITIVO BOOLEANO
	boolean verdadero = true;
	boolean falso = false;

	// PRIMITIVO CHAR
	// Tipo de dato que representa un carácter Unicode sencillo de 6 bits
	char caracter;

	// TIPO DE DATO STRING
	// El tipo de dato String no es un primitivo en sí, pero su uso es igual de importante que los primitivos anteriores
	String text = "Lorem ipsum dolor sit";
}