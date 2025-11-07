import java.util.Scanner;

//Escribe un programa que calcule el volumen de un cono según la fórmula:

public class Ejercicio_9_Volumen_de_un_cono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio del cono: ");
        double radio = scanner.nextDouble();

        System.out.print("Introduce la altura del cono: ");
        double altura = scanner.nextDouble();

        double volumen = (1.0/3.0) * Math.PI * radio * radio * altura;
        System.out.println("El volumen del cono es: " + volumen);

        scanner.close();
    }
}
