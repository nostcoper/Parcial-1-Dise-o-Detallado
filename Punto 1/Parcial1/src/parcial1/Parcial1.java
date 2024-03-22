/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

import java.io.IOException;
/**
 *
 * @author ente0
 */
public class Parcial1 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Menu.impirmirMenu();
        int opcion = Menu.leerOpcion();
        int numero = Menu.leerNumero();
        Numero num = new Numero(numero);
        num.calcularSumaDivisores();

        switch (opcion) {
          case 1:
            num.mostrarResultado(num.esPerfecto() ? "perfecto" : "no perfecto");
            break;
          case 2:
            num.mostrarResultado(num.esDefectivo() ? "defectivo" : "no defectivo");
            break;
          case 3:
            num.mostrarResultado(num.esAbundante() ? "abundante" : "no abundante");
            break;
          default:
            System.out.println("Opción no válida");
        }
    }
}




