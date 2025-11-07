import java.util.Scanner;

//Escribe un programa que calcule el área de un rectángulo.

public class Ejercicio_5_Área_de_un_rectángulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}
