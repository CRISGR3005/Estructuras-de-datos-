/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Criatian Ulises
 */
public class MetodoRecursivo {
    
    public int ProductoNum (int m, int n){
        if(n == 1)
            return m;
        else{
            return m + ProductoNum (m,n-1);
        }
            
    }
    
}
