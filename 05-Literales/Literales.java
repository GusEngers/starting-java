public class Literales {
	public static void main(String[] args) {
		// LITERALES DE ENTEROS
		byte literalByte = 12;
		short literalShort = 12;
		int literalInt = 12;
		long literalLong = 12; // También podemos usar `12L` o `12l`
		int hexadecimal = 0x1a23;

		// LITERALES DE DECIMALES
		float literalFloat = 12.23F; // También puede ser `12.23f`
		double literalDouble = 12.23; // También puede ser `12.23D` o `12.23d`

		// LITERALES DE CARACTERES Y CADENAS
		// String escapado con codificación unicode
		// u00F1 es la letra "ñ"
		char letra = '\u0000';
		String pais = "Espa\u00F1a";
		System.out.println(pais);

		// LITERALES SUBRAYADOS
		long numero = 1234_5678_9101L; // El valor real sería 123456789101L
		System.out.println(numero); 
	}
}