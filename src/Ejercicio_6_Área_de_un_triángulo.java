import java.util.Scanner;

//Escribe un programa que calcule el área de un triángulo.

public class Ejercicio_6_Área_de_un_triángulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
