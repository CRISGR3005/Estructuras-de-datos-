/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piladinamica_;

import java.util.ArrayList;

/**
 *
 * @author Criatian Ulises
 */
public class PilaDinamica {
    
    private ArrayList<Integer> Pila; // ArrayList para almacenar los elementos de la pila
    private int tope; // Índice del elemento superior en la pila

    
    public PilaDinamica() {
        Pila = new ArrayList<>(); // Inicializa el ArrayList vacío
        tope = -1; // Inicialmente, el tope es -1, lo que indica que la pila está vacía
    }

  
    public void insertar(int dato) {
        // Incrementa el tope y almacena el dato en la nueva posición del tope
        Pila.add(++tope, dato);
    }

  
    public int eliminar() {
        // Verifica si la pila está vacía. Si el tope es menor que 0, no hay elementos para eliminar
        if (tope < 0) {
            System.out.println("La pila está vacía. No se puede eliminar elemento.");
            return -1; // Retorna -1 indicando que no se pudo eliminar
        }
        // Retorna el elemento en el tope y luego reduce el valor del tope
        return Pila.remove(tope--);
    }

    
    public boolean estaVacia() {
        // Retorna true si el tope es -1, lo que indica que no hay elementos en la pila
        return (tope == -1);
    }

    
    public int contarElementos() {
        // Retorna el número de elementos en la pila, que es el valor del tope más 1
        return tope + 1;
    }

    
    public void mostrarElementos() {
        // Recorre la pila desde el tope hasta el fondo, imprimiendo los elementos
        for (int i = tope; i >= 0; i--) {
            System.out.print(Pila.get(i) + " "); // Imprime cada elemento seguido de un espacio
        }
        System.out.println(); // Imprime una nueva línea al final de la lista de elementos
    }
    public void limpiarPila() {
        Pila.clear();
        tope = -1;
        System.out.println("La pila ha sido limpiada.");
 }
}