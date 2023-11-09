package clase10;

import java.util.Scanner;

public class Clase10 {

    public static void main(String[] args) {

 
        Scanner teclado = new Scanner(System.in);

        //1
        System.out.println("Por favor ingrese dos numeros");
        System.out.println("Por favor ingrese el primer y presione enter: ");
        int num1 = teclado.nextInt();
        System.out.println("Por favor ingrese el segundo numero y presione enter: ");
        int num2 = teclado.nextInt();

        int aumentado = num1 + 17;
        int decrementado = num2 - 1;

        System.out.println("El primer numero aumentado es: " + aumentado);
        System.out.println("El segundo numero aumentado es: " + decrementado);

        //2
        System.out.println("Por favor ingrese la base y la altura de un rectangulo");
        System.out.println("Por favor ingrese la base: ");
        int base = teclado.nextInt();
        System.out.println("Por favor ingrese la altura: ");
        int altura = teclado.nextInt();

        double arearectangulo = base * altura;
        double perimetrorectangulo = 2 * base + 2 * altura;

        System.out.println("El area del rectangulo es: " + arearectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetrorectangulo);
        
        //3
        //final double PI = 3.14;
       
        System.out.println("Ingresar el radio de un circulo: ");
        double radio = teclado.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        //double areacirculo = PI * (radiocirculo * 2);
        System.out.println("El area del circulo es: " + areaCirculo);
       

        System.out.println("Por favor ingresar dos parrafos: ");
        System.out.println("Ingrese el primer parrafo: ");
        String parrafo1 = teclado.nextLine();
        System.out.println("Ingrese el segundo parrafo: ");
        String parrafo2 = teclado.nextLine();
        
      //4
        System.out.println("1. Los parrafos son iguales? : " + parrafo1.equals(parrafo2));
        System.out.println("2. Los parrafos poseen el mismo contenido? : " + parrafo1.equalsIgnoreCase(parrafo2));
        System.out.println("3. Parrafos en mayuscula: " + parrafo1.toUpperCase() + " " + parrafo2.toUpperCase());
        System.out.println("3. Parrafos en minuscula: " + parrafo1.toLowerCase() + " " + parrafo2.toLowerCase());
        System.out.println("4. Mostrar primera letra en mayuscula" + parrafo1.substring(0,1).toUpperCase()+parrafo1.substring(1) +
                ", " + parrafo2.substring(0,1).toUpperCase() + parrafo2.substring(1));
        System.out.println("6. " + parrafo1 + ", " + parrafo2);
        
      //5
       /*Crear un programa que solicite al usuario que ingrese su primer nombre y su apellido
luego mostrarlo por consola, por separado, indicando cuál es su apellido primero y 
luego debajo entre comillas dobles, su nombre
Nombre y apellido deben ir con la primer letra en mayúscula
 */

      
      
      
      
    }

}

//Ejercicios:

/*
Solicitar al usuario que ingrese 3 números.
Luego informar:
La suma de los dos primeros
La resta de los dos segundos
El resto entre el primer número y el segundo
La suma total
El promedio
 */

 /*
Solicitar al usario que ingrese dos números.
Devolver el primer número aumentado en 17
y el segundo número decrementado en 10
 */
 /*
Solicitar al usuario que ingrese la base y la altura de un rectángulo e informar:
El área del rectángulo
El perímetro del rectángulo.
 */

 /*
Solicitar al usuario que ingrese el radio de un círculo en informar el área
 */

 /* Se pide que ingrese por consola dos párrafos y muestre por pantalla lo siguiente:
    1. Los párrafos, ¿son iguales con el operador relacional ==?
    2. Los párrafos, ¿poseen el mismo contenido? Sin importar si están en mayúsculas o
    minúsculas.
    3. Mostrar los párrafos en mayúsculas.
    4. Mostrar los párrafos en minúsculas.
    5. Mostrar la primera letra en mayúscula de cada párrafo.
    6. Unir los párrafos con una coma.
 */

 /*Crear un programa que solicite al usuario que ingrese su primer nombre y su apellido
luego mostrarlo por consola, por separado, indicando cuál es su apellido primero y 
luego debajo entre comillas dobles, su nombre
Nombre y apellido deben ir con la primer letra en mayúscula
 */
