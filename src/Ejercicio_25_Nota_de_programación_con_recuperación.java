import java.util.Scanner;

//Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las
// dos notas que ha sacado el alumno en los dos primeros controles. Si la media es mayor
// o igual a 5, se muestra la media. Si es menor, se pregunta por el resultado de la
// recuperación (apto/no apto). Si es apto, la nota será 5; si no, se mantiene la media.

public class Ejercicio_25_Nota_de_programación_con_recuperación {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota del primer control: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota del segundo control: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media);
        } else {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = scanner.nextLine();

            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de Programación es 5");
            } else {
                System.out.println("Tu nota de Programación es " + media);
            }
        }

        scanner.close();
    }
}
