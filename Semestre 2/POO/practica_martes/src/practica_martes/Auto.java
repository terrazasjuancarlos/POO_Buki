//teng todo lo que tega la wuacha fguma cosa si se asrre vasa 
package practica_martes;
// atributos
public class Auto {
	String Marca;
	String Modelo;
	int Precio;
//constructor vacio osea voiud 
	public Auto(){
		


	} 	
	// cpnstructor con parametrows intefeaados 
	public Auto(String mar , String mod , int pre){
		Marca=mar;
		Precio=pre;
		Modelo=mod;

	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}

} 	
