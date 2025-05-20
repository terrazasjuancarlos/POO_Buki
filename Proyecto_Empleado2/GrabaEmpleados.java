package Proyecto_Empleado2;

import java.io.*;

public class GrabaEmpleados {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.dat"));
        for (int i = 0; i < 20; i++) {
            Empleado emp = new Empleado("Empleado" + i, 25 + i, i % 2 == 0 ? 'M' : 'F',
                    i % 2 == 0 ? 'B' : 'E', (i % 5) + 1, 10000 + (i * 200),
                    "01/01/" + (2000 + i), 15);
            out.writeObject(emp);
        }
        out.close();
    }
}
