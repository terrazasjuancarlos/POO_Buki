package p11;

public class Figura{
	private String Nombre;
	private char Relleno;
	
	public Figura()
	{ }
	public Figura(String nombre, char relleno)
	{
		Nombre=nombre;
		Relleno=relleno;
	}
	public String ToString()
	{
		return Nombre+"\t"+Relleno;
	}
	//METODOS ABSTRACTOS
	public abstract int CalcularArea();
	public abstract int CalcularPerimetro();
	public abstract void Dibujar();
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public char getRelleno() {
		return Relleno;
	}
	public void setRelleno(char relleno) {
		Relleno = relleno;
	}

}
