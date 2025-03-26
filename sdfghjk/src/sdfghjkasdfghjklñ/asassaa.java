package sdfghjkasdfghjklñ;

import java.util.Iterator;

public class asassaa {
	private int num = 0;
	private int invertido = 0;
	private int resultado = 0;
	private int residuo = 0;

	public static void main(String[] args) 
	{
		
		System.out.println("ingrese un numero");

		Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
			do 
			{ resultado=num/10;
			  residuo = num %10;
			  invertido=invertido+residuo;
			  num=resultado;
			  System.out.println(invertido);
			while (resultado == 0);

		}
		
			
	}

}
