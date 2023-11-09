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
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Solicitar al usuario que ingrese dos números.
        Devolver el primer número aumentado en 17
        y el segundo número decrementado en 10
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingrese dos números enteros!!!!!");
        System.out.println("A continuación ingrese el primer número y presione enter:");
        int numero1 = teclado.nextInt();
        System.out.println("A continuación ingrese el segundo número y presione enter:");
        int numero2 = teclado.nextInt();

        int incrementado = numero1 + 17;
        int decrementado = numero2 - 10;

        System.out.println("El resultado del primer número aumentado en 17 es: " + incrementado);
        System.out.println("El resultado del segundo número decrementado en 10 es: " + decrementado);

        numero1 += 17;
        numero2 -= 10;

        System.out.println("El resultado del primer número aumentado en 17 es: " + numero1);
        System.out.println("El resultado del segundo número decrementado en 10 es: " + numero2);

        /*
        Solicitar al usuario que ingrese la base y la altura de un rectángulo e informar:
        El área del rectángulo
        El perímetro del rectángulo.
         */
        System.out.println("\n**Calcular el perímetro y área de un rectángulo**");
        System.out.println("Por favor a continuación usted deberá informar la base y la altura de un rectángulo");
        System.out.println("Ingrese la base y presione enter:");
        double base = teclado.nextDouble();
        System.out.println("Ingrese la altura y presione enter:");
        double altura = teclado.nextDouble();

        double areaRectangulo = base * altura;
        System.out.println("El área del rectángulo es " + areaRectangulo);

        double perimetroRectangulo = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es " + perimetroRectangulo);

        /*
        Solicitar al usuario que ingrese el radio de un círculo eh
        informar el área
         */
        System.out.println("\n**Calcular el radio de un círculo**");
        System.out.println("Ingrese el radio de un círculo y presione enter:");
        double radio = teclado.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es " + areaCirculo);

        /* Se pide que ingrese por consola dos párrafos y muestre 
        por pantalla lo siguiente:
        1. Los párrafos, ¿son iguales con el operador relacional 
        ==?
        2. Los párrafos, ¿poseen el mismo contenido? Sin importar 
        si están en mayúsculas o minúsculas.
        3. Mostrar los párrafos en mayúsculas.
        4. Mostrar los párrafos en minúsculas.
        5. Mostrar la primera letra en mayúscula de cada párrafo.
        6. Unir los párrafos con una coma.
         */
        Scanner tecladoNext = new Scanner(System.in);
        teclado.nextLine();
        System.out.println("Por favor ingresar dos párrafos.");
        System.out.println("Ingrese el primer párrafo y luego presione enter:");
        String parrafo1 = tecladoNext.nextLine();
        System.out.println("Ingrese el segundo párrafo y luego presione enter:");
        String parrafo2 = tecladoNext.nextLine();

        boolean condicion = parrafo1 == parrafo2;
        System.out.println("El resultado de comparar ambos párrafos "
                + "con el operador == es: " + condicion);

        condicion = parrafo1.equalsIgnoreCase(parrafo2);
        System.out.println("El resultado de comparar ambos párrafos teniendo en cuento su contenido "
                + "sin importar las minúsculas ni mayúsculas) es: " + condicion);

        System.out.println("\n**Párrafos en mayúsculas**");
        System.out.println("Parrafo1 = " + parrafo1.toUpperCase());
        System.out.println("Parrafo2 = " + parrafo2.toUpperCase());

        System.out.println("\n**Párrafos en minúsculas**");
        System.out.println("Parrafo1 = " + parrafo1.toLowerCase());
        System.out.println("Parrafo2 = " + parrafo2.toLowerCase());

        System.out.println("\n**Parrafos con la primera letra en mayúscula**");
        System.out.println("Parrafo1: " + parrafo1.substring(0, 1).toUpperCase()
                + parrafo1.substring(1).toLowerCase());
        System.out.println("Parrafo2: " + parrafo2.substring(0, 1).toUpperCase()
                + parrafo2.substring(1).toLowerCase());

        System.out.println("\n**Unión de párrafos con coma**");
        System.out.println(parrafo1 + ", " + parrafo2);

        /*Crear un programa que solicite al usuario que ingrese 
        de una vez su primer nombre y su apellido luego mostrarlo
        por consola,por separado, uno debajo del otro.
        Indicando cuál es su apellido primero y 
        luego debajo entre comillas dobles, su nombre.
        Nombre y apellido deben ir con la primer letra en mayúscula
         */
        //(pendiente de resolución de los alumnos para la próxima clase)
        System.out.println("Ingresar primer nombre y apellido");
        String nombrecompleto = tecladoNext.nextLine();
        int espacio= nombrecompleto.indexOf(" ");
        int caracteres = nombrecompleto.length();
      
        System.out.println("Apellido:" + nombrecompleto.substring(espacio, espacio+2 ).toUpperCase() +  nombrecompleto.substring(espacio+2,caracteres ).toLowerCase());
        
        System.out.println("Nombre: " + nombrecompleto.substring(0,1).toUpperCase()+ nombrecompleto.substring(1,espacio).toLowerCase());
                
    }

}
