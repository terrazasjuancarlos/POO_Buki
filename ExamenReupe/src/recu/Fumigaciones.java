package recu;

public class Fumigaciones {
	private int T1;
	private int T2;
	private int T3;
	private int T4;
	private int Granjeros;
	private int CostoTotal=0;
	
	
	public Fumigaciones() {
		
	}


	public int getT1() {
		return T1;
	}


	public void setT1(int t1) {
		T1 = t1;
	}


	public int getT2() {
		return T2;
	}


	public void setT2(int t2) {
		T2 = t2;
	}


	public int getT3() {
		return T3;
	}


	public void setT3(int t3) {
		T3 = t3;
	}


	public int getT4() {
		return T4;
	}


	public void setT4(int t4) {
		T4 = t4;
	}


	public int getGranjeros() {
		return Granjeros;
	}


	public void setGranjeros(int granjeros) {
		Granjeros = granjeros;
	}


	public int getCostoTotal() {
		return CostoTotal;
	}


	public void setCostoTotal(int costoTotal) {
		CostoTotal = costoTotal;
	}


	@Override
	public String toString() {
		return "Fumigaciones [T1=" + T1 + ", T2=" + T2 + ", T3=" + T3 + ", T4=" + T4 + ", Granjeros=" + Granjeros
				+ ", CostoTotal=" + CostoTotal + "]";
	}

	
		
}
