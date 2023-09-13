
package clase05;


public class Clase04ACuestaLeCuesta {

    public static void main(String[] args) {
        
               
//Operadores de concatenacion
            
            String nombre = "Marcelo";
            String apellido = "Lopez";
            System.out.println(nombre + " " + apellido);
        
        //Pasar un string a mayusculas
        System.out.println(nombre.toUpperCase());
        //solo modificamos la salida en mayusculas
        //la variable sigue igual
        nombre = nombre.toUpperCase();
        System.out.println(nombre);
        
        nombre = nombre.toLowerCase();
        System.out.println(nombre);
        
        //solo modificamos la salida en minuscula
        //la variable sigue igual
        
        String palabra1 = "uesta";
        String palabra2 = "subir";
        String palabra3 = "la";
        String palabra4 = "a";
        String palabra5 = "e";
        String palabra6 = "l";
        String palabra7 = "v";
        String palabra8 = "s";
        String palabra9 = "n";
        String palabra10 = "d";
        String palabra11 = "y";
        String palabra12= "medio";
        String palabra13 = "C";
        
        System.out.println(palabra4.toUpperCase()+ " " + palabra13  + palabra1 + 
                " " + palabra6+palabra5 + " " + palabra13.toLowerCase()+palabra1 + 
                " " + palabra2 + " " + palabra3 + " " + palabra13.toLowerCase()+palabra1 +
                "." + palabra11.toUpperCase() + " " + palabra5+palabra9 + " " + palabra12 +
                " " + palabra10+palabra5 + " " + palabra3 + " " + palabra13.toLowerCase()+palabra1 +
                ","+" "+ palabra7+palabra4+ " " + palabra11 + " " + palabra8+palabra5 + " " + 
                palabra4+palabra13.toLowerCase()+palabra1+".");
        
        
        
        
        
        
        
        
        
    }
    
}
