package fecha;

public class Fecha {
	private int Dia;
	private int Mes;
	private int Año;
	
	public Fecha() {
		
	}

	public Fecha(int dia, int mes,int año) 
	{
		super();
		Dia=dia;
		Mes=mes;
		Año=año;
		
	}
	public boolean fechaCorrecta() {
	if(Mes>=1 && Mes<=12 )
		
		if (Dia >= 1 && Dia <= diasEnMes(Mes))
			{
				return true;
			}
		return false;
	}
	
	private boolean esBisiesto() {
		return (Año % 4== 0);
	}
	
	private int diasEnMes(int Mes) {
		int[]diasPorMes = {0,31,28,31 ,30,31,30,31,31,30,31,30,31};
		
		if (Mes==2 && esBisiesto()) 
		{
			return 29;
		}
		return diasPorMes[Mes];
	}
	
	public String Tostring() {
		return String.format("%02d-%02d-%d",Dia,Mes,Año);
	}
	
	public void DiaSiguiente() {
		if(fechaCorrecta()) {
			Dia++;
			if(Dia > diasEnMes (Mes)) 
			{
				Dia=1;
				Mes++;
				if(Mes>12){
					Mes=1;
					Año++;
				}
			}
		}
	}

}
