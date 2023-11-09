package Ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        /*
	Crear un programa que simule la petición de
	una opción según el siguiente menú y muestre
	en pantalla que ha ingresado a la opción
	seleccionada con las opciones siguientes:
	        
	¡Gracias por contactarte con nosotros!
	¿En qué podemos ayudarte?
	A) Documentación
	B) Cotización
	C) Asistencia
	D) Siniestros
	E) Información de Pagos
	F) Otras Consultas
	G) Anulación
	Escribe la letra de la opción seleccionada.
	
	Debe mostrarse:
	Has elegido Documentación (o la opción que haya elegido)

         Scanner teclado = new Scanner(System.in);
      
        
          
         System.out.println("¡Gracias por contactarte con nosotros!\n" +
"	¿En qué podemos ayudarte?\n" +
"	A) Documentación\n" +
"	B) Cotización\n" +
"	C) Asistencia\n" +
"	D) Siniestros\n" +
"	E) Información de Pagos\n" +
"	F) Otras Consultas\n" +
"	G) Anulación\n" );
         
                
        System.out.println("Por favor, escribe la letra de la opción deseada y presiona enter");
        String opcion = teclado.nextLine();

         
        switch (opcion){
            case "a": System.out.println("Has elegido Documentación"); break;
            case "b": System.out.println("Has elegido Cotización"); break;
            case "c": System.out.println("Has elegido Asistencia"); break;
            case "d": System.out.println("Has elegido Siniestros"); break;
            case "e": System.out.println("Has elegido Información de Pagos"); break;
            case "f": System.out.println("Has elegido Otras Consultas"); break;
            case "g": System.out.println("Has elegido Anulación"); break;
            default: System.out.println("Esa opción no existe");
        }
        
        
        
        
        
        
        


/*
        Solicitar al usuario que ingrese dos números.
        Luego ofrecerle un menú con las siguientes opciones:
        1-suma 2-resta 3-multiplicación 4-división
        Finalmente, mostrar el resultado de la operación
        aritmética elegida.
        


         
        int num1;
         int num2;
   
        System.out.println("Por favor, ingrese un numero y presione enter");
        num1 = teclado.nextInt();
        
        System.out.println("Por favor ingrese otro numero y presione enter");
        num2 = teclado.nextInt();
        
        System.out.println("Por favor, ingrese la operacion que quiere realizar:\n"
                + "1) Suma\n" + "2) Resta\n" + "3) Multiplicacion\n" + "4) Division\n");
        int operacion = teclado.nextInt();
        
         switch (operacion){
            case 1: System.out.println("El resultado de la suma es: " + (num1+num2)); break;
            case 2: System.out.println("El resultado de la resta es:" + (num1-num2)); break;
            case 3: System.out.println("El resultado de la multiplicacion es: " + (num1*num2)); break;
            case 4: System.out.println("El resultado de la division es: " + (num1/num2)); break;
            default: System.out.println("Has elegido una opcion incorrecta, zonzo");
         }
        
         */
 /*
        Crear una aplicación que valide el ingreso a una
        plataforma Online Banking a través de una clave Token.
        
        Se debe tener en cuenta lo siguiente:
        * La Clave Token debe ser un número aleatorio
        de 6 dígitos. (Math.random)
        * El cliente debe ingresar los campos Usuario,
        Contraseña y Clave Token (todos obligatorios).
        * El campo Usuario no distingue minúsculas
        o mayúsculas.
        * El campo Contraseña es sensible a las
        minúsculas y mayúsculas.
        * La clave Token aleatoria se le informa al usuario al 
        pedirle que ingrese las credenciales.
        * El cliente solo posee 3 intentos de logueo. Si
        alcanza los 3 intentos fallidos de forma
        consecutiva, la aplicación deberá informar al
        usuario que debe dirigirse a la sucursal del
        banco más cercana para poder desbloquear
        sus credenciales.
        * Por cada intento fallido, la aplicación debe
        preguntar al cliente si desea continuar
        colocando las credenciales de manera
        correcta.
        * Si el cliente coloca las credenciales de forma
        correcta, deberá informar que ha ingresado
        correctamente al Online Banking.
         */
        // Por favor ingrese su usuario, clave y token
        Scanner teclado = new Scanner(System.in);
        double token = (int)Math.round(Math.random()*999999);
        
        System.out.println("Por favor ingrese su usuario para registrarse");
        String usuario = teclado.next();
        System.out.println("Por favor ingrese su clave");
        String clave = teclado.next();
        System.out.println("Su Token aleatorio es: " + token);
        
        int intentos = 1;
        
        do {
             System.out.println("Por favor ingrese su usuario para iniciar sesion");
        usuario = teclado.next();
        System.out.println("Por favor ingrese su clave");
        clave = teclado.next();
        System.out.println("Ingrese su token");
        int token2 = teclado.nextInt();
        
        if (usuario.equalsIgnoreCase(usuario) != clave.equals(clave));
        if(token!=token2)
        {
        System.out.println("Sus credenciales no son correctas,tiene 3 intentos restantes, quiere continuar?");
        intentos ++;
        } }while(intentos>3) ;
       
                 
     
    }

}

