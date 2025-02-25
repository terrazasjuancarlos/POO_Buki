package fecha;

public class Main {
	
	System.out.print("Ingresa dia: ");
	int Dia=Leer.datoInt();

	System.out.print("Ingresa mes: ");
	int Mes=Leer.datoInt();

	System.out.print("Ingresa año: ");
	int Año=Leer.datoInt();

	Fecha fecha = new Fecha(Dia,Mes,Año);
	
	    if (fecha.fechaCorrecta()) { 
	
	 
	        System.out.println("la  Fecha introducida: " + fecha.Tostring());
	
	    } else { //Si la fecha no es correcta
	        System.out.println("Fecha no valida");
	    }
	}

}
