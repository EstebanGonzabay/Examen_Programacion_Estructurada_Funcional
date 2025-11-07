import java.util.Scanner;

//Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.

public class Ejercicio_3_Conversor_de_pesetas_a_euros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();

        double euros = pesetas / 166.386;
        System.out.println(pesetas + " pesetas son " + euros + " euros");

        scanner.close();
    }
}
