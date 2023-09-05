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
public class tabuada {
       public static void main(String [] args ){   

       Scanner scanner = new Scanner(System.in);
      
      int num6,cont = 1 , resultado;
    
       System.out.println("informe o numero: ");
       num6 = scanner.nextInt();
              
    while(cont <=10){
      resultado = num6 * cont;
        System.out.println(num6 + "x "+ cont +" = " + resultado);
        cont = cont + 1;
       }
 
    }  
 }
