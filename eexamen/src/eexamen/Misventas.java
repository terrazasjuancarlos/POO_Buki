package eexamen;

public class Misventas {
	
	public static void MenorAba() {
		int Ven=0 , Men=10000, Pos=0  ;
		for (int i = 0; i < V.length; i++) 
		{ 
			 Ven=V[i].getAbarrotes();
			 if (Ven<Men) 
			 {
				Men=Ven;
				i=Pos;
			 } 
			
		}
		System.out.println("---------------------------------");
		System.out.println("La venta mas baja fue en el mes "+(Pos+1));
		System.out.println("---------------------------------");
	}  
	public static void Promedio (Ventas[]V) 
	{
		int suma=0, prom=0;
		for (int i = 0; i < V.length; i++) 
		{
			suma = suma+V[i].getBebidas() ;
			
		}
		prom=suma/12;
		System.out.println("---------------------------------");
		System.out.println("promedio de ventas de bebidas "+(prom));
		System.out.println("---------------------------------");

	}
	public static void MasBebidas(Ventas[]V) 
	{
		int  Ven=0, May=0,Pos=0;
		for (int i = 0; i < V.length; i++) 
		{
			Ven=V[i].getLacteos();
			 if (Ven<May) 
			 {
				 May=Ven;
				Pos=i;
			 } 		
		}
		System.out.println("---------------------------------");
		System.out.println("La venta mas baja fue en el mes "+(Pos+1));
		System.out.println("---------------------------------");

	}
	
	public static void VentasBajas(Ventas [] V) 
	{
		int D=V[7].getDulses(), A=V[7].getAbarrotes(), B=V[7].getBebidas(),L=V[7].getLacteos(),
		String Depa='';
		if(D<A && D<B && D<L) Depa="Dulses";
		if(A<D && A<B && A<L) Depa="Abarrotes";
		if(B<A && D<B && B<L) Depa="Bebidas";
		if(L<A && L<B && L<D) Depa="Lacteos";
	
		System.out.println("---------------------------------");
		System.out.println("Las ventas mas bjas en agosto son de "+(Depa));
		System.out.println("---------------------------------");

	
	}

	public static void VentasAltas(Ventas[]V) 
	{
		int D=V[7].getDulses(),A=V[7].getAbarrotes(),B=V[7].getBebidas(),L=V[7].getLacteos(),
		String Depa = '';
		if(D>A && D>B && D>L) Depa="Dulses";
		if(A>D && A>B && A>L) Depa="Abarrotes";
		if(B>A && B>D && B>L) Depa="Bebidas";
		if(L>A && L>B && L>D) Depa="Lacteos";
		
		System.out.println("---------------------------------");
		System.out.println("Las ventas mas Altas en agosto son de "+(Depa));
		System.out.println("---------------------------------");

	
	}
	public static Void main(String[] arg) 
	{
		Ventas [] Ven=new Ventas[12];
		Datos(Ven);
		MenorAba(Ven);
		Promedio(Ven);
		VentasBajas(Ven);
	}
	
}
