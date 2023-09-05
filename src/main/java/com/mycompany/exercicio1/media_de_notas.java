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
     public class media_de_notas {
         public static void main(String [] args){
         
         Scanner scanner = new Scanner(System.in); 
         
         int opcao;
         float num1 ,num2 ,num3 ,num4 ,resultado;
         
         System.out.println("informe o primeiro numero");
         num1 = scanner.nextFloat();
         
         System.out.println("informe o segundo numero");
         num2 = scanner.nextFloat();
         
         System.out.println("informe o terceiro numero");
         num3 = scanner.nextFloat();
         
         System.out.println("informe o quarto numero");
         num4 = scanner.nextFloat();
     
         resultado  = (num1 + num2 + num3 + num4)/4;
         System.out.println("resultado:" + resultado );
     
        if(resultado >= 7){
            System.out.println(" O aluno esta aprovado:");
        }else{
            System.out.println("O aluno esta reprovado");
        }    
    }
}

