/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaestatica;

/**
 *
 * @author Criatian Ulises
 */
public class PilaE {
    private int tamañoMaximo; 
    private int tope; // Índice del elemento superior en la pila
    private int[] Pila; 

    // Constructor para inicializar la pila con un tamaño especificado
    public PilaE(int tamaño) {
        tamañoMaximo = tamaño; // Asigna el tamaño máximo de la pila
        Pila = new int[tamañoMaximo]; // Inicializa el array con el tamaño máximo
        tope = -1; // Inicialmente, el tope es -1, lo que indica que la pila está vacía
    }

    
    public void insertar(int dato) {
        // Verifica si la pila está llena. Si el tope es igual o mayor que tamañoMaximo, no se puede insertar más elementos
        if (tope >= tamañoMaximo - 1) {
            System.out.println("La pila está llena. No se puede insertar " + dato);
            return; // Sale del método sin insertar el elemento
        }
        // Incrementa el tope y almacena el dato en la nueva posición del tope
        Pila[++tope] = dato;
    }

    
    public int eliminar() {
        // Verifica si la pila está vacía. Si el tope es menor que 0, no hay elementos para eliminar
        if (tope < 0) {
            System.out.println("La pila está vacía. No se puede eliminar elemento.");
            return -1; // Retorna -1 como valor centinela indicando que no se pudo eliminar
        }
        // Retorna el elemento en el tope y luego reduce el valor del tope
        return Pila[tope--];
    }

    
    public boolean estaVacia() {
        // Retorna true si el tope es -1, lo que indica que no hay elementos en la pila
        return (tope == -1);
    }

    
    public boolean estaLlena() {
        // Retorna true si el tope es igual al tamaño máximo de la pila menos 1, lo que indica que no hay más espacio
        return (tope == tamañoMaximo - 1);
    }

    public int contarElementos() {
        // Retorna el número de elementos en la pila, que es el valor del tope más 1
        return tope + 1;
    }

    
    public void mostrarElementos() {
        // Recorre la pila desde el tope hasta el fondo, imprimiendo los elementos
        for (int i = tope; i >= 0; i--) {
            System.out.print(Pila[i] + " "); 
        }
        System.out.println(); 
    }
} 

