package p11;

public class Figura {
	private String Nombre;
	private char Relleno;

	public Figura() {
	}
	public Figura(String Nom, char Re) {
		super();

		Nombre = Nom;
		Relleno = Re;

	}
	public String ToString() {
		return "\t" + Nombre + "\t" + Relleno;
	}
	public void Dibujar() 
	{
		char Re=super.getRelleno();
		for (int R = 0; R < array.length; R++) 
		{
			for (int C = 0; C < array.length; C++) 
			{
				if (R == 1||R == Lado||C == Lado||C == 1) 
				
						System.out.println(Re+" ");
				else
						System.out.println(" ");
				
			}
			System.out.println(" ");
		}
	}



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
