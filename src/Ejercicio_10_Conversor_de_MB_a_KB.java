import java.util.Scanner;

//Realiza un conversor de MB a KB.

public class Ejercicio_10_Conversor_de_MB_a_KB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en MB: ");
        double mb = scanner.nextDouble();

        double kb = mb * 1024;
        System.out.println(mb + " MB son " + kb + " KB");

        scanner.close();
    }
}
