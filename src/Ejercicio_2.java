
import java.util.Scanner;


//public class Ejercicio_2 {
//
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese un numero de motor entre 1 y 4");
//        int num1 = leer.nextInt();
//        switch(num1){
//       case 1:
//           System.out.println("“La bomba es una bomba de" + num1 +
//              " agua");
//           break;
//       case 2:
//          System.out.println("“La bomba es una bomba de" + num1 +
//              " gasolina");
//           break;
//       case 3:
//           System.out.println("“La bomba es una bomba de" + num1 +
//              " hormigon");
//           break;
//       case 4:
//           System.out.println("“La bomba es una bomba de" + num1 +
//              " pasta alimenticia");
//           break;
//       default:
//          System.out.println("EL NUMERO DE BOMBA ES INVALIDO");
//          }
//  
//}}
//public class Ejercicio_2 {
//    public static void main(String[] args) {
//        Scanner leer = new Scanner (System.in);
//        
//        System.out.println("Ingrese una Nota entre 0 y 10");
//        int nota = leer.nextInt();
//        while(nota<0 || nota>10){
//            System.out.println("La nota es incorrecta, vuelva a escribirla");
//            nota =  leer.nextInt();
//        }
//        System.out.println("La nota ingresada es " + nota);
//    
//    }
//}

//public class Ejercicio_2 {
//    public static void main(String[] args) {
//        Scanner leer = new Scanner (System.in);
//        int num1;
//        int num2=0;
//        int i = 0;
//
//    do{
//       System.out.println("ingrese un numero distinto de 0");
//        num1 = leer.nextInt();
//        i++;
//            if (num1 > 0) { 
//            num2 = num1 + num2;}
//            if (num1 == 0) {
//             System.out.println(" se capturo el numero 0");
//             break;} 
//      } 
//    while (i!=20);
//        
//
//        System.out.println("la suma de los numeros es " + num2);
//}
//}

public class Ejercicio_2 {
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese 4 números del 1 al 20 para mostrar la cantidad de * en pantalla");
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese el numero " + i);
            num = leer.nextInt();
            while(num<1 || num>20){
                System.out.println("Ingresó un número erróneo, vuelva a ingresar");
                num = leer.nextInt();
            }
            
            System.out.print(num);
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        
        
        
}}