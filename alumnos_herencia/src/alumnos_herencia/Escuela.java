package alumnos_herencia;

import java.util.Iterator;

public class Escuela {

	public static void Dato(Alumno[] Alu)
	{
		String[] Nombre = { "Juana ", "pablo", "hector", "eustaquio", "Checa", "Alberto", "Placido ", "Oriol","Padron ", "Jose  ", "Olatz  ", "Gonzales ", "Peñalver ", "Bautista" };
		char[] Genero = { 'M', 'H', 'H'w, 'H', 'H', 'H', 'H', 'H', 'M', 'H', 'M', 'H', 'H', 'H', 'H', 'M', 'H', 'H', 'M','M', 'M', 'H', 'M', 'M', 'M' };
		int C1 = 0, C2 = 0, C3 = 0, C4 = 0;
		String NC = "0", Nom = "";		
		String Gen = "O", Carr = "O";

			for (int j = 0; j < Alu.length; j++) 
			{
				int R = (int) (Math.random() * 100) + 1000;
				NC = "2417"+R;
					if (Carrera() == 1) 
					{
						Carr = "S";
					} 
					else
					 (Carrera() == 0) 
					{
						Carr = "T";
					} 
						
					
				int Pos = Genera();
				Nom = Nombre[Pos];
				C1 = (int) (Math.random() * 41) + 61;
				C2 = (int) (Math.random() * 41) + 61;
				C3 = (int) (Math.random() * 41) + 61;
				C4 = (int) (Math.random() * 41) + 61;
				Alu[j]= new Alumno(Nom,Gen,NC,Carr,C1,C2,C3,C4);
				System.out.println("---------------------------------");
			} 	
	}

	public static void Genero(Alumno[] Alu) {
		System.out.println("---------------------------------");
		System.out.println("listado de alumnAs F");
		System.out.println("---------------------------------");
		for (int j = 0; j < Alu.length; j++) {
			if (Alu[j].getGenero() == "F") {

				System.out.println(Alu[j].toString());
			}
		}
		System.out.println("---------------------------------");
		System.out.println("listado de alumnOs M");
		System.out.println("---------------------------------");

		for (int j = 0; j < Alu.length; j++) {
			if (Alu[j].getGenero() == "M") {

				System.out.println(Alu[j].toString());
			}
		}
		System.out.println("---------------------------------");
	}

	public static void Promedio(Alumno[] Alu) {
		int Prom = 0, C1 = 0, C2 = 0, C3 = 0, C4 = 0;
		System.out.println("\tCalcula Promedios");
		System.out.println("---------------------------------");
		for (int j = 0; j < Alu.length; j++) {
			C1 = Alu[j].getCali();
			C2 = Alu[j].getCali2();
			C3 = Alu[j].getCali3();
			C4 = Alu[j].getCali4();

			Prom = (C1 + C2 + C3 + C4) / 4;
			Alu[j].setPromedio(Prom);
			System.out.println(Alu[j].getNombre() + "\t" + Alu[j].getPromedio() + "\t" + Alu[j].getCarrera());
		}
		System.out.println("---------------------------------");
	}

	public static void MejorPromedio(Alumno[] A) {
		double MejorS = 0, MejorT = 0;
		int PosS = 0, PosT = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i].getCarrera() == 'S' && A[i].getPromedio() > MejorS) {
				MejorS = A[i].getPromedio();
				PosS = i + 1;
			}
			if (A[i].getCarrera() == 'T' && A[i].getPromedio() > MejorT) {
				MejorT = A[i].getPromedio();
				PosT = i + 1;
			}

		}
		System.out.println("---------------------------------");
		System.out.println("mejor promedio sistemas " + A[PosS].getNombre() + "\t" + A[PosS].getPromedio());
		System.out.println("mejor promedio Ticts " + A[PosT].getNombre() + "\t" + A[PosT].getPromedio());
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

	}

	public static void ImprimeCarrera(Alumno[] Alu) {
		System.out.println("que carrera desea S=sistema T=tic");
		char Carr = Leer.datocar();
		System.out.println("listados de alumnos");
		System.out.println("---------------------------------");
		for (int i = 0; i < Alu.length; i++) {
			if (Alu[i].getCarrera() == Carr) {
				System.out.println(Alu[i].toString());

			}
		}
		System.out.println("---------------------------------");
	}

	public static int Carrera() {
		return (int) (Math.random() * 2) + 1;
	}

	public static int Genera() {
		return (int) (Math.random() * 2) + 1;
	}

	public static void main(Alumno[] Alu) {
		System.out.println("");

		int N = Leer.datoInt();
		Alumno = new Alumno[N];
		Dato(Alu);
		Promedio(Alu);
		Genero(Alu);
		MejorPromedio(Alu);

	}

}
