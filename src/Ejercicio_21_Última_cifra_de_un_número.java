import java.util.Scanner;

//Escribe un programa que diga cuál es la última cifra de un número
// entero introducido por teclado.

public class Ejercicio_21_Última_cifra_de_un_número {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int ultimaCifra;
        if (numero < 0) {
            ultimaCifra = (-numero) % 10;
        } else {
            ultimaCifra = numero % 10;
        }

        System.out.println("La última cifra es: " + ultimaCifra);

        scanner.close();
    }
}
