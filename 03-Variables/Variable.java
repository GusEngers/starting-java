public class Variable {
	// Variables de instancia
	private String nombre;
	public double flotante;
	protected int numero;

	// Variables de clase
	static String texto = "Lorem ipsum dolor sit"; // Se podrán modificar
	final static double PI = 2.14159; // No se podrán modificar

	//                              Variables de parámetros
	//                                        |
	//                        ________________|_____________
	//                        ↓               ↓            ↓
	public Variable (String nombre, double flotante, int numero) {
		this.nombre = nombre;
		this.flotante = flotante;
		this.numero = numero;
	}

	public static void main(String[] args) {
		Variable var1 = new Variable("Fulano", 5.34, 10);
		System.out.println("Usando variable de instancia");
		System.out.println(var1.flotante);
		System.out.println();

		System.out.println("Usando variable estática de clase sin instanciar");
		System.out.println(Variable.texto);
		System.out.println();

		System.out.println("Obteniendo valor de una variable local");
		System.out.println(var1.realizarOperacion(3.54, 6.12));
		System.out.println();
	}

	public double realizarOperacion(double primero, double segundo) {
		// Variables locales
		double resultado = primero + segundo;
		return resultado;
	}
}