package Ejercicio11_2;
import java.util.Scanner;

public class Ejercicio_11 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase = leer.nextLine();
        int cantidadCaracter = frase.length();
        int validacion = frase.length() - 1;
        
        
        if (frase.substring(validacion,cantidadCaracter).equals(".")){
            System.out.println("La frase codificada es: " + codificarFrase(frase, cantidadCaracter));
                    
                    
                  
            
        }else{
            System.out.println("FRASE INVALIDA");
        }
          
        
         
        
        
       
    }
    
    public static String codificarFrase(String frase,int cantidadCaracter ){
        
        System.out.println("ENTRASTE A LA FUNCIÓN");
        String fraseCodificada = "";
       
        
        for (int i = 0;  i < cantidadCaracter ; i++){
            switch (frase.substring(i, i + 1)){
                
               case "a":
                    fraseCodificada = fraseCodificada.concat("@");
                            break;
                case "e":
                    fraseCodificada = fraseCodificada.concat("#");
                    
                    break;
                    
                 case "i":
                    fraseCodificada = fraseCodificada.concat("$");
                   
                    break;
                 case "o":
                    fraseCodificada = fraseCodificada.concat("%");
                  
                    break;
                  case "u":
                    fraseCodificada = fraseCodificada.concat("*");
                    
                    break;
                    
                    
                  default:
                      fraseCodificada = fraseCodificada.concat(frase.substring(i,i+1));
                     
                      
                
            }
        }
            
 
        return fraseCodificada;
        
    }  
   
        
  
    
    
    
    
    
    
}