import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base imponible.

public class Ejercicio_7_Cálculo_de_factura_con_IVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base imponible: ");
        double baseImponible = scanner.nextDouble();

        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
