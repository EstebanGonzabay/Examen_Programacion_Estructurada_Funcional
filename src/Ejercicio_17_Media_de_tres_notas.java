import java.util.Scanner;

//Realiza un programa que calcule la media de tres notas.

public class Ejercicio_17_Media_de_tres_notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media es: " + media);

        scanner.close();
    }
}
