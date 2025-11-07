import java.util.Scanner;

//Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y
// luego el usuario 2. Si alguno de los usuarios introduce una opción incorrecta, el programa
// deberá mostrar un mensaje de error.

public class Ejercicio_26_Piedra_papel_tijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (piedra/papel/tijera): ");
        String jugador1 = scanner.nextLine();

        System.out.print("Turno del jugador 2 (piedra/papel/tijera): ");
        String jugador2 = scanner.nextLine();

        if (!jugador1.equals("piedra") && !jugador1.equals("papel") && !jugador1.equals("tijera")) {
            System.out.println("Opción no válida del jugador 1");
        } else if (!jugador2.equals("piedra") && !jugador2.equals("papel") && !jugador2.equals("tijera")) {
            System.out.println("Opción no válida del jugador 2");
        } else if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
            System.out.println("Gana el jugador 1");
        } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
            System.out.println("Gana el jugador 1");
        } else if (jugador1.equals("tijera") && jugador2.equals("papel")) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        scanner.close();
    }
}
