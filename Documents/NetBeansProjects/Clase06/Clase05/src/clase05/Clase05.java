package clase05;

public class Clase05 {

    public static void main(String[] args) {

        //metodo de String para extraer una subcadena
        String palabra = "Programacion";
        //El string representa una cadena de caracteres
        //donde cada caracter ocupa un lugar de posicion
        //las posiciones comienzan en 0

        String subPalabra1 = palabra.substring(3);
        System.out.println(subPalabra1);

        String subPalabra2 = palabra.substring(7, 9);
        System.out.println(subPalabra2);

        String palabra1 = "cuesta";
        String palabra2 = "a";
        String palabra3 = "l";
        String palabra4 = "e";

        //Escribir por consola:
        //"A cuesta, le cuesta."
        System.out.println(palabra2.toUpperCase()
                + " " + palabra1.substring(0, 1).toUpperCase()
                + palabra1.substring(1) + ", " + palabra3 + palabra4
                + " " + palabra1 + ".");

        // Operadores aritmeticos
        /*
        +suma
        -resta
        *multiplicion
        /division
        % modulo o resto de la division
        Son operadores binarios, por que necesitan 2 operandos.
        Los operandos son numericos y el resultado es numerico.
        Asignan el valor a una variable y se modifican utilizando un expresion
         */
        int nro1 = 10;
        int nro2 = 2;

        System.out.println("Multiplicacion");
        System.out.println(nro1 * nro2);

        System.out.println("Suma");
        System.out.println(nro1 + nro2);

        System.out.println("Resta");
        System.out.println(nro1 - nro2);

        System.out.println("Division");
        System.out.println(nro1 / nro2);

        System.out.println("Modulo");
        System.out.println(nro1 % nro2);

        System.out.println(nro1); //vale 10
        nro1 = 12; // ahora vale 12
        //con el = le asigna el valor que esta a la derecha
        System.out.println(nro1);

        nro1 += 2; // le suma 2 al valor de la variable
        //y le asigna ese valor a la variable.
        //es lo mismo que: nro1 = nro1 + 2;
        System.out.println(nro1); //ahora vale 14

        nro1 -= 2; // le resta 2 al valor de la variable
        //y le asigna ese valor a la variable.
        //es lo mismo que: nro1 = nro1 - 2;
        System.out.println(nro1); //ahora vale 12

        nro1 *= 2; // le multiplica 2 al valor de la variable
        //y le asigna ese valor a la variable.
        //es lo mismo que: nro1 = nro1 * 2;
        System.out.println(nro1); //ahora vale 24

        nro1 /= 2; // divide 2 al valor de la variable
        //y le asigna ese valor a la variable.
        //es lo mismo que: nro1 = nro1 / 2;
        System.out.println(nro1); //ahora vale 12

        nro1 %= 2; // divide 2 al valor de la variable
        //y le asigna ese valor a la variable.
        //es lo mismo que: nro1 = nro1 % 2;
        System.out.println(nro1); //ahora vale 0

        // Operadores incrementales y decrementales
        /*
       ++ incrementa en 1
       -- decrementa en 1
       Son operadores unarios, trabajan con un solo operador.       
         */
        System.out.println(++nro1); //incrementa el valor de la variable
        System.out.println(++nro1);
        System.out.println(--nro1); //decrementa el valor de la variable

        //Operadores relaciones
        /*
      > mayor
      < menor
      >= mayor o igual
      <= menor o igual
      == igual
      != distinto
      Son operadores binarios.
      Los operandos son numericos y el resultado es booleano.
         */
        nro1 = 15;
        nro2 = 13;

        System.out.println(nro1 == nro2);
        System.out.println(nro1 == nro2);
        System.out.println(nro1 != nro2);
        System.out.println(nro1 > nro2);

        //Tabla de verdad
        //Es una represenacion logica de resultados
        /*
        A | B  | AND | OR
        V | V  |  V  | V 
        V | F  |  F  | V
        F | V  |  F  | V
        F | F  |  F  | F
        
        Negacion (NOT)
        A NOT
        V F
        F V
        
        OPERADORES LOGICOS
        
        & AND (y logico)
        | or  (o logico)
        ! not (negacion)
        
        Los operadores son booleanos
        El resultado en boolenao
        
         */
        boolean log1 = true;
        boolean log2 = false;

        System.out.println("AND &&:");
        System.out.println(log1 && log2);//false

        System.out.println("OR ||:");
        System.out.println(log1 || log2);//true

        System.out.println("NOT !");
        System.out.println(!log1);//false
        System.out.println(!log2);//true

        //con un solo operador evaluda todas las condiciones
        //con dos operadores si l primera condicion 
        //determina el valor de verdad, y ya no evalua las siguientes
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        System.out.println("1.");
        System.out.print("a.");
        System.out.println(n1 + n2);

        System.out.print("b.");
        System.out.println(n3 - n1);

        System.out.print("c.");
        System.out.println(n1 * n3);

        System.out.print("d.");
        System.out.println(n3 / n2);

        n1 = 10;
        n2 = 20;
        n3 = 30;
        System.out.println("2.");
        System.out.print("a.");
        System.out.println("La suma de todas la variables es:" + (n1 + n2 + n3));
        System.out.print("b.");
        System.out.println("El promedio de todas las variables es:" + (n1 + n2 + n3) / 3);
        System.out.print("c.");
        System.out.println("El resto entre n2 y n1 es:" + (n2 % n1));

        n1 = 5;
        n2 = 10;

        System.out.println("3.");
        System.out.println("a.");
        System.out.println("n1 es igual a " + n1 + ",n2 es igual a " + n2 + " y n1 mas n2 es igual a " + (n1 + n2));

        final double IVA = 21;

        double remera = 59.90;
        double pantalon = 99.90;
        double campera = 149.90;

        System.out.println("Remera: " + (remera * (IVA / 100)+ remera));
        System.out.println("Pantalon: " + (pantalon * (IVA / 100)+pantalon));
        System.out.println("Campera: " + (campera * (IVA / 100)+ campera));
    }
}
