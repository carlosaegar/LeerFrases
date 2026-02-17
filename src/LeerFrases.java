import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerFrases {
    public static void main(String[] args) {

        //leemos el archivo de la ruta
        try (Scanner lector = new Scanner(new File("frases.txt"))) {

            // recorremos el archivo y mostramos las frases
            while (lector.hasNextLine()) {
                // Leemos la frase completa hasta el salto de línea
                String frase = lector.nextLine();
                System.out.println(frase);
            }

        } catch (IOException e) {
            System.out.println("Error: No se pudo leer 'frases.txt'. Verifica que el archivo exista.");
        }
    }
}
