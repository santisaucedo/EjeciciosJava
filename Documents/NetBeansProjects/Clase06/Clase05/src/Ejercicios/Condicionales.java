

package Ejercicios;


public class Condicionales {
    public static void main(String[] args) {
        //condicionales
        
        System.out.println("**Estructura if**");
        
        /*
        
        if (){ entre paréntesis va la condición a evaluar
            sentencias que se ejecutan si la condición es
            verdadera
        } fin del if
        
        */
        int num1 = 50;
        int num2 = 100;
        
        if (num1 > num2){
            System.out.println("El número1 es mayor al número2");
        }
        System.out.println("Terminó la estructura if");
        
        if (num1 != 20) {
            System.out.println("El número1 es distinto a 20");
        }
        
        boolean log1 = true;
        
        if (log1) { //el booleano no se compara con == true
            System.out.println("Log1 es verdadero");
        }
        
        //podemos escribir el if en una línea
        //sólo cuando es una única sentencia
        if (num1 == 50) System.out.println("El num1 es 50");
        
        //si se ejecuta más de una instrucción, entonces
        //el cuerpo del if debe ir entre las llaves
        if (num1 > 20 && log1 ){
            System.out.println("El número1 es mayor a 20");
            System.out.println("Log1 es verdadero");
        }
        
        System.out.println("**Estructura if-else**");
        
        if (num1 > num2){
            System.out.println("El número1 es mayor al número2");
        } else {
            System.out.println("El número1 no es mayor al número2");
        }
        
        //también se puede escribir sin llaves, en línea
        //Siempre que se ejecute una sola sentencia por bloque
        if(num1 > num2) System.out.println("El primer número es mayor");
        else System.out.println("El primer número no es mayor");
        
        /*
        Ejercicio:
        dado un usuario="pepito"
        y una contraseña="1234"
        Diseñar un algoritmo que 
        si ingresa bien ambos datos informe: "Bienvenido pepito"
        de lo contrario, que informe: "ERROR - credenciales incorrectas"
        */
        
        String usuario = "pepito";
        String clave = "1234";
        
        if (usuario.equals("pepito") && clave.equals("1234")) {
            System.out.println("Bienvenido pepito");
        } else {
            System.out.println("ERROR - credenciales incorrectas");
        }
        
        //otra forma de encarar el ejercicio con if-else anidado
        if (usuario.equals("pepito")){
            if (clave.equals("1234")){
                System.out.println("Bienvenido "+usuario);
            }else{
                System.out.println("La contraseña es incorrecta.");
            }
        }else {
            System.out.println("El usuario es incorrecto");
        }
        
        
        System.out.println("**Estructura if-else if-else**");
       
        
        if (num1 > num2){
            System.out.println("El num1 es mayor que el num2");
        }else if(num1 < num2){
            System.out.println("El num2 es mayor que el num1");
        }else {
            System.out.println("Ambos números son iguales.");
        }
        
        int edad = 70;
        String genero = "masculino";
        
        if (edad >= 65 && genero.equals("masculino")){
            System.out.println("Se puede jubilar.");
        }else if (edad >= 60 && genero.equals("femenino")){
            System.out.println("Se puede jubilar.");
        }else {
            System.out.println("No puede jubilarse.");
        }
        
        if (edad >= 65 && genero.equals("masculino") || edad >= 60 && genero.equals("femenino")){
            System.out.println("Se puede jubilar.");
        } else {
            System.out.println("No puede jubilarse.");
        }
        
        System.out.println("**Estructura if-else anidado**");
        //dados 3 números distintos, determinar cuál es el mayor
        num1 = 30;
        num2 = 10;
        int num3 = 50;
        
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El num1 es el mayor.");
            }else {
                System.out.println("El num3 es el mayor.");
            }
        } else if (num2 > num3){
            System.out.println("El num2 es el mayor.");
        }else {
            System.out.println("EL num3 es el mayor.");
        }
        
        boolean tienePasaporte = true;
        edad = 18;
        
        if (tienePasaporte){
            if (edad >= 18) {
                System.out.println("Puede viajar solo");
            }else {
                System.out.println("Puede viajar, pero acompañado");
            }
        }else {
            System.out.println("No puede viajar");
        }
        
        /*
        Ejercicio
        Según la edad de una persona, mostraremos los siguientes mensajes
        - menos de 13 años: "eres un niño"
        - entre 13 y 17 años: "eres un adolescente"
        - entre 18 y 39 años: "eres joven"
        - entre 40 y 70: "eres maduro"
        - mayor de 70: "eres anciano"
        */
        
        edad = 71;
        
        if (edad <= 12){
            System.out.println("Eres un niño");
        }else if((edad >=13) && edad<=17){
            System.out.println("Eres un adolescente");
        }else if((edad >=18) && edad<=39){
            System.out.println("Eres joven");
        }else if((edad >=40) && edad<=70){
            System.out.println("Eres maduro");
        }else {
            System.out.println("Eres anciano");
        }
        
        if (edad < 13){
            System.out.println("Eres un niño");
        } else if (edad <= 17){
            System.out.println("Eres un adolescente");
        } else if (edad <= 39){
            System.out.println("Eres joven");
        } else if (edad <= 70){
            System.out.println("Eres maduro");
        } else {
            System.out.println("Eres anciano");
        }
        
        System.out.println("**Operador ternario**");
        
        edad = 2;
        String mensaje;
        
        if (edad >= 18){
            mensaje = "Es mayor de edad.";
        } else{
            mensaje = "No es mayor de edad!";
        }
        
        System.out.println(mensaje);
        
        //operador ternario
        mensaje = (edad >= 18) ? "Es mayor de edad." : "No es mayor de edad!";
        System.out.println(mensaje);
        
        boolean esMayorDeEdad = (edad >= 18) ? true:false;
        System.out.println(esMayorDeEdad);
        
        System.out.println("**Estructura switch**");
        
        //si quisiéramos indicar un color de acuerdo al siguiente esquema:
        //1=Rojo 2=Azul 3=Celeste 4=Violeta (cualquier otro número)=Negro
        //con if-else podríamos hacer así:
        
        int nroColor = 3;
        
        if (nroColor == 1){
            System.out.println("Rojo");
        } else if (nroColor == 2){
            System.out.println("Azul");
        } else if (nroColor == 3){
            System.out.println("Celeste");
        } else if (nroColor == 4){
            System.out.println("Violeta");
        } else {
            System.out.println("Negro");
        }
        
        //estructura switch
        //switch permite la evaluación de una variable
        //con múltiples opciones.
        //de cumplirse la condición del case, se ejecuta 
        //lo que tenga a continuación hasta encontrar un break
        //el break corta la ejecución del código y lo saca de la estructura
        switch (nroColor){
            case 1: System.out.println("Rojo"); break;
            case 2: System.out.println("Azul"); break;
            case 3: System.out.println("Celeste"); break;
            case 4: System.out.println("Violeta"); break;
            default: System.out.println("Negro"); 
        }
        
        int dia = 5;
        
        switch (dia){
            case 1: System.out.println("El día es lunes"); break;
            case 2: System.out.println("El día es martes"); break;
            case 3: System.out.println("El día es miércoles"); break;
            case 4: System.out.println("El día es jueves"); break;
            case 5: System.out.println("El día es viernes"); break;
            case 6: System.out.println("El día es sábado"); break;
            case 7: System.out.println("El día es domingo"); break;
            default: System.out.println("El día no existe!");
        }
        
        //en los casos que no haya break, funcionaría como un OR
        
        String opcion =  "C";
        
        switch (opcion){
            case "s":
            case "S":
                System.out.println("Sale del sistema"); break;
            case "c":
            case "C":
                System.out.println("Continúa"); break;
            default: System.out.println("Opción no válida.");
        }
        
        dia = 60;
        /*
        switch (dia){
            case 1, 2, 3, 4, 5:
                System.out.println("Es día de semana"); break;
            case 6, 7:
                System.out.println("Es fin de semana!"); break;
            default:
                System.out.println("El día no existe!");
        }
        
        //la estructura switch no admite expresiones del tipo
        //float, double ni long
        
        //expresiones switch aparecen a partir de JDK 12
        //se reemplazan los : por las ->
        //se elimina la sentencia break
        
        dia = 6;
        
        mensaje = switch (dia){
            case 1 -> "El día es lunes";
            case 2 -> "El día es martes";
            case 3 -> "El día es miércoles";
            case 4 -> "El día es jueves";
            case 5 -> "El día es viernes";
            case 6 -> "El día es sábado";
            case 7 -> "El día es domingo";
            default -> "El día no existe!!";
        };
        
        System.out.println(mensaje);
        
        */
        
    }
}
