/**
 * Cada archivo con extensión `.java` debe tener una clase pública defnida
 * con el mismo nombre que el archivo.
 * Cada clase puede contener uno o más métodos y en dichos métodos estarán las
 * sentencias que se ejecutarán.
 */
public class Demo {
	/**
	 * Cada clase pública a su vez debe tener un método estático especial llamado `main`.
	 * En este método es donde nuestro programa comienza a ejecutarse.
	 */
	public static void main(String[] args) {
		/**
		 * Dentro de el método `main` (o cualquier método) podemos realizar una variedad
		 * de cosas:
		 */

		// Declaraciones, asignaciones y llamadas de métodos
		int num = 32;
		String name = "Fulano";
		num = num * 5;
		System.out.println("La variable 'num' tiene un valor de: " + num);
		double random = Math.random();
		System.out.println("Número random: " + random);

		// Bucles `while` y `for`
		int count = 10;
		System.out.println("Cuenta regresiva");
		while(count >= 0) {
			System.out.println(count);
			count--;
		}

		System.out.println("\nDe 0 a 10");
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

		// Ramificación `if/else`
		int value = (int)(num / random);
		if (value % 2 == 0) {
			System.out.println("\n" + value + " es un número PAR");
		} else {
			System.out.println("\n" + value + " es un número IMPAR");
		}
	}
}

/**
 * Datos adicionales:
 * * Todas las sentencias deben terminar con un punto y coma (`;`), excepto el cierre de llaves (`}`)
 * * Las declaraciones de variables deben tener un nombre y un tipo
 * * Los métodos y las clases se definen con un par de llaves (`{}`)
 * * El operador de asignación es un signo igual (`=`)
 * * El operador de igualdad es un doble signo igual (`==`)
 */