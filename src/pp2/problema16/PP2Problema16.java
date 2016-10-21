/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,c, resultado;    // Declaracion de variables
    
    a= pedirDato();             //Declaracion de metodos
    b= pedirDato();
    c= pedirDato();
    resultado=Comparar(a,b,c);
    mostrarResultado(a,b,c,resultado);
    }
    public static int pedirDato() {     //Metodo para pedir numero por teclaro, se repite 3 veces
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dato númerico");
        return entrada.nextInt();
    }
    public static int Comparar(int a, int b, int c) {       //Metodo que compara los 3 numeros introducidos a través de una estructura if multiple
        if(a>b&&a>c){return a;}                             //para regresar el número mayor
        if(b>a&&b>c){return b;}
        if(c>a&&c>b){return c;}
        return 3;
    }
    public static void mostrarResultado(int a,int b,int c, int d) {     //Metodo que muestra el mayor valor regresado desde el metodo Comparar
        System.out.println("De los 3 números introducidos, el mayor es: "+d);
    }
    
}
