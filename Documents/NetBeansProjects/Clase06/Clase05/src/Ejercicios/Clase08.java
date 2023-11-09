
package clase08;

import java.text.DecimalFormat;

public class Clase08 {

    
    public static void main(String[] args) {
                
        //String
        
        //el String contiene un vector de caracteres
        System.out.println("** Clase String **");
        
        //podemos crear un objeto de la clase String de varias maneras
        String texto1 = "Cadena de Texto!";
        String texto2 = new String("hola");
        String texto3 = "hola";
        
        //métodos para comparar
        //al comparar con el operador == va a comparar que sean el mismo
        //objeto en memoria
        System.out.println(texto2 == "hola"); //false
        System.out.println(texto2 == texto3); //false
        
        //Para comparar cadenas de caracteres teniendo en cuenta
        //su contenido, se utilizan los métodos
        //.equals() .equalsIgnoreCase()
        System.out.println(texto2.equals("hola")); //true
        //equals() tiene en cuenta las mayúsculas y minúsculas
        System.out.println(texto2.equals("HOLA")); //false
        //el equalsIgnoreCase() ignora las mayúsculas y minúsculas
        System.out.println(texto2.equalsIgnoreCase("HOLA")); //true
        
        // contains ()
        // devuelve un booleano si contiene la subcadena dada
        System.out.println(texto1.contains("hola")); //False
        System.out.println(texto2.contains("hola")); // True
        
        //.length()
        // devuelve la longitud del vector, es decir,  cuantos caracteres tiene
        
        System.out.println(texto1.length()); //16
        System.out.println(texto2.length()); //4
          
               
        //.isEmpty()
        //indica si la esta vacia, es decir,
        //si su longitud es igual a 0
        System.out.println(texto1.isEmpty()); //false
        
        //.isBlank() aparece a partir de JDK 11
        //indica si una cadea esta vacia o en blanco
        // por ejemplo si solo contiene espacios, tabulaciones
        //y/o saltos de linea
        
        String texto4 = "";
        System.out.println(texto4.isEmpty()); //true
        //System.out.println(texto4.isBlank()); //true
        
        
        //charAt()
        //devuelve el caracter del indice dado
        
        System.out.println(texto1.charAt(3)); //e
        System.out.println(texto2.charAt(3)); //a
        
        //Los parametros son los valores de entrada
              
        //.indexOf()
        //devuelve el inidice de la primera ocurrencia de la 
        //subcadena. Si no encuentra la subcadena, devuelve -1
        
        System.out.println(texto1.indexOf("texto")); 
        System.out.println(texto1.indexOf("Texto")); 
        
        //.trim()
        //quita los espacios de adelante y atras
              
        texto3 = "       Buenas noches       ";
        System.out.println(texto3);
        System.out.println(texto3.trim());
        
        
        //.starsWith()   .endsWith()
        //devuelve un booleano que indica si la cadena comienza
        //o termina con un texto determinado
        System.out.println(texto1.startsWith("hola")); //false
        System.out.println(texto2.startsWith("hola")); //true
        System.out.println(texto1.endsWith("exto")); //false
        System.out.println(texto1.endsWith("exto!")); //true
        
        
             
        //metodos replace
        //reemplaza un caracter por otro
         System.out.println(texto1.replace('e', 'i'));
        //reemplaza una cadena de caracteres por otra
        System.out.println(texto1.replace ("Texto", "caracteres"));
        //reemplaza solo la primera vez que aparezca
        texto3 = "manzana, manzana, naranja";
        System.out.println(texto3.replaceFirst("manzana", "banana"));
        
        System.out.println(texto3.replaceAll("manzana","banana"));
        //si bien el replace () tambien reemplaza todas las veces que
        //aparezca la cadena, el .replaceAll() es mas potente, nos
        //permite buscar y reemplazar patrones de expresiones regulares
        //una expresion regular es una secuencia de caracteres
        //que definen un patron de busqueda
        
        //anteriormente ya  vimos
        //.toUpperCase() . toLowerCase .substring()
         
        // \n salta de linea
        System.out.println("Hola \nMundo");
        
        // \t tabulacion
        System.out.println("Hola\tMundo");
        
        // \" comillas doble
        System.out.println("\"Hola Mundo!\"");
        
        // \' comillas simples
        System.out.println("\'Hola Mundo!\'");
        
        // \\barra invertida
        System.out.println("\\Hola Mundo!");
        
        
        
        
        
        
        
    }
    
}
