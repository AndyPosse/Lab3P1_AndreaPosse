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
        
         System.out.println(" ------------Menu--------------");
         System.out.println("Reloj de Arena"); 
         System.out.println("Calculadora de Combinaciones "); 
         System.out.println("Sandwich"); 
         System.out.println("Salida"); 
         System.out.println("Ingrese una Opcion: "); 
         x  = sc.nextInt();
         
         switch (x) {
         case 1: ;
             //System.out.println(primer ejercicio);
              break;
              
         case 2: ;
             System.out.println("Calculadora de Combinaciones "); 
              int n = sc.nextInt();
              int r = sc.nextInt();
             System.out.println("Ingrese una Opcion ");
             System.out.print("Ingrese el Valor de n " );
               n = sc.nextInt();
             System.out.print("Ingrese el Valor de r ");
              r = sc.nextInt();
              
              
              
             System.out.println("Combinaciones posibles con n : " + n);
              
              
              break;
              
         case 3: //condicion;
             System.out.println("");
             
               break; 
         case 4: //orden ;
             System.out.println("");      
             
         default : // esta es la ultima opcion es como un else 
             System.out.println("Error esa opcion no existe ");
             break; 
             
             //el break siempre se tiene que poner al final de cada opcion de 
             // switch \
         
         
         }
    }
         
         
        

         
         
    }
    
