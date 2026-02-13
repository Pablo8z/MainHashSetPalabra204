import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class MainHashSetPalabra204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de palabras separadas por espacios:");
        String entrada = scanner.nextLine();

        String[] todasLasPalabras = entrada.split(" ");

        HashSet<String> palabrasUnicas = new HashSet<>(Arrays.asList(todasLasPalabras));

        System.out.println("\nPalabras únicas encontradas:");
        for (String palabra : palabrasUnicas) {
            System.out.println("- " + palabra);
        }

        scanner.close();
    }
}
