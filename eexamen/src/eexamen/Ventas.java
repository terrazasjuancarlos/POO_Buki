package eexamen;

public class Ventas {
	private int Dulses;
	private int Abarrotes;
	private int	Lacteos;
	private int Bebidas;

	public Ventas(){
		
	}
	
	public Ventas(int dulses, int abarrotes, int lacteos, int bebidas) {
		super();
		Dulses = dulses;
		Abarrotes = abarrotes;
		Lacteos = lacteos;
		Bebidas = bebidas;
	}

	@Override
	public String toString() {
		return Dulses+"\t"+Abarrotes+"\t"+Lacteos+"\t"+Bebidas;
	}

	public int getDulses() {
		return Dulses;
	}
	public void setDulses(int dulses) {
		Dulses = dulses;
	}
	public int getAbarrotes() {
		return Abarrotes;
	}
	public void setAbarrotes(int abarrotes) {
		Abarrotes = abarrotes;
	}
	public int getLacteos() {
		return Lacteos;
	}
	public void setLacteos(int lacteos) {
		Lacteos = lacteos;
	}
	public int getBebidas() {
		return Bebidas;
	}
	public void setBebidas(int bebidas) {
		Bebidas = bebidas;
	}
	
	
	
	
	
	
	
	
	
	
}
