package Ejercicios;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
              
       /* 
        Ejercicio
        Segun la edad de una persona, mostraremos los siguientes mensajes
        - menos de 12 a�os: "eres un ni�o"
        - entre 13 y 17 a�os: "eres un adolescente"
        - entre 18 y 39: "eres joven"
        - entre 40 y 70: "eres sugar"
        - mayor de 70: "eres anciano"
         */

  
        int edad_persona = ' ';

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingresa tu edad:");
        edad_persona = teclado.nextInt();

        if (edad_persona < 13 ) {
            System.out.println("Eres un niño");
           } else if (edad_persona <= 17 ) {
            System.out.println("Eres un adolescente");
        } else if (edad_persona <=39) {
            System.out.println("Eres joven");
        } else if (edad_persona <=70 ){
            System.out.println("Eres un sugar daddy");
        } else {
            System.out.println("Eres anciano");
                }
       

    
    }

}
