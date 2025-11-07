import java.util.Scanner;

//Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado.

public class Ejercicio_2_Conversor_de_euros_a_pesetas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        double pesetas = euros * 166.386;
        System.out.println(euros + " euros son " + pesetas + " pesetas");

        scanner.close();
    }
}
