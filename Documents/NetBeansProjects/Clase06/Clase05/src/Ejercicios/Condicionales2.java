package Ejercicios;

import java.util.Scanner;

public class Condicionales2 {

    public static void main(String[] args) {
        /*
        System.out.println("**Estructura if-else if-else**");

        //dados 3 numeros distintos, informar cual es el mayor
        int num1 = 30;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println("El numero 1 es mayor que el numero 2");
        } else if (num1 < num2) {
            System.out.println("El numero 2 es mayor que el numero 1");
        } else {
            System.out.println("Ambos numeros son iguales");
        }

        int edad = 60;
        String genero = "femenino";

        if (edad >= 65 && genero.equals("masculino")) {

            System.out.println("Se puede jubilar");
        } else if (edad >= 60 && genero.equals("femenino")) {
            System.out.println("Se puede jubilar");
        } else {
            System.out.println("No puede jubilarse");
        }

        if (edad >= 65 && genero.equals("masculino") || edad >= 60 && genero.equals("femenino")) {
            System.out.println("Se puede jubilar.");
        } else {
            System.out.println("No se puede jubilar");
        }

        //dados 3 numeros distintos, determinar cual es el mayor
        System.out.println("**Estructuras else if**");
        num1 = 30;
        num2 = 10;
        int num3 = 50;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero 1 es el mayor");
            } else {
                System.out.println("El numero 3 es el mayor");
            }
        } else if (num2 > num3) {
            System.out.println("El numero 2 es el mayor");
        } else {
            System.out.println("El numero 3 es el mayor");
        }

        boolean tienePasaporte = true;
        edad = 18;

        if (tienePasaporte) {
            if (edad >= 18) {
                System.out.println("Puede viajar solo");
            } else {
                System.out.println("Puede viajar pero acompa�ado");
            }
        } else {
            System.out.println("No puede viajar");
        }

        
        
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
