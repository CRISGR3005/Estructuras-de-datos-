/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MetodoRecursivo metodo = new MetodoRecursivo();
         Scanner input = new Scanner(System.in);
        
        // Llamar al método ProductoNum con valores m y n
        System.out.println("Introduce el primer valor");
        int m = input.nextInt();
        System.out.println("");
        System.out.println("Introduce el Segundo valor");
        int n = input.nextInt();
        
        int resultado = metodo.ProductoNum(m, n);
        System.out.println("El resultado es: " + resultado);
        
    
        
        
    }
    
}
