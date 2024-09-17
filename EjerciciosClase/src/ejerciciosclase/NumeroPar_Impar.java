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
     public int ProductoNum (int m, int n){
        if(n == 1)
            return m;
        else{
            return m + ProductoNum (m,n-1);
   }
  }
     public static String InvertirCadena(String cadena) {
         if (cadena.isEmpty()) {
            return cadena; 
        }
        return InvertirCadena(cadena.substring(1)) + cadena.charAt(0);     
 }
     public static int sumarElementosV(int[] vector, int indice) {
        if (indice == vector.length) {
            return 0; 
        } else {
            // 
            return vector[indice] + sumarElementosV(vector, indice + 1);
  }
 }
    public static boolean VectoresIguales(int[] vector1, int[] vector2, int indice) {
        if (indice == vector1.length) {
            return true;
        }
        if (vector1[indice] != vector2[indice]) {
            return false;
        }
        return VectoresIguales(vector1, vector2, indice + 1);
    }
     public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  
    }
    public static void mostrarSerie(int n) {
        System.out.println("Serie de Fibonacci hasta " + n + " terminos:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();  
    }
    public static int sumaDesdePosicion(int[] vector, int posicion) {
       
        if (posicion >= vector.length) {
            return 0;
        }
        return vector[posicion] + sumaDesdePosicion(vector, posicion + 1);
  }
    public int sumarArregloPos(int[] elems, int pos) {
        // Caso base: si la posición está fuera de los límites del array, retorna 0
        if (pos >= elems.length) {
            return 0;
        }
        // Caso recursivo: suma el elemento en la posición actual y llama al siguiente
        return elems[pos] + sumarArregloPos(elems, pos + 1);

 }
}
    


