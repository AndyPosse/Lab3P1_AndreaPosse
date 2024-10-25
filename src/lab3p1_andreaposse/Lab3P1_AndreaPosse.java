/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_andreaposse;

import java.util.Scanner;

/**
 *
 * @author Andrea Posse
 */
public class Lab3P1_AndreaPosse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        int x = 0;
        
        do{
        
         System.out.println(" ------------Menu--------------");
         System.out.println("Reloj de Arena"); 
         System.out.println("Calculadora de Combinaciones "); 
         System.out.println("Sandwich"); 
         System.out.println("Salida"); 
         System.out.println("Ingrese una Opcion: "); 
         x  = sc.nextInt();
         
         switch (x) {
         case 1: ;
             
             int m = 0; // esta es donde se guarda el valor que ingresa el usuario 
             System.out.println("Ingrese un Impar Mayor o igual a 7 ");
              m = sc.nextInt();
              int anterior = m-1;
              int espacio = 2;
             
             //% es lo que comprueba que un numero es par o impar
             // si el residuo da un 0 al dividir es par 
             // si el residuo da un 1 al dividir es impar
             // siempre que quieras comprobar que un numero es impar hace eso
             
             
             if ( m%2 != 0 && m>= 7) {
               
                 // hacer un for que imprima los numero horizontal y un vertical 
                 
                 for (int i = 0; i < m; i++){
                     
                     
                      for (int j = 0; j< m; j++){
                          
                         if (i == 0 || i == anterior){
                         System.out.print(" - ");
                         }
                         else if (j < i || j > anterior - i ){
                                   System.out.print("  ");
                                   
                         } else if(( j > i || j <= anterior - i )&& j != i && j != anterior - i ) {
                               System.out.print(" * ");
                           }
                          else if (j == i || j == anterior - i ){
                             System.out.print(" + ");
                             
                         }
                     }
                     System.out.println(); // esto hace un salto de linea entonces lo que hace
                     // es imprimirtelo en una linea abajo sin la necesidad de poner algo adentro
                     // de el 
                 } 
    
              } else {
                 System.out.println("Numero par no permitidos ");
             }
             
         
              break;
              
         case 2: ;
             System.out.println("Calculadora de Combinaciones "); 
              int n = 0;
              int r = 0;
              int c = 0;
     
             System.out.print("Ingrese el Valor de n " );
               n = sc.nextInt();
             System.out.print("Ingrese el Valor de r ");
              r = sc.nextInt();
              
               if (r <= n){
                    
                 // variables declaradas 
                 // el  final de la formula 
                 int nf = 1; // factorial de n 
                 int nr = 1; // factorial de r 
                 // el bucle es para general los factoriales 
                  for (int j = 2 ; j<= n; j++) {
                      /* para calcular el factorial despues de tener el buble 
                      iniciarlo en 1, multiplicas el contador con la variable 
                      determinada para ser el factorial
                      */
                      
                      nf *= j;
       
                  }
                  
                  for (int h = 2 ; h<= r; h++) {
                   
                    nr *= h; 
                  }
                  // es la variable para el resultado del parentesis
                 // ese resultado tienen que factoriarlo
                 int b = (n - r); // creamos una variable para solo poner la letra
                 // y no tener que estar poniendo todo el parentesis 
                 int fb = 1;
                  for (int i = 2 ; i <= b; i++) {
                     fb *= i; 
                     
                  }
                  // formula 
                  
                  c = nf/(fb*nr);
                      
                  }
             System.out.println("Combinaciones posibles con = : " + n + " y r = "+ r +" son: " + c );
              
              
              break;
              
         case 3: //condicion;
             int d = 0;
             System.out.println("Ingrese un Impar Mayor o igual a 7 ");
             d = sc.nextInt();
             
             //% es lo que comprueba que un numero es par o impar
             // si el residuo da un 0 al dividir es par 
             // si el residuo da un 1 al dividir es impar
             // siempre que quieras comprobar que un numero es impar hace eso
             
             
             if ( d%2 != 0 && d >= 7) {
               
                 // hacer un for que imprima los numero horizontal y un vertical 
                 
                 for (int i = 0; i < d; i++){
                     
                     for (int j = 0; j< d; j++){
                         
                         if (i == j ){
                         System.out.print("  ");
                         
                         
                         } else {
                             System.out.print(" * ");
                             
                         }
                     }
                     System.out.println(); // esto hace un salto de linea entonces lo que hace
                     // es imprimirtelo en una linea abajo sin la necesidad de poner algo adentro
                     // de el 
                 } 
    
              } else {
                 System.out.println("Numero par no permitidos ");
             }
             
               break; 
               
               
         case 4: ; //tiene que regresarse al menu 
             System.out.println(" Salida "); 
             
             
         default : // esta es la ultima opcion es como un else 
             System.out.println("Error esa opcion no existe ");
             break; 
             
             //el break siempre se tiene que poner al final de cada opcion de 
             // switch \
         }
          }while (x != 4);
        
        }
}

