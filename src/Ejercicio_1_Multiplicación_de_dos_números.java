//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//Escribe un programa que pida dos números por teclado y muestre el resultado de su multiplicación.

public class Ejercicio_1_Multiplicación_de_dos_números {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();

    }
}