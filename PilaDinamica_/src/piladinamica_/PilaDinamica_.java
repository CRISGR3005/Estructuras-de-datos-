/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piladinamica_;

/**
 *
 * @author Criatian Ulises
 */
public class PilaDinamica_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilaDinamica pila = new PilaDinamica(); // Crea una pila dinámica sin tamaño máximo

        // Inserta elementos en la pila
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);

        
        System.out.println("Tamaño de la pila: " + pila.contarElementos());

       
        System.out.print("Elementos en la pila: ");
        pila.mostrarElementos();

        
        int elementoEliminado = pila.eliminar();
        System.out.println("Elemento eliminado: " + elementoEliminado);
        
        
        System.out.print("Elementos en la pila despues de eliminar: ");
        pila.mostrarElementos();
        
        pila.limpiarPila();
    }
}
   

