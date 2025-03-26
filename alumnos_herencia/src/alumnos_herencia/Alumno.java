package alumnos_herencia;

public class Alumno extends Persona{
	private String Control;
	private int Semestre;
	private int Cali;
	private int Cali2;	
	private int Cali3;
	private int Cali4;
	private double Promedio;
	private char Carrera;
	

	
	public Alumno() {}


	public Alumno(String control,char Gen,char Nom, int semestre, int cali, int cali2, int cali3, int cali4, char carrera,double promedio) 
	{
		super(Nom,Gen);
		Control = control;
		Semestre = semestre;
		Cali = cali;
		Cali2 = cali2;
		Cali3 = cali3;
		Cali4 = cali4;
		Carrera = carrera;
		Promedio = promedio;
		Promedio = 0;
	}
	
	public void setPromedio(double Prom)
	{
		Promedio=Prom;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() +"\t"+Control+"\t"+Cali+"\t"+Cali2+"\t"+Cali3+"\t"+Cali4+"\t"+Promedio;
	}


	public String getControl() {
		return Control;
	}


	public double getPromedio() {
		return Promedio;
	}


	public int getSemestre() {
		return Semestre;
	}


	public int getCali() {
		return Cali;
	}


	public int getCali2() {
		return Cali2;
	}


	public int getCali3() {
		return Cali3;
	}


	public int getCali4() {
		return Cali4;
	}


	public char getCarrera() {
		return Carrera;
	}


}
