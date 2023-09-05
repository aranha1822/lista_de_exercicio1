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
 public class atividade3 {
    public static void main(String [] args ){

        Scanner scanner = new Scanner(System.in);

        int num1;
        System.out.println("informe o numero");
        num1 = scanner.nextInt();
        
        if(num1 % 2 == 0 ){
          System.out.println("o numero " + num1 + " é par ");
        }else{
            System.out.println("o numero " + num1 + " é impar  ");
        }
        
       
    }    
}
