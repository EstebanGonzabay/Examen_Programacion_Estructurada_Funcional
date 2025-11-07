import java.util.Scanner;

//Realiza un programa que calcule el tiempo que tardará en caer un objeto
// desde una altura h. Aplica la fórmula...

public class Ejercicio_16_Tiempo_de_caída {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double GRAVEDAD = 9.81;

        System.out.print("Introduce la altura en metros: ");
        double altura = scanner.nextDouble();

        if (altura <= 0) {
            System.out.println("La altura debe ser positiva");
        } else {
            double tiempo = Math.sqrt((2 * altura) / GRAVEDAD);
            System.out.println("Tiempo de caída: " + tiempo + " segundos");
        }

        scanner.close();
    }
}
