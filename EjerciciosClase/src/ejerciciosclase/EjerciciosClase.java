/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EjerciciosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        NumeroPar_Impar PI = new  NumeroPar_Impar();
        NumeroPar_Impar CD = new  NumeroPar_Impar();
    
        System.out.println("-----Menu-----");
        System.out.println("Elige una opcion del menu");
        System.out.println("1. Determinar si un numero es par o impar");
        System.out.println("2. Obtener la cantidad de digitos de un numero");
        System.out.println("3. Cerrar el programa");
        int Eleccion = scanner.nextInt();
      

        
         switch (Eleccion){
             case 1:
                  System.out.println("Introduce un numero");
                  int numero = scanner.nextInt();
                  System.out.println("El numero " + numero + " es " + (PI.ParImpar(numero) ? "par" : "impar"));
                  break;
             case 2:
                  System.out.println("Introduce un numero");
                  int numero2 = scanner.nextInt();
                  int cantidadDigitos =  CD.CantidadDigitos(numero2);
                  System.out.println("El numero " + numero2 + " tiene " + cantidadDigitos + " digitos.");
                  break;
              case 3:
                  System.out.println("Se ha cerrado el programa");
                  break;
                  default:
                  System.out.println("Introduce un numero valido");
                 
         }
       }
}
   
                 

   
    

