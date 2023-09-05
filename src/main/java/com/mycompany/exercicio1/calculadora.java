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
public class calculadora {
    public static void main(String [] args ){  

        Scanner scanner = new Scanner(System.in);
  
        int opcao;
        float num1, num2, resultado;

        System.out.println("informe a opercao");
        System.out.println("1 - informe a adição ");
        System.out.println("2 - informe a divisão ");        
        System.out.println("3 - informe a subtração ");       
        System.out.println("4 - informe a multiplicação");     
        System.out.println("5 - informe a porcentagem ");
        opcao = scanner.nextInt();
        
        if(opcao == 1 ){
            System.out.println("informe o primero numero ");
            num1 = scanner.nextFloat();

            System.out.println("informe o segundo numero ");
            num2 = scanner.nextFloat();

            resultado = num1 + num2;
            
            System.out.println("resultado: " + resultado);
        }else if(opcao == 2){
          
            System.out.println("informe o primeiro numero ");
            num1 = scanner.nextFloat();
        
            System.out.println("informe o segundo numero ");
            num2 = scanner.nextFloat();
            
            resultado = num1 / num2;
            System.out.println("resultado:" + resultado);
        
        }else if(opcao == 3){
          
            System.out.println("informe o primeiro numero ");
            num1 = scanner.nextFloat();
            
            System.out.println("informe o segundo numero");
            num2 = scanner.nextFloat();
            
            resultado = num1 - num2;
            System.out.println("resultado:" + resultado);
            
        }else if(opcao == 4){
            
            System.out.println("informe o primeiro numero");
            num1 = scanner.nextFloat();
            
            System.out.println("informe o segundo numero");
            num2 = scanner.nextFloat();
            
            resultado = num1 * num2;
            System.out.println("resultado:" + resultado);
        }else if (opcao == 5 ){
            
            System.out.println("informe o primeiro numero");
            num1 = scanner.nextFloat();
            
            System.out.println("informe o segundo numero");
            num2 = scanner.nextFloat();
            
            resultado = (num1 * num2)/100;
            System.out.println("resultado:" + resultado);
        }
    }
}
