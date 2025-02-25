package practica_martes;

public class Mis_autos {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		Auto Carro = new Auto(); //crear opbeto
		Carro = new Auto("KIA","SLOUL",120000); //crear 
		String Nombre=Carro.getMarca()+""+Carro.getModelo();
		int Costo = Carro.getPrecio();
		//imprimir datos del objeto
		System.out.println("mi AUTO ES "+Nombre+"Y cuesta "+Costo);
	}

}
