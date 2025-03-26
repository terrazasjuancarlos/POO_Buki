package categorias;

public class Ventas {

	public static void main(String[] args) {
		int Codigo=0;
		int Cantidad=0,Precio=0,Importe=0;
		int Art1=0,Art2=0,Imp1=0,Imp2=0,Suma1=0,Suma2=0 ,Total12=0,Imp12=0;
		do {
			System.out.println("codigo del articulo (1/2)(-1 fin)");
			Codigo=Leer.datoInt();
			Cantidad=(int)(Math.random()*10)+1;
			Precio=(int)(Math.random()*10)+1;
			Importe=Cantidad*Precio;
			System.out.println(Codigo+"\t"+Cantidad+"\t"+Precio+"\t"+Importe);
			if (Codigo==1) {
				Art1=Art1+Cantidad; Imp1=Imp1+Importe;
				
			}
			if (Codigo==2) {
				Art2=Art2+Cantidad; Imp2=Imp2+Importe;
				
			}
		}while(Codigo!=-1);
			Total12=Art1+Art2;
			Imp12=Imp1+Imp2;
			System.out.println("---------------------");
			System.out.println("cantidad de articulos1"+Art1 +"\t"+"importe"+Imp1);
			System.out.println("cantidad de articulos2"+Art2 +"\t"+ "importe"+Imp2);
			System.out.println("---------------------");
			System.out.println("totel de articulos vendidos "+Total12);


	}

}
