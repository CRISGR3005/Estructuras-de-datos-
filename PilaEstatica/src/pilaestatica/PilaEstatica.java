/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaestatica;

/**
 *
 * @author Criatian Ulises
 */
public class PilaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PilaE pila = new PilaE(5); // crea una pila con un tamaño máximo de 5

        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);

        // Imprime el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.contarElementos());

        // Muestra los elementos en la pila
        System.out.print("Elementos en la pila: ");
        pila.mostrarElementos();

        // Elimina el elemento superior de la pila
        int elementoEliminado = pila.eliminar();
        System.out.println("Elemento eliminado: " + elementoEliminado);
        
        // Vuelve a mostrar los elementos después de eliminar
        System.out.print("Elementos en la pila despues de eliminar: ");
        pila.mostrarElementos();
    }
}
