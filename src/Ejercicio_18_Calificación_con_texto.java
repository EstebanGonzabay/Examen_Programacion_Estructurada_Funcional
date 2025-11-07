import java.util.Scanner;

//Amplía el programa anterior para que diga la nota del boletín
// (insuficiente, suficiente, bien, notable o sobresaliente).

public class Ejercicio_18_Calificación_con_texto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota (0-10): ");
        double nota = scanner.nextDouble();

        String calificacion;

        if (nota < 5) {
            calificacion = "Insuficiente";
        } else if (nota < 6) {
            calificacion = "Suficiente";
        } else if (nota < 7) {
            calificacion = "Bien";
        } else if (nota < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }

        System.out.println("Calificación: " + calificacion);

        scanner.close();
    }
}
