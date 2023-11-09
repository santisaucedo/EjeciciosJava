/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Solicitar al usuario que ingrese dos nÃºmeros.
        Devolver el primer nÃºmero aumentado en 17
        y el segundo nÃºmero decrementado en 10
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingrese dos nÃºmeros enteros!!!!!");
        System.out.println("A continuaciÃ³n ingrese el primer nÃºmero y presione enter:");
        int numero1 = teclado.nextInt();
        System.out.println("A continuaciÃ³n ingrese el segundo nÃºmero y presione enter:");
        int numero2 = teclado.nextInt();

        int incrementado = numero1 + 17;
        int decrementado = numero2 - 10;

        System.out.println("El resultado del primer nÃºmero aumentado en 17 es: " + incrementado);
        System.out.println("El resultado del segundo nÃºmero decrementado en 10 es: " + decrementado);

        numero1 += 17;
        numero2 -= 10;

        System.out.println("El resultado del primer nÃºmero aumentado en 17 es: " + numero1);
        System.out.println("El resultado del segundo nÃºmero decrementado en 10 es: " + numero2);

        /*
        Solicitar al usuario que ingrese la base y la altura de un rectÃ¡ngulo e informar:
        El Ã¡rea del rectÃ¡ngulo
        El perÃ­metro del rectÃ¡ngulo.
         */
        System.out.println("\n**Calcular el perÃ­metro y Ã¡rea de un rectÃ¡ngulo**");
        System.out.println("Por favor a continuaciÃ³n usted deberÃ¡ informar la base y la altura de un rectÃ¡ngulo");
        System.out.println("Ingrese la base y presione enter:");
        double base = teclado.nextDouble();
        System.out.println("Ingrese la altura y presione enter:");
        double altura = teclado.nextDouble();

        double areaRectangulo = base * altura;
        System.out.println("El Ã¡rea del rectÃ¡ngulo es " + areaRectangulo);

        double perimetroRectangulo = 2 * (base + altura);
        System.out.println("El perÃ­metro del rectÃ¡ngulo es " + perimetroRectangulo);

        /*
        Solicitar al usuario que ingrese el radio de un cÃ­rculo eh
        informar el Ã¡rea
         */
        System.out.println("\n**Calcular el radio de un cÃ­rculo**");
        System.out.println("Ingrese el radio de un cÃ­rculo y presione enter:");
        double radio = teclado.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El Ã¡rea del cÃ­rculo es " + areaCirculo);

        /* Se pide que ingrese por consola dos pÃ¡rrafos y muestre 
        por pantalla lo siguiente:
        1. Los pÃ¡rrafos, Â¿son iguales con el operador relacional 
        ==?
        2. Los pÃ¡rrafos, Â¿poseen el mismo contenido? Sin importar 
        si estÃ¡n en mayÃºsculas o minÃºsculas.
        3. Mostrar los pÃ¡rrafos en mayÃºsculas.
        4. Mostrar los pÃ¡rrafos en minÃºsculas.
        5. Mostrar la primera letra en mayÃºscula de cada pÃ¡rrafo.
        6. Unir los pÃ¡rrafos con una coma.
         */
        Scanner tecladoNext = new Scanner(System.in);
        teclado.nextLine();
        System.out.println("Por favor ingresar dos pÃ¡rrafos.");
        System.out.println("Ingrese el primer pÃ¡rrafo y luego presione enter:");
        String parrafo1 = tecladoNext.nextLine();
        System.out.println("Ingrese el segundo pÃ¡rrafo y luego presione enter:");
        String parrafo2 = tecladoNext.nextLine();

        boolean condicion = parrafo1 == parrafo2;
        System.out.println("El resultado de comparar ambos pÃ¡rrafos "
                + "con el operador == es: " + condicion);

        condicion = parrafo1.equalsIgnoreCase(parrafo2);
        System.out.println("El resultado de comparar ambos pÃ¡rrafos teniendo en cuento su contenido "
                + "sin importar las minÃºsculas ni mayÃºsculas) es: " + condicion);

        System.out.println("\n**PÃ¡rrafos en mayÃºsculas**");
        System.out.println("Parrafo1 = " + parrafo1.toUpperCase());
        System.out.println("Parrafo2 = " + parrafo2.toUpperCase());

        System.out.println("\n**PÃ¡rrafos en minÃºsculas**");
        System.out.println("Parrafo1 = " + parrafo1.toLowerCase());
        System.out.println("Parrafo2 = " + parrafo2.toLowerCase());

        System.out.println("\n**Parrafos con la primera letra en mayÃºscula**");
        System.out.println("Parrafo1: " + parrafo1.substring(0, 1).toUpperCase()
                + parrafo1.substring(1).toLowerCase());
        System.out.println("Parrafo2: " + parrafo2.substring(0, 1).toUpperCase()
                + parrafo2.substring(1).toLowerCase());

        System.out.println("\n**UniÃ³n de pÃ¡rrafos con coma**");
        System.out.println(parrafo1 + ", " + parrafo2);

        /*Crear un programa que solicite al usuario que ingrese 
        de una vez su primer nombre y su apellido luego mostrarlo
        por consola,por separado, uno debajo del otro.
        Indicando cuÃ¡l es su apellido primero y 
        luego debajo entre comillas dobles, su nombre.
        Nombre y apellido deben ir con la primer letra en mayÃºscula
         */
        //(pendiente de resoluciÃ³n de los alumnos para la prÃ³xima clase)
        System.out.println("Por favor ingresar su primer nombre y apellido y luego presione enter");
        String nombrecompleto = tecladoNext.nextLine();
        int espacio = nombrecompleto.indexOf(" ");
        //int caracteres = nombrecompleto.length();
        String nombre = nombrecompleto.substring(0,espacio);
        String apellido = nombrecompleto.substring(espacio+1);
        
        nombre= nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
        apellido = apellido.substring(0,1) + apellido.substring(1).toLowerCase();
        
        System.out.println("El apellido es: " + apellido +  "\nEl nombre es: \""+nombre+"\"");
        
        //System.out.println("Apellido:" + nombrecompleto.substring(espacio, espacio+2 ).toUpperCase()
        //  +  nombrecompleto.substring(espacio+2,caracteres ).toLowerCase());
        
        //System.out.println("Nombre: " + nombrecompleto.substring(0,1).toUpperCase()
        //+ nombrecompleto.substring(1,espacio).toLowerCase());
                
    }

}
