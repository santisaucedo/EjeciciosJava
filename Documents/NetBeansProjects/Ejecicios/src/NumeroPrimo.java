import java.util.Scanner;
public class NumeroPrimo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean primo=true;
        int num;
        String respuesta, s, S;
        do {
            System.out.println ("Introduce numero");
            num = teclado.nextInt();
            for(int ind = 2; ind < num; ind++){
                if(num%ind == 0){
                    primo = false;
                }
            }
            if(primo == true){
                System.out.println (num + " es primo");
            }
            else{
                System.out.println (num + " no es primo");
            } System.out.println ("Quieres intoducir otro numero? s/n");
            respuesta=teclado.next();
        }while(respuesta.equals("s") || respuesta.equals("S"));
    }
}
