package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre ");
        String nombre = entrada.nextLine();
        nombre = nombre.toLowerCase();

        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        apellido = apellido.toLowerCase();

        System.out.println("Escriba el nombre de su la Universidad");
        String universidad = entrada.nextLine();
        universidad = universidad.toLowerCase();

        System.out.println("Digite su edad");
        int edad = entrada.nextInt();

        char valorn = nombre.charAt(0);
        switch (valorn) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s con  edad %d, es un estudiante de %s\n",
                        nombre.toUpperCase(), apellido.toUpperCase(), edad, universidad);
                break;

            default:
                System.out.printf("%s %s con  edad %d, es un estudiante de %s\n",
                        nombre.toLowerCase(), apellido.toLowerCase(), edad, universidad);
                break;
        }

    }
}
