
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arrglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control iterativa(bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i] = '_';

            // System.out.print(letrasAdivinadas[i]);

        }

        while (!palabraAdivinada && intentos < intentosMax) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor");

            // usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if (palabraSecreta.charAt(i) == letra) {

                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {

                intentos++;
                System.out.println("incorrecto te quedan " + (intentosMax - intentos) + " intentos.");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {

                palabraAdivinada = true;
                System.out.println("Felicidades Adivinaste la palabra secreta " + palabraSecreta);

            }
        }

        if (!palabraAdivinada) {
            System.out.println("Te quedaste sin intentos");

        }
        scanner.close();

    }
}
