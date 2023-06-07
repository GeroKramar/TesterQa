package De;
import java.util.Scanner;

public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el valor 2");
        int num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    
    
   public static void esMultiplo(int num1,int num2){
       boolean validacion = false;
       
       
       if(num1 % num2 == 0){
           System.out.println("ES MULTIPLO");
           
       }else{
           System.out.println("NO ES MULTIPLO");
       }
       
       
       
   }

}