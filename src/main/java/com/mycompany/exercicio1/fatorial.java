/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author caua.3932
 */
 public class fatorial {
   public static void main(String [] args ){

   Scanner scanner = new Scanner(System.in);
    
    int maximo;
      
     System.out.println("informe o numero");
     maximo = scanner.nextInt();
   
    while( maximo >= 0 ){
     
        System.out.println(maximo);
    
     maximo = maximo - 1;   }
    
     System.out.println("processo finalizado");
     
    }
}
    

