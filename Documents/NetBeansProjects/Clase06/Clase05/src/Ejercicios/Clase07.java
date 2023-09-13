/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.text.DecimalFormat;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Dados n1=5, n2=10 y n3=20. Informar:
        a) n1+n2
        b) n3-n1
        c) n1*n3
        d) n3/n2
        */
        
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        
        //también se podría expresar de la siguiente manera
        //int n1=5, n2=10, n3=20;
        
        int a = n1 + n2;
        int b = n3 - n1;
        int c = n1 * n3;
        int d = n3 / n2;
        
        System.out.println("El resultado de n1 + n2 es: " + a);
        System.out.println("El resultado de n3 - n1 es: " + b);
        System.out.println("El resultado de n1 * n3 es: " + c);
        System.out.println("El resultado de n3 / n2 es: " + d);
        
        /*
        Dados n1=10, n2=20 y n3=30. Informar :
        a) El total de la suma de todas las variables
        b) El promedio
        c) El resto entre n2 y n1
        */
        
        n1 = 10;
        n2 = 20;
        n3 = 30;
        
        int total = n1 + n2 + n3;
        int promedio = total / 3;
        int resto = n2 % n1;
        
        System.out.println("El total de la suma de todas las "
                + "variables es: " + total);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El resto entre n2 y n1 es: " + resto);
        
        /*
        Declarar dos variables n1=5 y n2=10.
        Utilizando concatenación entre las variables y los literales, 
        mostrar en pantalla la siguiente expresión:
        n1 es igual a 5, n2 es igual a 10 y n1 más n2 es igual a 15.
        */
        
        n1 = 5;
        n2 = 10;
        
        System.out.println("n1 es igual a "+n1+", n2 es igual a "+n2+
                " y n1 más n2 es igual a "+ a +".");
        
        /*
        Haciendo uso de la constante IVA=21,calcular el precio con IVA
        de los siguientes productos e informar:
        a) remera:$59.90
        b) pantalón:$99.90
        c) campera:$149.90
        */
        
        double remera = 59.90;
        double pantalon = 99.90;
        double campera = 149.90;
        final double IVA = 21;
        double remeraConIva = (remera / 100) * IVA + remera;
        double pantalonConIva = (pantalon / 100) * IVA + pantalon;
        DecimalFormat df = new DecimalFormat("#.##");
        String precioRedondeado = df.format(remeraConIva);
        System.out.println("El precio con IVA de la remera es: $"+precioRedondeado);
        precioRedondeado = df.format(pantalonConIva);
        System.out.println("El precio con IVA del pantalón es: $"+precioRedondeado);
        // ************************************************
        
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
        
        
        
        
        
        
        
        
    }
    
}
