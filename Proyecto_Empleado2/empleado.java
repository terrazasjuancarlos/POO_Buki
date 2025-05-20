package Proyecto_Empleado2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona {
    private char tipoEmpleado; // 'B' o 'E'
    private int numDepartamento; // 1-5
    private double sueldoMensual;
    private LocalDate fechaIngreso;
    private int diasAguinaldo;

    public Empleado(String nombre, int edad, char genero, char tipoEmpleado, int numDepartamento, double sueldoMensual, String fechaIngreso, int diasAguinaldo) {
        super(nombre, edad, genero);
        this.tipoEmpleado = Character.toUpperCase(tipoEmpleado);
        this.numDepartamento = numDepartamento;
        this.sueldoMensual = sueldoMensual;
        this.fechaIngreso = LocalDate.now(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.diasAguinaldo = diasAguinaldo;
    }
    public int calcularAntiguedad(int anioActual) {
        return anioActual - fechaIngreso.getYear();
    }

    public double calcularAguinaldo() {
        return diasAguinaldo * (sueldoMensual / 30);
    }

}
