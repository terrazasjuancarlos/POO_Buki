package HERECIAR;
public class MisproductosFrios {
	public static void main(String[] args) {
		Frescos fresco1 = new Frescos();
		fresco1 = new Frescos("2028-01-02", "F9", "2002-07-01", "Corea del Norte");
		Frescos fresco2 = new Frescos();
		fresco2 = new Frescos("2032-12-08", "G8", "2013-04-03", "Corea del Sur");
		Refrigerados refri1 = new Refrigerados();
		refri1 = new Refrigerados("2005-10-13", "I6", "2054-07-30", "Togo", "USDA-12345", "-2c");
		Refrigerados refri2 = new Refrigerados();
		refri2 = new Refrigerados("1999-06-11", "K12", "2077-01-24", "Canada", "COFEPRIS-54321", "0c");
		Refrigerados refri3 = new Refrigerados();
		refri3 = new Refrigerados("1945-08-18", "H1", "2025-02-28", "Japon", "EFSA-67890", "-5c");
		Agua agua1 = new Agua();
        agua1 = new Agua("2025-09-15", "A1", "2025-03-10", "Brasil", "35");
        Agua agua2 = new Agua();
        agua2 = new Agua("2026-02-20", "A2", "2025-06-15", "Chile", "40");
        Aire aire1 = new Aire();
        aire1 = new Aire("2025-11-30", "B1", "2025-04-05", "Argentina", "78", "21", "0.03", "0.97");
        Aire aire2 = new Aire();
        aire2 = new Aire("2026-01-10", "B2", "2025-07-22", "México", "80", "19", "0.02", "0.98");
        Nitrogeno nitrogeno1 = new Nitrogeno();
        nitrogeno1 = new Nitrogeno("2025-12-25", "C1", "2025-05-18", "Perú", "Inmersión rápida", "30");
        System.out.println("Productos Frescos");
        System.out.println(fresco1.toString());
        System.out.println(fresco2.toString());
        System.out.println("Productos Refrigerados");
        System.out.println(refri1.toString());
        System.out.println(refri2.toString());
        System.out.println(refri3.toString());
        System.out.println("Productos Congelados");
        System.out.println("Productos Congelados por agua");
        System.out.println(agua1.toString());
        System.out.println(agua2.toString());
        System.out.println("Productos Congelados por aire");
        System.out.println(aire1.toString());
        System.out.println(aire2.toString());
        System.out.println("Productos Congelados por nitrogeno");
        System.out.println(nitrogeno1.toString());
	}
}
}
