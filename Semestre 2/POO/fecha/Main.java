package fecha;

public class Main {
	
	System.out.print("Ingresa dia: ");
	int D=Leer.datoInt();

	System.out.print("Ingresa mes: ");
	int M=Leer.datoInt();

	System.out.print("Ingresa año: ");
	int A=Leer.datoInt();

	Fecha fecha = new Fecha(D,M,A);
	
	    if (fecha.fechaCorrecta()) { 
	
	 
	        System.out.println("Fecha introducida: " + fecha);
	
	    } else { //Si la fecha no es correcta
	        System.out.println("Fecha no valida");
	    }
	}

}
