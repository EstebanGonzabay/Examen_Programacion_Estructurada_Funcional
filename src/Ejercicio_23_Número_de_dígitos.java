import java.util.Scanner;

//Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
// positivo o negativo. Se permiten números de hasta 5 dígitos.

public class Ejercicio_23_Número_de_dígitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número (hasta 5 cifras): ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        int digitos;

        if (numero < 10) {
            digitos = 1;
        } else if (numero < 100) {
            digitos = 2;
        } else if (numero < 1000) {
            digitos = 3;
        } else if (numero < 10000) {
            digitos = 4;
        } else {
            digitos = 5;
        }

        System.out.println("El número tiene " + digitos + " dígitos");

        scanner.close();
    }
}
