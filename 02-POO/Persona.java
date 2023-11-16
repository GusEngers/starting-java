public class Persona {
	protected String nombre;
	protected String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public static void main(String[] args) {
		Persona persona = new Persona("Fulano", "de Tal");
		System.out.println("Usando el método nombreCompleto de la clase Persona");
		System.out.println(persona.nombreCompleto());
		System.out.println();

		Profesion profesion = new Profesion("Fulano", "de Tal", "Arquitecto");
		System.out.println("Usando el método nombreCompleto de la clase Profesion que hereda de Persona");
		System.out.println(profesion.nombreCompleto());
		System.out.println();
	}
}

class Profesion extends Persona {
	private String profesion;
	private String prefijo;

	public Profesion (String nombre, String apellido, String profesion) {
		super(nombre, apellido);
		this.profesion = profesion;
		// `substring` sirve para obtener una parte de un string
		this.prefijo = this.profesion.substring(0, 3) + ".";
	}

	public String nombreCompleto() {
		return this.prefijo + " " + this.nombre + " " + this.apellido;
	}
}