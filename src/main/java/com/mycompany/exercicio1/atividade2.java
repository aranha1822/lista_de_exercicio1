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
  public class atividade2 {
   public static void main(String [] args){
    
    Scanner scanner = new Scanner(System.in);     
       
    int soma;
    float num1,num2,num3,resultado; 
    
     System.out.println("informe o primeiro numero");
     num1 = scanner.nextFloat();
    
     System.out.println("informe o segundo numero");
     num2 = scanner.nextFloat();
    
     System.out.println("informe o terceiro numero");
     num3 = scanner.nextFloat();
    
     resultado = (num1 + num2 + num3) / 3;
     
     System.out.println("resultado: "+resultado);
    
    
    
    
    
  }
}
