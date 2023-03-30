package ejercicio_GIT;

public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	
	Alumno (String a, String b, String c) {
		nombre = a;
		apellido = b;
		dni = c;
	}

	
	@Override
	public String toString() {
		return "------------------------\nNombre=" + nombre + "\nApellido=" + apellido + "\nDni=" + dni;
	}


	
}
