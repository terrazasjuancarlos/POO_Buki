package agenda;

public class AGENDA{
	
	public static void main(String () args){
		
        Agenda() A=new Agenda (10);
        for(int C = 0; C < A.length; C++) 
        {

            A{C}= new Agenda("*"," ");
        
        }
	}
		
	int Opcion=0;
	do
	{
		String Nombre="";
		do
		{ 
			System.out.println("Agenda telefonica");
			System.out.println("------------------------------------");
			System.out.println("1 Añadir contacto ");
			System.out.println("2 Eliminar contacto");
			System.out.println("3 Consultar contacto");
			System.out.println("4 listar agenda");
			System.out.println("5 espacios disponible");
			System.out.println("6 salir de la agenda");
			System.out.println("------------------------------------");
			System.out.println("seleccion");
			
			
		}while(Opcion<1||Opcion>6)
		switch(Opcion) {
		
		}
	}

	public static void AñadirContacto (Conctacto [] C) {
		
		
				for (int i = 0; i < Conctactos.length; i++) {
					if (Conctactos[i] == null) {
						Conctactos [i]= new Agenda(nombre,telefono);
						System.out.println("contacto agrefado");
						return;
						
					}
				}
		
		
	}
	
	public static boolean ExisteContacto ( String Nombre ,Agenda [] Conctactos) {
		for (int i = 0; i < Conctactos.length; i++) {
			if (Conctactos[i] ! = null && Conctactos[i].getNombre().equalsIgnoreCase(nombre)) {
				
				return true;
				
			}else{
				return false;
			}
		}
	}
	
	public static void ListarContactos (Conctacto [ ] C){
        System.out.println("lista de contactos");
		for (int i = 0; i < contacto.length; i++) 
		{
			System.out.println(agenda[i].ToString());
		}
		
		
	}
	
	public static void ConsultaContacto (Contacto [ ] agenda){
		
		System.out.println("que contacto desea CONSULTAR");
		String busqueda = Leer.dato();
		boolean contacto_encontrado = false ;
		//busqueda de contacto 
		for (int i = 0; i < agenda.length; i++) {
			
			if (busqueda.equalsIgnoreCase(agenda[i].getNombre())) {
				System.out.println(" contacto  ");
				System.out.println();
				contacto_encontrado;
				break;
			}
			
		}
	}
	
	public static void EliminarContacto(Contacto [] agenda)
	{
		
		System.out.println("escribir el nombre del contactp a eliminar");
		String busqueda = Leer.dato();
		boolean contacto_encontrado=false;
		String SN="";
		for (int i=0; i < agenda.length; i++) 
		{
			if (busqueda.equalsIgnoreCase(agenda[i].getNombre())) 
			{
				System.out.println(agenda[i].ToString());
				System.out.println(" desea BORRAR El contacto?:  (S/N)  ");
				SN=Leer.dato();
				if(SN.equalsIgnoreCase("S"));
				{
					agenda[i].setNombre("*");
					agenda[i].setTelefono(" ");;
					contacto_encontrado= true;
					break;
				}
			}
		}
	}
	if (contacto_encontrado=false) {
		System.out.println("no se pudo encontrar al contacto que se desea ELIMINAR");
	}
		
	
	public static void	AgendaLlena(Contacto [ ] C){
		
	}

	public static void(){
			
	}
	
	
	
	

}