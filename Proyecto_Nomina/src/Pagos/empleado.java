package Pagos;

public class empleado 
{
	private String Nombre;
	private char Genero;
	int HorasT,SueldoH,PagoTotal;

	public empleado()
	{
		
	}
	
	public empleado( String nombre,char genero,int horasT,int sueldoH )
	{
		Nombre=nombre;
		Genero=genero;
		SueldoH=sueldoH;
		HorasT=horasT;
		PagoTotal=0;
	}
	public String ToString()
	{
		 String Gen="Femenino";
		 if (Genero=='M') 
		 {
			Gen="masculino";
			
		 }
		 return Nombre+("\t"+Gen+"\t"+HorasT+"\t"+SueldoH);
	}
	public String ImpPago() 
	{
		
	}
	public static void Altas(Empleado [] E)
	
	{
	strin [] VecNom"";
	char Gen=0;
	int Horas=0, Pago=0;
	
	}
}
