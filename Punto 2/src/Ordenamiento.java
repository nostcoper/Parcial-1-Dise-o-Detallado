/**
 * Esta clase proporciona métodos para realizar el ordenamiento de arreglos utilizando el algoritmo de ordenamiento burbuja.
 */
public class Ordenamiento {

  /**
   * Ordena un arreglo de cadenas utilizando el algoritmo de ordenamiento burbuja.
   *
   * @param arreglo El arreglo de cadenas que se va a ordenar.
   */
  public static void ordenarBurbuja(String[] arreglo) {
      boolean ordenado = false;
      while (!ordenado) {
          ordenado = true;
          int tamanoArreglo = arreglo.length - 1 ;
          int indiceActual = 0; 
          for (String elemento : arreglo) {
              if (indiceActual < tamanoArreglo && elemento.compareTo(arreglo[indiceActual + 1]) > 0) {
                  intercambiar(arreglo, indiceActual, indiceActual + 1);
                  ordenado = false;
              }
              indiceActual++;
          }
          tamanoArreglo--;
      }
    }
  
  /**
   * Ordena un arreglo de enteros utilizando el algoritmo de ordenamiento burbuja.
   *
   * @param arreglo El arreglo de enteros que se va a ordenar.
   */
  public static void ordenarBurbuja(int[] arreglo) {
      boolean ordenado = false;
      while (!ordenado) {
          ordenado = true;
          int tamanoArreglo = arreglo.length - 1 ;
          int indiceActual = 0; 
          for (int elemento : arreglo) {
              if (indiceActual < tamanoArreglo && elemento > arreglo[indiceActual + 1]) {
                  intercambiar(arreglo, indiceActual, indiceActual + 1);
                  ordenado = false;
              }
              indiceActual++;
          }
          tamanoArreglo--;
      }
    }

  /**
   * Intercambia dos elementos en un arreglo de cadenas.
   *
   * @param arreglo El arreglo en el que se realizará el intercambio.
   * @param indice1 Índice del primer elemento a intercambiar.
   * @param indice2 Índice del segundo elemento a intercambiar.
   */
  private static void intercambiar(String[] arreglo, int indice1, int indice2) {
    String temp = arreglo[indice1];
    arreglo[indice1] = arreglo[indice2];
    arreglo[indice2] = temp;
  }

  /**
   * Intercambia dos elementos en un arreglo de enteros.
   *
   * @param arreglo El arreglo en el que se realizará el intercambio.
   * @param indice1 Índice del primer elemento a intercambiar.
   * @param indice2 Índice del segundo elemento a intercambiar.
   */
  private static void intercambiar(int[] arreglo, int indice1, int indice2) {
    int temp = arreglo[indice1];
    arreglo[indice1] = arreglo[indice2];
    arreglo[indice2] = temp;
  }
}
