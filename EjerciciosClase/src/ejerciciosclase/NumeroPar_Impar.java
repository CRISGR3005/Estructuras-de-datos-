/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

/**
 *
 * @author Criatian Ulises
 */
public class NumeroPar_Impar {
    public static boolean ParImpar(int numero){
        if(numero == 1){
            return false;
        }
         if(numero == 0){
             return true;
         }
         return ParImpar(numero - 2);
    }
     public static int CantidadDigitos(int n){
        if (n < 10 && n > -10) {
            return 1;
        } 
        // Llamada recursiva, dividiendo el número entre 10
        else {
            return 1 + CantidadDigitos(n / 10);
        }
    }
}
