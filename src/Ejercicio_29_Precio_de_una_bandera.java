import java.util.Scanner;

//La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
// ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base
// de una bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo
// bordado, el precio se incrementa en 2.50 €. Los gastos de envío son 3.25 €.

public class Ejercicio_29_Precio_de_una_bandera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        double altura = scanner.nextDouble();

        System.out.print("Ahora introduzca la anchura: ");
        double anchura = scanner.nextDouble();

        scanner.nextLine(); // Limpiar buffer

        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String escudo = scanner.nextLine();

        double area = altura * anchura;
        double precioBase = area * 0.01;
        double precioEscudo = 0;

        if (escudo.equals("s")) {
            precioEscudo = 2.50;
        }

        double gastosEnvio = 3.25;
        double total = precioBase + precioEscudo + gastosEnvio;

        System.out.println("Bandera de " + area + " cm2: " + precioBase + " €");
        if (escudo.equals("s")) {
            System.out.println("Con escudo: " + precioEscudo + " €");
        } else {
            System.out.println("Sin escudo: " + precioEscudo + " €");
        }
        System.out.println("Gastos de envío: " + gastosEnvio + " €");
        System.out.println("Total: " + total + " €");

        scanner.close();
    }
}
