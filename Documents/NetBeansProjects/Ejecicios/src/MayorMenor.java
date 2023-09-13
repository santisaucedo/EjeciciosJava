import java.util.Scanner;

public class MayorMenor {
    
     public static void main(String[] args) {
    //Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
    
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
        
    System.out.println("Ingrese un numero");
    num1 = teclado.nextInt();
    System.out.println("Ingrese otro numero");
    num2 = teclado.nextInt();
    
    
         if (num1<num2 & num1!=num2) {
             
             System.out.println("El numero " + num1 + " es menor y el numero " + num2 + " es mayor" ); 
         
         }            
             else if (num1>num2 & num1!=num2)
             {
                     System.out.println("El numero " + num1 + " es mayor y el " + num2 + " es menor" );
                                         
                     }
           
                else {
                     System.out.println("Los numeros son iguales");
             }
                          
                
    }
   
}




    
   

