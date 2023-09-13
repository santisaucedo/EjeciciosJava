/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase05;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //float - ocupa 4 bytes y tiene una precisión de 32 bits
        float j = 14.25f; //debemos colocarle una f al final de la literal
        //los decimales se separan con punto, no utilizamos la coma.
        System.out.println(j);
        
        //double - ocupa 8 bytes y tiene una precisión de 64 bits
        double k = 23.45; //no hace falta agregar ninguna letra a la literal
        System.out.println(k);
        
        //diferencia entre float y double
        float fl = 10f;
        double dl = 10;
        System.out.println(fl / 3);
        System.out.println(dl / 3);
        
        //boolean - ocupa 1 byte y almacena solo dos valores
        //true y false (verdadero y falso)
        boolean l = true;
        boolean m = false;
        System.out.println(l);
        System.out.println(m);
        
        //char - ocupa 2 bytes y almacena un entero que representa
        //un caracter de la tabla unicode
        char n = 65; //almacena el 65, pero representa A
        System.out.println(n);
        n += 32;
        System.out.println(n);
        //también podemos almacenar al caracter directamente
        n = 'f'; //el caracter debe ir entre comillas simples
        System.out.println(n);
        
        //String - no es un tipo de dato primitivo
        //representa una cadena de caracteres
        String o = "Hola"; //la literal debe ir entre comillas dobles
        System.out.println(o);
        String p = "Hola soy una cadena de caracteres / % $ 45";
        System.out.println(p);
        
        //tipos de datos var
        //el verdadero tipo de dato va a estar dado por el valor
        //que representa la literal de la variable
        
        
    }
    
}
