package alumnos_herencia;

public class Persona {
	
	private String Genero;
	private char Nombre;
	
	public Persona(){
		
	}
	
	public Persona(String Gen, char Nom) {
		super();
		Genero = Gen;
		Nombre = Nom;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public char getNombre() {
		return Nombre;
	}

	public void setNombre(char nombre) {
		Nombre = nombre;
	}
	
	
}
