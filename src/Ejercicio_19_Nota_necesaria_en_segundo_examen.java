import java.util.Scanner;

//Realiza un programa que calcule la nota que hace falta sacar en el segundo
// examen de la asignatura Programación para obtener la media deseada.
// Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
// del segundo examen un 60%.

public class Ejercicio_19_Nota_necesaria_en_segundo_examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();

        double notaNecesaria = (notaDeseada - (nota1 * 0.4)) / 0.6;

        System.out.println("Para tener un " + notaDeseada +
                " necesitas sacar un " + notaNecesaria +
                " en el segundo examen");

        scanner.close();
    }
}
