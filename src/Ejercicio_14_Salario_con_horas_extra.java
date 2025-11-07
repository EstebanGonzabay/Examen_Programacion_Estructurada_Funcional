import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un trabajador teniendo en
// cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros
// la hora. A partir de la hora 41, se pagan a 16 euros la hora.

public class Ejercicio_14_Salario_con_horas_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        int horas = scanner.nextInt();

        final double PRECIO_NORMAL = 12.0;
        final double PRECIO_EXTRA = 16.0;
        final int HORAS_NORMALES = 40;

        double salario;

        if (horas <= HORAS_NORMALES) {
            salario = horas * PRECIO_NORMAL;
        } else {
            int horasExtra = horas - HORAS_NORMALES;
            salario = (HORAS_NORMALES * PRECIO_NORMAL) + (horasExtra * PRECIO_EXTRA);
        }

        System.out.println("Salario semanal: " + salario + " euros");

        scanner.close();
    }
}
