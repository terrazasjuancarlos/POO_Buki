package Herencia11;

public class Figura {
	
	private String Nombre;
	private int Grosor_Borde;
	private char Relleno;
	
	public Figura()
	{
		
	}

	public Figura(String nombre, int grosor_borde, char relleno) {
		super();
		Nombre = nombre;
		Grosor_Borde = grosor_borde;
		Relleno = relleno;
	}
 
	@Override
	public String toString() {
		return "Figura [Nombre=" + Nombre + ", Grosor_Borde =" + Grosor_Borde + ", Relleno=" + Relleno + "]";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getGrosor_Borde() {
		return Grosor_Borde;
	}

	public void setGrosor_Borde(int grosor_borde) {
		Grosor_Borde = grosor_borde;
	}

	public char getRelleno() {
		return Relleno;
	}

	public void setRelleno(char relleno) {
		Relleno = relleno;
	}


	
	
}
