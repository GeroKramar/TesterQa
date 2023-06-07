
package javaapplication1;
import java.util.Scanner; 
import java.io.IOException;
public class JavaApplication1 {

       
        public static void main(String[] args) throws IOException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        System.out.println("INGRESE UN NUMERO");
        int num = leer.nextInt();
        System.out.println("INGRESE UN CARACTER");
        char caracter = leer.next().charAt(0);
        System.out.println("INGRESE UN BOOLEAN");
        boolean verificar = leer.nextBoolean();
        
        
        
        System.out.println(num + " " + verificar + " " + caracter);
        
         
       
       
        
    }
}
        