import java.util.Scanner;

//Escribe un programa que diga cuál es la primera cifra de un número entero
// introducido por teclado. Se permiten números de hasta 5 cifras.

public class Ejercicio_22_Primera_cifra_de_un_número {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número (hasta 5 cifras): ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        int primeraCifra;

        if (numero < 10) {
            primeraCifra = numero;
        } else if (numero < 100) {
            primeraCifra = numero / 10;
        } else if (numero < 1000) {
            primeraCifra = numero / 100;
        } else if (numero < 10000) {
            primeraCifra = numero / 1000;
        } else {
            primeraCifra = numero / 10000;
        }

        System.out.println("La primera cifra es: " + primeraCifra);

        scanner.close();
    }
}
