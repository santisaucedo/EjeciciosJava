/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase05;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tipos de datos var
        //aparecen a partir de JDK 10
        //el verdadero tipo de dato va a estar dado por el valor
        //que representa la literal de la variable
        
        //var var1 = 100; //int
        //var var2 = 'c'; //char
        //var var3 = "c"; //String
        //var var4 = true; //boolean
        //var var5 = 5.34f; //float
        //var var6 = 5.34; //double
        //este tipo de dato sólo puede ser usado para variables locales
        //no puede ser usado como parámetro de método
        //ni como atributo de clase
        
        /*
        Tipos de escritura - nomenclatura
        
        camel case -> estoEsUnaFraseEnCamelCase
        pascal case -> EstoEsUnaFraseEnPascalCase
        snake case -> esto_es_una_frase_en_snake_case
        */
        
        //constantes
        //Son espacios reservados de memoria en donde se guarda un dato
        //llevan un identificador y un tipo de dato asignado
        //Su valor no puede cambiar
        final double PI = 3.14;
        //para declarar una constante debemos agregar la palabra final
        //por convención las nombramos toda en mayúscula
        //PI = 3.15; error, no puedo cambiar el valor asignado
        
        
        //Operadores
        
        //Operador de concatenación
        String nombre = "Marcelo";
        String apellido = "López";
        
        System.out.println(nombre + " " + apellido);
        System.out.println("El nombre es: "+nombre);
        
        //Pasar un String a mayúsculas
        System.out.println(nombre.toUpperCase());
        //sólo modificamos la salida en mayúsculas
        //la variable sigue igual
        System.out.println(nombre);
        //si quiero cambiar la variable a mayúscula
        nombre = nombre.toUpperCase();
        System.out.println(nombre);
        
        //Pasar un String a minúsculas
        System.out.println(nombre.toLowerCase());
        //sólo modificamos la salida en minúsculas
        //la variable sigue igual
        System.out.println(nombre);
        //si quiero cambiar la variable a minúscula
        nombre = nombre.toLowerCase();
        System.out.println(nombre);
        
        
        
    }
    
}
