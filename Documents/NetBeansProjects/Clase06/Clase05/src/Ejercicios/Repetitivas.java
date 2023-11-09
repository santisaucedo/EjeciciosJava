

package clase15;

import java.util.Scanner;


public class Repetitivas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //bucles
        System.out.println("**Estructura while**");
        
        //la estructura while evalúa una condición y 
        //mientras sea verdadera, ejecuta las sentencias
        //del cuerpo del while
        
        //imprimir los números del 1 al 10 uno debajo del otro
        int contador = 1;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }
        
        //error de bucle infinito
        contador = 1;
//        while (contador <= 10){
//            System.out.println(contador);
//        }
        
//        while (contador >= 1){
//            System.out.println(contador);
//            contador++;
//        }
        
        System.out.println("**Estructura do-while**");
        //el do-while ejecuta al menos una vez las sentencias
        //y luego evalúa la condición para seguir ejecutando
            
        //sumar los números enteros positivos ingresados por teclado
        int numero = 0;
        int suma = 0;
        
//        do {
//            System.out.println("Ingrese un número entero positivo para sumar"
//                    +" ó el 0 para salir, luego presione enter:");
//            numero = teclado.nextInt();
//            if (numero > 0) suma += numero;
//        }while(numero != 0);
//        
//        System.out.println("Usted ingresó el 0 para salir.");
//        System.out.println("La suma de números enteros positivos es de: "+suma);
        
        System.out.println("**sentencia break**");
        
        //la sentencia break genera un corte en la secuencia de comandos
        //y saca la ejecución del bloque de código
        
        //por ejemplo, si la suma supera los 100, cortamos la ejecución
//        numero=0;
//        suma=0;
//        
//        do {
//            System.out.println("Ingrese un número entero positivo para sumar"+
//                    " ó el 0 para salir, luego presione enter:");
//            numero = teclado.nextInt();
//            if (numero > 0) suma += numero;
//            if (suma > 100) break;
//        }while(numero != 0);
//        
//        System.out.println("Usted ingresó el 0 para salir.");
//        System.out.println("La suma de números enteros positivos es de: "+suma);
        
        
        System.out.println("**sentencia continue**");
        
        //la sentencia continue genera un corte en la secuencia de comandos
        //y vuelve al comienzo del bucle
        
        //siguiendo el ejemplo anterior, sólo sumaremos los números pares:
        suma=0;
        
        do {
            System.out.println("Ingrese un número entero positivo para sumar"
                    +" ó el 0 para salir, luego presione enter:");
            numero = teclado.nextInt();
            if (numero%2 != 0) continue;
            if (numero > 0) suma += numero;
            if (suma > 100) break;
        }while(numero != 0);
        
        System.out.println("Usted ingresó el 0 para salir.");
        System.out.println("La suma de números enteros positivos pares es de: "+suma);

        
    }
}
