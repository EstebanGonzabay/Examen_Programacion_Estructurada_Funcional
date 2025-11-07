import java.util.Scanner;

//Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué
// ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €.
// En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla;
// el primero vale 1.20 € y el segundo 1.60 €. Por último se pregunta por la bebida: zumo o café a
// 1.50 y 1.20 respectivamente.

public class Ejercicio_27_Desayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioComida = 0;
        String tipoComida = "";

        System.out.print("¿Qué ha tomado de comer? (palmera/donut/pitufo): ");
        String comida = scanner.nextLine();

        if (comida.equals("palmera")) {
            precioComida = 1.40;
            tipoComida = "Palmera";
        } else if (comida.equals("donut")) {
            precioComida = 1.00;
            tipoComida = "Donut";
        } else if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite/tortilla): ");
            String tipoPitufo = scanner.nextLine();
            if (tipoPitufo.equals("aceite")) {
                precioComida = 1.20;
                tipoComida = "Pitufo con aceite";
            } else {
                precioComida = 1.60;
                tipoComida = "Pitufo con tortilla";
            }
        } else {
            System.out.println("Opción no válida");
            scanner.close();
            return;
        }

        System.out.print("¿Qué ha tomado de beber? (zumo/café): ");
        String bebida = scanner.nextLine();

        double precioBebida = 0;
        String tipoBebida = "";

        if (bebida.equals("zumo")) {
            precioBebida = 1.50;
            tipoBebida = "Zumo";
        } else if (bebida.equals("café")) {
            precioBebida = 1.20;
            tipoBebida = "Café";
        } else {
            System.out.println("Opción no válida");
            scanner.close();
            return;
        }

        double total = precioComida + precioBebida;

        System.out.println(tipoComida + ": " + precioComida + " €");
        System.out.println(tipoBebida + ": " + precioBebida + " €");
        System.out.println("Total desayuno: " + total + " €");

        scanner.close();
    }
}
