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
        NumeroPar_Impar PI = new NumeroPar_Impar();
        int Eleccion;

        do {
            System.out.println("---------------------Menu---------------------");
            System.out.println("Elige una opcion del menu");
            System.out.println("1. Determinar si un numero es par o impar");
            System.out.println("2. Obtener la cantidad de digitos de un numero");
            System.out.println("3. Calcular el producto de dos numeros");
            System.out.println("4. Sumar elementos de un vector");
            System.out.println("5. Comparar si dos vectores son iguales");
            System.out.println("6. Determinar sucesion de fibonacci");
            System.out.println("7. Invertir una palabra");
            System.out.println("8. Sumar elementos de un arreglo desde una posicion");
            System.out.println("9. Cerrar el programa");
            System.out.println("");

            Eleccion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (Eleccion) {
                case 1:
                    System.out.println("Introduce un numero:");
                    int numero = scanner.nextInt();
                    System.out.println("El numero " + numero + " es " + (PI.ParImpar(numero) ? "par" : "impar"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Introduce un numero:");
                    int numero2 = scanner.nextInt();
                    int cantidadDigitos = PI.CantidadDigitos(numero2);
                    System.out.println("El numero " + numero2 + " tiene " + cantidadDigitos + " digitos.");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Introduce el primer valor:");
                    int m = scanner.nextInt();
                    System.out.println("Introduce el segundo valor:");
                    int n = scanner.nextInt();
                    int resultado = PI.ProductoNum(m, n);
                    System.out.println("El resultado es: " + resultado);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Ingresa el tamaño del vector: ");
                    int tamaño = scanner.nextInt();
                    int[] vector = new int[tamaño];
                    System.out.println("Ingresa los elementos del vector:");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vector[i] = scanner.nextInt();
                    }
                    int suma = PI.sumarElementosV(vector, 0);
                    System.out.println("La suma de los elementos del vector es: " + suma);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Ingresa el tamaño de los vectores: ");
                    int Tamaño = scanner.nextInt();
                    int[] vector1 = new int[Tamaño];
                    int[] vector2 = new int[Tamaño];
                    System.out.println("Ingresa los elementos del primer vector:");
                    for (int i = 0; i < Tamaño; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vector1[i] = scanner.nextInt();
                    }
                    System.out.println("Ingresa los elementos del segundo vector:");
                    for (int i = 0; i < Tamaño; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vector2[i] = scanner.nextInt();
                    }
                    boolean iguales = PI.VectoresIguales(vector1, vector2, 0);
                    System.out.println(iguales ? "Los vectores son iguales." : "Los vectores no son iguales.");
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Ingrese el numero de terminos que desea ver: ");
                    int number = scanner.nextInt();
                    PI.mostrarSerie(number);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Introduce la palabra que quieras invertir:");
                    String Cadena = scanner.nextLine();  // Ahora solo pide la cadena una vez
                    String CadenaInvertida = PI.InvertirCadena(Cadena);
                    System.out.println("Cadena invertida: " + CadenaInvertida);
                    System.out.println("");
                    break;
                case 8:
                    System.out.print("Ingresa el tamaño del vector: ");
                    int tamañoVector = scanner.nextInt();
                    int[] Vector = new int[tamañoVector];
                    System.out.println("Ingresa los elementos del vector:");
                    for (int i = 0; i < tamañoVector; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        Vector[i] = scanner.nextInt();
                    }
                    System.out.print("Selecciona la posicion desde la que empezaras a sumar: ");
                    int posicion = scanner.nextInt();
                    int sumaDesdePos = PI.sumarArregloPos(Vector, posicion);
                    System.out.println("La suma desde la posicion " + posicion + " es: " + sumaDesdePos);
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("El programa ha terminado.");
                    break;
                default:
                    System.out.println("Introduce un numero valido.");
            }

        } while (Eleccion != 9);

        scanner.close();
    }
}
                 

   
    

