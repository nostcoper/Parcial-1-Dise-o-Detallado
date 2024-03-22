/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ente0
 */

public class Menu {

    private static final BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    
    
    public static void impirmirMenu(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Programa que detecta los siguientes tipos de números: ");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("----------------------------------------------------------");
    }
    public static int leerOpcion() throws IOException {
        System.out.println("Seleccione su opción (1, 2 o 3): ");
        int opcion  = Integer.parseInt(bufer.readLine());
        return opcion;
    }

    public static int leerNumero() throws IOException {
        System.out.println("----------------------------------------------------------");
        System.out.println("Escriba el número: ");
        int opcion  = Integer.parseInt(bufer.readLine());
        return opcion;
    }
    
    public static void ejecutarMenu(){
        
    }



}
