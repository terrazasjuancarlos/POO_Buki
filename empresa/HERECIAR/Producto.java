package HERECIAR;

public class Producto {
	private string FechaC;
	private string Pais;
	private string FechaS;
	
	public Producto(string fechaC, string pais, string fechaS, int lote) {
		FechaC = fechaC;
		Pais = pais;
		FechaS = fechaS;
		this.lote = lote;
	}

	private int lote;
	
	public Producto(){
		
	}

	public string getFechaC() {
		return FechaC;
	}

	@Override
	public String toString() {
		return "Producto [lote=" + lote + "]";
	}

	public void setFechaC(string fechaC) {
		FechaC = fechaC;
	}

	public string getPais() {
		return Pais;
	}

	public void setPais(string pais) {
		Pais = pais;
	}

	public string getFechaS() {
		return FechaS;
	}

	public void setFechaS(string fechaS) {
		FechaS = fechaS;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}
	
}
