# SER EL COMPILADOR

Cada uno de los siguientes ejemplos representa un archivo fuente completo.

Nuestro trabajo es hacer de compilador y determinar si cada uno de estos archivos compilará. Si no compilarán ¿Cómo arreglarlos?

- A
	```java
	class Exercise1b {
		public static void main(String[] args) {
			int x = 1;
			while ( x < 10 ) {
				if ( x > 3 ) {
					System.out.println("big x");
				}
			}
		}
	}
	```
	_El archivo compilará pero el fragmento de código está generando un bucle infinito y no podremos ejecutarlo. Para solucionarlo debemos añadir una sentencia que aumente el valor de `x` hasta que rompa el bucle._

- B
	```java
	public static void main(String[] args) {
		int x = 5;
		while ( x > 1 ) {
			x = x - 1;
			if ( x < 3 ) {
				System.out.println("small x");
			}
		}
	}
	```
	_No compilará porque el método `main` debe estar dentro de una clase, y su solución es añadir este fragmento de código dentro de una clase._

- C
	```java
	class Exercise1b {
		int x = 5;
		while ( x > 1 ) {
			x = x - 1;
			if ( x < 3 ) {
				System.out.println("small x");
			}
		}
	}
	```
	_Corrección: El fragmento no estaba dentro de un método `main`._