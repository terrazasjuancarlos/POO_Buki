package Herencia11;

public class Figuritas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado Cua= new Cuadrado();
		Cua=new Cuadrado("CUADRADO",5,'C',8);
		System.out.println("Nombre\\t\tBorde\\t\tRe\tLado");
		System.out.println(Cua.toString());
	}

}
