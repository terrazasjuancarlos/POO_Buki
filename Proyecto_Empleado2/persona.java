package Proyecto_Empleado2;

public abstract class Persona {
	public String Nombre;
	public int Edad;
	public char Genero;
	
	
	
	
	public Persona(String nombre, int edad, char genero) {
		super();
		Nombre = nombre;
		Edad = edad;
		Genero = genero;
	}

	public boolean generoValido() {
        return Genero == 'M' || Genero == 'F';
    }
	
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", Genero=" + Genero + "]";
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public char getGenero() {
		return Genero;
	}
	public void setGenero(char genero) {
		Genero = genero;
	}
	
	
}

