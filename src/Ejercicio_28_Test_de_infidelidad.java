import java.util.Scanner;

//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel.
// El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta
// contestada como verdadero sumará 3 puntos.

public class Ejercicio_28_Test_de_infidelidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        System.out.println("Responde 'si' o 'no' a las siguientes preguntas:");

        System.out.print("1. Tu pareja parece estar más inquieta: ");
        String respuesta1 = scanner.nextLine();
        if (respuesta1.equals("si")) puntuacion += 3;

        System.out.print("2. Ha aumentado sus gastos de vestuario: ");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equals("si")) puntuacion += 3;

        System.out.print("3. Ha perdido interés por ti: ");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equals("si")) puntuacion += 3;

        System.out.print("4. Se arregla más frecuentemente: ");
        String respuesta4 = scanner.nextLine();
        if (respuesta4.equals("si")) puntuacion += 3;

        System.out.print("5. No te deja ver su teléfono: ");
        String respuesta5 = scanner.nextLine();
        if (respuesta5.equals("si")) puntuacion += 3;

        System.out.println("\nPuntuación obtenida: " + puntuacion);

        if (puntuacion <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
        }

        scanner.close();
    }
}
