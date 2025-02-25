package Herencia11;

public class Cuadrado  extends Figura{
	
	private int Lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(int lado) {
		super();
		Lado = lado;
	}

	public Cuadrado(String nombre, int grosor_nombre, char relleno) {
		super(nombre, grosor_nombre, relleno);
		// TODO Auto-generated constructor stub
	}

	public int getLado() {
		return Lado;
	}

	public void setLado(int lado) {
		Lado = lado;
	}

	@Override
	public String toString() {  
		return super.+"\t"
	}
	
	
	
	
}
