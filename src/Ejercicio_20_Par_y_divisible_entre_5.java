import java.util.Scanner;

//Realiza un programa que diga si un número introducido por
// teclado es par y/o divisible entre 5.

public class Ejercicio_20_Par_y_divisible_entre_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        boolean esPar = (numero % 2 == 0);
        boolean divisible5 = (numero % 5 == 0);

        System.out.println("El número " + numero + ":");
        if (esPar) {
            System.out.println("- ES par");
        } else {
            System.out.println("- NO ES par");
        }

        if (divisible5) {
            System.out.println("- ES divisible entre 5");
        } else {
            System.out.println("- NO ES divisible entre 5");
        }

        scanner.close();
    }
}
