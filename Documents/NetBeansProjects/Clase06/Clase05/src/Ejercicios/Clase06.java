/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author alumno
 */
public class Clase06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TABLA DE VERDAD
        //Es una representacion logica de resultados
        
        /*
        A     |   B    |   AND   |    OR
        V     |   V    |    V    |     V
        V     |   F    |    F    |     V  
        F     |   V    |    F    |     V
        F     |   F    |    F    |     F
        
        Negacion (NOT)
        A   NOT
        V   F
        F   V
              
        /*
        & AND (Y LOGICO)
        | OR (O LOGICO)
        ! NOT (NEGACION)
        Los operandos son booleanos
        El resultado es booleanos        
        */
        
        boolean log1 = true;
        boolean log2 = false;
        
        System.out.println("AND &&:");
        System.out.println(log1 && log2); //false
        
        System.out.println("OR ||:");
        System.out.println(log1 || log2);//true
        
        System.out.println("NOT !:");
        System.out.println(!log1);//false
        System.out.println(!log2);//true
        
        //Con un solo operador se evalua todas las condiciones
        //Con dos operadores, si la promera condicion
        //determina el valor de verdad, ya no evalua las siguientes
        
        //ejercicios java (variables, constantes y operadores)
        
        /*
        1-
        dados n1=5, n2=10 y n3=20 informar:
        a)n1+n2
        b)n3-n1
        c)n1*n3
        d)n3/n2
        */
        //resolucion
       
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        
        System.out.println(n1+n2);
        System.out.println(n3-n1);
        System.out.println(n1*n3);
        System.out.println(n3/n2);
        /*
        1-
        dados n1=10, n2=20 y n3=30 informar:
        a)El total de la suma de todas las variables
        b)El promedio
        c)el resto entre n2 y n1
        */
        
        //resolucion
        
        n1 = 10;
        n2 = 20;
        n3 = 30;
        
        //a)
        System.out.println(n1 + n2 + n3);
        
        //b)
        System.out.println((n1 + n2 + n3)/3);
        
        //c)
        System.out.println(n2%n1);
        
        /*
        3-
        Declarar dos variables n1=5 y n2=10
        Utilizando concatenacion entre las variables y los literales,
        mostrar en pantalla la siguiente expresion:
        
        n1 es igual a 5, n2 es igual a 10 y n1 más n2 es igual a 15.
        */
        
        
      
    }
    
}
