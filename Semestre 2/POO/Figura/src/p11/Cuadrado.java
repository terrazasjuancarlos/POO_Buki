package p11;

public class Cuadrado {

	public Cuadrado()
	{ }
	
	public Cuadrado(String nombre, int Lado)
	{
		Nombre=nombre;
		Relleno=relleno;
	}
	public String ToString()
	{
		return Nombre+"\t"+Relleno;
	}
	
	public void Dibujar()// cosa nueva echa	
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

	public Figura()
	{ }

	public Figura()
	{ }

}
