import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.

public class Ejercicio_8_Salario_semanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas esta semana: ");
        int horas = scanner.nextInt();

        final double PRECIO_HORA = 12.0;
        double salario = horas * PRECIO_HORA;

        System.out.println("El salario semanal es: " + salario + " euros");

        scanner.close();
    }
}
