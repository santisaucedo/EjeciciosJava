
package Ejercicios3;

import java.util.Scanner;

public class Ejercicios3 {
    public static void main(String[] args) {
        
        /*
        Crear un programa que tenga un metodo al cual se le ingrese
        una frase como parametro y luego imprima por consola la misma frase
        repetiva 7 veces.
        */
        String fraseNueva = "Lalala";
        FraseRepetida(fraseNueva);
        
        /*
        Crear un programa que reciba 3 parametros y calcule la suma,
        resta, multiplicacion, division y el resto de dos numero con decimales.
        Las consigas para lograrlo son:
        * Crear un metodo que no retorne nada, que reciba los 3
        parametros (2 numeros con decimales y el caracter de la operacion)
        *Crear los metodos de las operaciones que retornen el resultado
        con decimales
        * Mostrar por consola un mensaje que indique el resultados
        y la operacion realizada.
        
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para realizar la operacion: ");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double num2 = teclado.nextDouble();
        System.out.println("Elija la operacion a realizar seleccionando el caracter: \n +)Suma\n -)Resta\n *)Multiplicacion\n /)Divison\n %)Resto\n");
        String eleccion = teclado.next();
         
        Calculadora(num1,num2, eleccion);
        
    } 
     
   
    
    public static void FraseRepetida (String Frase){
        for (int i = 0; i < 7; i++) {
            System.out.println(Frase);
        }
      }
    
    public static void Calculadora (double num1, double num2, String eleccion){
      
   switch (eleccion){
            case "+" : System.out.println("Elijo la opcion suma y el resultado es: " + (num1+num2));break;
            case "-" : System.out.println("Elijo la opcion resta y el resultado es: " + (num1-num2));break;
            case "*" : System.out.println("Elijo la opcion multiplicacion y el resultado es: " + (num1*num2));break;
            case "/" : if (num2==0) {
                    System.out.println("No se puede realizar la división por cero");break;
                } else {
                    System.out.println("La división de los números es: " + (num1/num2));break;
                }
            case "%" : if (num2==0) {
                    System.out.println("No se puede realizar resto por cero");break;
                } else {
                    System.out.println("Eligio la opcion resto y el resultado es:  " + (num1%num2));break;
                } 
                  default : {
                System.out.println("La opcion no es valida");
                
                            } 
            
                    }
   
                }
    
    
    
}  