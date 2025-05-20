
package Proyecto_Empleado2;

import java.io.*;
import java.util.*;

public class Leer_empleados {
    public static Empleado[] leerEmpleados(String archivo) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));
        List<Empleado> lista = new ArrayList<>();
        try {
            while (true) {
                Empleado e = (Empleado) in.readObject();
                lista.add(e);
            }
        } catch (EOFException e) {
            // fin del archivo
        }
        in.close();
        return lista.toArray(new Empleado[0]);
    }
}
