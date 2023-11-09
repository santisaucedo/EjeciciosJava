
package Ejercicios;

import java.util.Scanner;


public class Clase09 {

    
    public static void main(String[] args) {
      
        
        System.out.println("** Clase System **");
        
        /*
        
        La clase System es un intermediario entre la JVM
        y el entorno de ejecucion en el que estamos ejecutando
        nuestro programa.
        
        Como la maquina virtual de Java puede ejecutarse 
        multiples plataformas, la clase System nos abstrae de 
        la plataforma sobre la que se esta ejecutando
        
        */
        
        /*
        Los atributos mas clasicos son out, err, in
        Representan stream de entrada y salida son 
        atributos finales y estaticos
        out es un stream de salida sincronizado
        err es un stream de salida desincronizado
        in es un stream de entrada sinconizado
        */
        
        
        /*
        "stream" (flujo o corriente), es una secuencia de datos
        que se procesa o transmite de manera secuencial, en lugar
        de cargarse o procesarse en su totalidad antes de usarse
        */
        
        System.out.println("Hola 1");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
        System.out.println("Hola 4");
        System.out.println("Hola 5");
        System.out.println("Hola 6");
        System.out.println("Hola 7");
        System.out.println("Hola 8");
        System.out.println("Hola 9");
        System.out.println("Hola 10");
        System.out.println("Hola 11");
        System.out.println("Hola 12");
        System.out.println("Hola 13");
        System.out.println("Hola 14");
        System.out.println("Hola 15");
        System.out.println("Hola 16");
        System.out.println("Hola 17");
        System.out.println("Hola 18");
        System.out.println("Hola 19");
        System.out.println("Hola 20");
        
        System.err.println("Ocurrio un error!");
       // se utiliza para mandar errores de mensaje por consola
        
        //.exit()
        //cierra el runtime, es decir, que finaliza el programa
        //System.out.println("Ejecuto el metodo exit()");
        //System.exit((0));
        //System.out.println("Esta sentencia no se ejecuta.");
        //el parametro 0 indica que no hubo error al terminar
        //el programa 1 indica que hubo error al terminar el programa.
        // Ctrl + Shift + T ---> Atajo para Comentario
        //try catch buscar
        
        /*
        diccionario getenv()
        este metodo devuelve un diccionario de propiedades del
        entorno de ejcucion, es decir, propiedades del sistema,
        que varian segun SO y version Java
        */
        
        //System.out.println("\ngetenv()");        
        //System.out.println(System.getenv());
        
        
        //getPropieties() representa un mapa o vector asociativo
        //que es igual en todas las configuraciones.
        System.out.println(System.getProperties()); //propiedades del sistema
        System.out.println(System.getProperty("os.name")); //nombre del SO
        System.out.println(System.getProperty("os.version")); //version del SO
        System.out.println(System.getProperty("os.arch"));//arquitectura (32 o 64bits)
        System.out.println(System.getProperty("java.version")); //version de Java
        System.out.println(System.getProperty("user.name")); //nombre de usuario del SO
        System.out.println(System.getProperty("user.home")); //directorio del usuario
        
        
        //el atributo in representa un stream de entrada y es
        //sincronizado, permite ingresar datos desde la terminal
        // del sistema, por ejemplo con la clase Scanner
        
        System.out.println("\n** Clase Scanner **");
        
        Scanner teclado = new Scanner(System.in);
        //newo + tab ---> crea la estructura de un nuevo objeto
        Object object = new Object();
        
        //Con control espacio elijo que es lo que quiero usar
        
        System.out.println("Ingrese nombre: ");
        String nombre = teclado.next();
  
        //el metodo next () captura hasta el primer espacio
        //next() detiene el hilo de ejecucion, el programa
        //se queda esperado que el usuario ingrese el dato
        // y presione enter.
   
        System.out.println("Ingrese sus nombres:");
        String nombres = teclado.nextLine();
        System.out.println("Sus nombres son " + nombres);
        
        System.out.println("Ingrese su edad:");
        int edad = teclado.nextInt();
        System.out.println("Su edad es: " + edad + " años. ");
        
        
        /*
        Solicitar al usuario que ingrese 3 numeros enteros
        Luego informa:
        1) la suma de los dos primeros
        2) la resta de los dos segundos
        3) el resto entre el primero y el segundo
        4) la suma total
        5) el promedio
       
        */
        
        
        System.out.println("Por favor ingrese 3 numeros enteros");
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = teclado.nextInt();
        
        int sumaDosnumeros = num1+num2;
        int sumaTotal = num1+num2+num3;
        int restaSegundos = num2-num3;
        int restoPrisegu = num1%num2;
        int promedio = (num1+num2+num3)/3;        
        
        System.out.println("1. La suma de los dos primeros es: " + sumaDosnumeros);
                
        System.out.println("2. La resta de los dos segundos es: " + restaSegundos);
                
        System.out.println("3. El resto entre el primero y el segundo es: " + restoPrisegu);
        
        System.out.println("4. La suma total de todos es: " + sumaTotal);
             
        System.out.println("5.El promedio es: " + promedio );
       
         
        
    }
    
}
