package token;

public class Clase17 {

    public static void main(String[] args) {

        System.out.println("*** Estructura for ***");
        //la estructura for es una estructura repetitiva

        //imprimir los numeros del 1 al 10 uno debajo del otro
        // Se compone de indice, condicion y contador
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //con while
        System.out.println("\nCon while\n");
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        //cuando se ejecuta una unica sentencia del for
        // se puede escribir en linea
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hola Mundo!");
        }

        /*
        La variable que esta dentro del for es una variable local.
        Solo se utiliza dentro del for, no tiene alcance (scope)
        fuera de la estructura. Al terminar el bucle for, desaparece,
        es decir, deja de ocupar un lugar en memoria.
              
         */
        // imprimir los numeros del 1 al 10 uno debajo del otro
        // sin imprimir los numeros 2,5 y 9
        for (int numero = 1; numero <= 10; numero++) {

            if (numero!=2 && numero!=5 && numero!=9) 
                System.out.println(numero);

        }

        // imprimir los numeros del 1 al 30
        // sin imprimir los numeros entre el 10 y el 20
        
        
        for (int j = 1; j <= 30; j++) {
            if (j<10 || j>20) {
                System.out.println(j);
            }   
        }
        // Imprimir los numeros del 1 al 20
        // salteando de 2 en 2, uno al lado del otro
        
        
        for (int i = 1; i <=20; i+=2) {
            System.out.print(i+ " ");
            }
            
        //imprimir los numeros del 10 al 1
        //uno debajo del otro
        System.out.println("-------------");
        for (int i = 10; i >0; i--) {
            System.out.println(i);
            }
        
        System.out.println("##########################");
        
        System.out.println("Funciones y procedimientos");
        
        /*
        Las funciones y procecdimientos son un bloque de codigo
        que contienen una o mas instrucciones, al cual podemos
        invocar para que sean ejecutadas.
        Las funciones y los procedimientos nos van
        a ayudar a hacer nuestro codigo mas legible y evitar
        codigo duplicado.
        */
        
        /*
        Los metodos de tipo funcion, siempre retornan un valor.
        En su declaracion deben indicar que tipo de valor retornan.
        En su cuerpo, deben contener la sentencia 'return', con el retorno
        del tipo de dato que se indico en su cabecera
        
        */
        
        
        System.out.println("Funciones");
        //invoco al metodo para darle valor a la variable
        int num1 = retornarNumeroDiez();
        System.out.println(num1);
        
        int num2 = 17;
        System.out.println(sumarDosEnteros(num1, num2));
        
    } //final del metodo main

    public static int retornarNumeroDiez(){
        return 10;
        // Asi se crea un funcion, en el encabezado le pongo el tipo de 
        //dato que devuelve .
    }
    
    public static int sumarDosEnteros(int nro1, int nro2){
        return nro1+nro2;
    }
    
} //final de la clase
