
package ejercicios3;


public class Arreglos {
    public static void main(String[] args) {
        // si tuvieramos que guardar varios numeros en varibles:
        
        
        int varibale1 = 456;
        int variable2 = 34;
        int varibale3 = 98;
        
        /* 
        Podemos generar un conjunto de variables y guardarlas
        dentro de un vector o arreglo bajo un mismo nombre que las agrupe
        a todas.
        Podemos acceder a cada valor de variable por medio del indice.
        Los indices comienzan en 0 y finalizan en la posicion representada
        por la longitud -1.
        Optimizamos la lectura de la informacion al acceder por un mismo nombre
        a distintas varibales y no por el nombre de cada una.
        */
     
        System.out.println("*******Arreglos o Arrays***********");
        
        /*
        declaracion:
        tipoDeDato[] identificador; --> declaracion
        tipoDeDato identificador[]; --> declaracion
        identificador = new tipoDeDato[n]; -> definicion de longitud (la longitud
        es la cantidad de elementos que va a guardar)
        */
        
        
        float[] temperaturas; //declaracion
        temperaturas = new float [10]; //definimos la longitud en 10
        float temperaturas2[];
        temperaturas2 = new float [12]; //definimos la longitud en 12
        
        String[] nombres = new String[5];
        
        //asignacion de valores a las variables de un arreglo
        temperaturas[0] = 25.43f;
        temperaturas[1] = 12.56f;
        temperaturas[2] = 10.43f;
        temperaturas[3] = 4.43f;
        temperaturas[4] = 75.43f;
        
        nombres[3] = "Juan";
        //nombres[5] = "Lucas"; error excede el rangho
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
