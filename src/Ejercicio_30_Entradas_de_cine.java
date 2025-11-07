import java.util.Scanner;

//Realiza un programa que calcule el precio de unas entradas de cine en función del número de
// personas y del día de la semana. El precio base de una entrada son 8 euros. El miércoles
// (día del espectador), el precio base es de 5 euros. Los jueves son el día de la pareja, por
// lo que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa se obtiene un 10% de
// descuento.

public class Ejercicio_30_Entradas_de_cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de entradas: ");
        int entradas = scanner.nextInt();

        scanner.nextLine(); // Limpiar buffer

        System.out.print("Día de la semana: ");
        String dia = scanner.nextLine();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = scanner.nextLine();

        double precioBase;
        double total;
        double descuento = 0;

        if (dia.equals("miércoles") || dia.equals("miercoles")) {
            precioBase = 5.0;
            total = entradas * precioBase;
        } else if (dia.equals("jueves")) {
            int parejas = entradas / 2;
            int individuales = entradas % 2;
            total = (parejas * 11.0) + (individuales * 8.0);
        } else {
            precioBase = 8.0;
            total = entradas * precioBase;
        }

        if (tarjeta.equals("s")) {
            descuento = total * 0.10;
        }

        double aPagar = total - descuento;

        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + aPagar + " €");

        scanner.close();
    }
}
