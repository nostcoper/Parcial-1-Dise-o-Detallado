import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase representa un menú interactivo con varias opciones.
 */
public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean salir = false;

    /**
     * Muestra el menú y procesa las opciones ingresadas por el usuario hasta que decida salir.
     */
    public static void imprimirMenu() {
        while (!salir) {
            imprimirOpciones();
            leerOpcion();
        }
    }

    /**
     * Imprime las opciones disponibles en el menú.
     */
    public static void imprimirOpciones() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Menú");
        System.out.println("1. Ordenamiento Burbuja");
        System.out.println("2. Número primo");
        System.out.println("3. Operación Matemática");
        System.out.println("4. Salir");
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Lee la opción ingresada por el usuario y ejecuta la acción correspondiente.
     */
    public static void leerOpcion() {
        System.out.print("Ingrese la accion que quiere hacer: ");
        String opcion = scanner.next();
        System.out.println("----------------------------------------------------------");

        switch (opcion) {
            case "1":
                // Ordenamiento Burbuja
                int numeros[] = { 1, 9, 23, 4, 55, 100, 1, 1, 23, 23,45,523,232,12,-12 };
                System.out.println("Antes del método de la burbuja: " + Arrays.toString(numeros));
                Ordenamiento.ordenarBurbuja(numeros);
                System.out.println("Después del método de la burbuja: " + Arrays.toString(numeros));

                String[] nombres = {"Ana", "Juan", "María", "Pedro", "Camila", "Santiago", "Laura",
                    "David", "Sofia", "Andrés", "Valentina", "Miguel", "Isabella",
                    "Alejandro", "Daniela", "Carlos", "Mariana", "Martín", "Luisa"};

                System.out.println("Antes del método de la burbuja: " + Arrays.toString(nombres));
                Ordenamiento.ordenarBurbuja(nombres);
                System.out.println("Después del método de la burbuja: " + Arrays.toString(nombres));
                break;

            case "2":
                // Número primo
                System.out.print("Ingrese el numero para saber si es primo o no: ");
                int numero =  scanner.nextInt();
                boolean esPrimo = Numero.esPrimo(numero);
                System.out.println( numero + (esPrimo ? " es primo" : " No es primo"));
                break;

            case "3":
                // Operación Matemática
                System.out.println("Ingrese los 4 números double de la operación:");
                double primerNumero = scanner.nextDouble();
                double segundoNumero = scanner.nextDouble();
                double tercerNumero = scanner.nextDouble();
                double cuartoNumero = scanner.nextDouble();
                System.out.println(Numero.calcularResultado(primerNumero, segundoNumero, tercerNumero, cuartoNumero));
                break;

            case "4":
                // Salir
                System.out.println("La ejecución ha terminado");
                salir = true;
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}
