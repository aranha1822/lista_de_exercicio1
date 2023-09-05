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
public class maior_e_menor_numero {
   public static void main(String [] args){
    
    Scanner scanner = new Scanner (System.in);
       
        int opcao;
        float num1,num2;

        System.out.println("informe o primeiro numero");
         num1 = scanner.nextFloat();
       
        System.out.println("informe o segundo numero");
        num2 = scanner.nextFloat();
       
        if(num1 > num2){
            System.out.println(num1 + " e maior do que " + num2);
        }else{
            System.out.println(num1 + " e menor do que " + num2);
        }
       
   }
}
