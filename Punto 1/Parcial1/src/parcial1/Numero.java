/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author ente0
 */
public class Numero {
    private int numero;
    private int sumaDivisores;

    public Numero(int numero) {
        this.numero = numero;
    }

    public void calcularSumaDivisores() {
        for (int i = numero - 1; i >= 1; i--) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
    }
    
    public boolean esPerfecto() {
        return numero == sumaDivisores;
    }

    public boolean esDefectivo() {
        return numero > sumaDivisores;
    }

    public boolean esAbundante() {
        return sumaDivisores > 2 * numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void mostrarResultado(String tipo) {
        System.out.println("El número " + numero + " es " + tipo);
    }

}

