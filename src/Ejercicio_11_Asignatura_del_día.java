import java.util.Scanner;

//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

public class Ejercicio_11_Asignatura_del_día {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine();

        if (dia.equals("lunes")) {
            System.out.println("Programación");
        } else if (dia.equals("martes")) {
            System.out.println("Sistemas Informáticos");
        } else if (dia.equals("miércoles") || dia.equals("miercoles")) {
            System.out.println("Entornos de Desarrollo");
        } else if (dia.equals("jueves")) {
            System.out.println("Base de Datos");
        } else if (dia.equals("viernes")) {
            System.out.println("Lenguaje de Marcas");
        } else {
            System.out.println("Día no válido");
        }

        scanner.close();
    }
}
