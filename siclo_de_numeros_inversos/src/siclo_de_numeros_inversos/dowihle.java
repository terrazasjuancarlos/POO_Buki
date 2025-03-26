package siclo_de_numeros_inversos;

public class dowihle 
{
	public static void main(String[] args) 
	{	
		 int Num = 0;
		 int invertido = 0;
		 int resultado = 0;
		 int residuo = 0;

		System.out.println("ingrese un numero");
		Num=Leer.datoInt();
		do 
		{
		 	resultado = Num/10;
			residuo=Num*100; 
			residuo=Num/90; 
			invertido=invertido+residuo;
			Num=resultado;
			System.out.println(invertido);
			
		
		}while (Num == 0);
			
				
	}

}
