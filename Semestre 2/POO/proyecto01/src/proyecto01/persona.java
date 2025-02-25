package proyecto01;

	public class persona{
		private String Nombre;
		private int Edad;
		private char Genero;
		
	
	
	public persona(){
		
	}
	public persona(String nombre, int edad ,char genero ){
		super();
		Nombre =nombre;
		Edad = edad;
		Genero = genero;
		
	}

	public String ToString(){
		String G="Femenino";
		if (Genero=='H')
		{
			G="Masculino";
		}
		return Nombre+"\t"+Edad+"\t"+G;
		
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