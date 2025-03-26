package establo;

public class vaca extends rancho {
	private int tipo ;
	private int variante; 
	private int litros ;
	
	public vaca(){
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getVariante() {
		return variante;
	}

	public void setVariante(int variante) {
		this.variante = variante;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "vaca [tipo=" + tipo + ", variante=" + variante + ", litros=" + litros + "]";
	}
	
	
}
