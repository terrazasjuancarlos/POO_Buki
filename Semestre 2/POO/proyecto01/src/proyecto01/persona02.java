package proyecto01;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthStyle;

public class persona02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] Lista =new Persona [5];
		
		LeeDatos(Lista);

	}
	
	
	public static void LeeDatos(Persona P[] ) {
		
		String Nom; 
		int Edad ;
		char Genero ;
		for (int p = 0; p < P.length; p++) {
			System.out.println("Nombre ?: ");
			Nom =Leer.dato();
			System.out.println("Edad ?: ");
			Edad =Leer.datoInt();
			do{
				System.out.println("Genero (H=masculino . M=femenino) ?: ");
				Genero =Leer.datochar();
				

			}

		}

	}

}
