import java.util.Scanner;

//Realiza un programa que diga si un número entero positivo introducido
// por teclado es capicúa. Se permiten números de hasta 5 cifras.

public class Ejercicio_24_Número_capicúa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número (hasta 5 cifras): ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        boolean esCapicua = false;

        if (numero < 10) {
            esCapicua = true;
        } else if (numero < 100) {
            int decenas = numero / 10;
            int unidades = numero % 10;
            esCapicua = (decenas == unidades);
        } else if (numero < 1000) {
            int centenas = numero / 100;
            int unidades = numero % 10;
            esCapicua = (centenas == unidades);
        } else if (numero < 10000) {
            int millares = numero / 1000;
            int centenas = (numero / 100) % 10;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;
            esCapicua = (millares == unidades) && (centenas == decenas);
        } else {
            int decenasMillar = numero / 10000;
            int unidadesMillar = (numero / 1000) % 10;
            int centenas = (numero / 100) % 10;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;
            esCapicua = (decenasMillar == unidades) && (unidadesMillar == decenas);
        }

        if (esCapicua) {
            System.out.println("El número ES capicúa");
        } else {
            System.out.println("El número NO ES capicúa");
        }

        scanner.close();
    }
}
