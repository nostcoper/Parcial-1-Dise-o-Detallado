/**
 * Esta clase proporciona métodos para realizar operaciones relacionadas con números.
 */
public class Numero {
    
    /**
     * Determina si un número dado es primo.
     *
     * @param numero El número que se quiere comprobar.
     * @return true si el número es primo, false de lo contrario.
     */
    public static boolean esPrimo(int numero) {
        int divisor = 2;
        boolean esPrimo = true;
        
        // Comprobación de divisibilidad
        while (esPrimo && divisor != numero) {
            if (numero % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        return esPrimo;
    }
    
    /**
     * Calcula el resultado de una operación matemática con cuatro números dados.
     *
     * @param primerNumero  El primer número de la operación.
     * @param segundoNumero El segundo número de la operación.
     * @param tercerNumero  El tercer número de la operación.
     * @param cuartoNumero  El cuarto número de la operación.
     * @return El resultado de la operación.
     */
    public static double calcularResultado(double primerNumero, double segundoNumero, double tercerNumero, double cuartoNumero) {
        double resultado;
        
        // Realización de la operación matemática
        resultado = ((primerNumero + segundoNumero) * (tercerNumero - cuartoNumero)) / (primerNumero * cuartoNumero);
        return resultado;
    }
}
