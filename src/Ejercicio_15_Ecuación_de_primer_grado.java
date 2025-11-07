import java.util.Scanner;

//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).

public class Ejercicio_15_Ecuación_de_primer_grado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolución de ecuación ax + b = 0");
        System.out.print("Introduce a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones");
            } else {
                System.out.println("La ecuación no tiene solución");
            }
        } else {
            double x = -b / a;
            System.out.println("Solución: x = " + x);
        }

        scanner.close();
    }
}
