import java.util.Scanner;

public class Suma {
    
    public static void main(String[] args) {
    //Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
    
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
   
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextInt();
        
        System.out.println("El resultado de la suma es: " +  (num1+num2));
               
       
    
    }
    

}