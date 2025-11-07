import java.util.Scanner;

//Escribe un programa en que dado un número del 1 a 7 escriba el
// correspondiente nombre del día de la semana.

public class Ejercicio_13_Día_de_la_semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7: ");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número no válido");
        }

        scanner.close();
    }
}
