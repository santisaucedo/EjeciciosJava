import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
   int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();
        if(numero < 0) {
            System.out.println ("El numero " + numero + " es negativo\n");
        }
        else {
            System.out.println ("El numero " + numero + " es positivo\n");
        } if(numero%2 == 0) {
            System.out.println ("El numero " + numero + " es par\n");
        }
        else {
            System.out.println ("El numero " + numero + " es impar\n");
        }
    }
}