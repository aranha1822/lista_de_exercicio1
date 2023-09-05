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
public class mercado {
    public static void main(String [] args ){
       
        Scanner scanner = new Scanner(System.in);
     
        int produto,quantidade;
        float precoTotal;  
      
      
        System.out.println(" produtos ");
        System.out.println("1 - bicicleta | valor: 1999,90");
        System.out.println("2 - smartfone | valor: 1500,90");
        System.out.println("3 - tenis nike | valor: 350,90");
        System.out.println("4 - notebook | valor: 2000,00");
      
        produto = scanner.nextInt();
     
        if (produto == 1){
            System.out.println("informe a quantidade:");
            quantidade = scanner.nextInt();
            precoTotal = (float) 1999.90 * quantidade;
            
            System.out.println("total da compra: " + precoTotal);
        }else if (produto == 2){
            System.out.println("informe a quantidade:");
            quantidade = scanner.nextInt();
            precoTotal = (float) 1500.90 * quantidade;
            
        }else if (produto == 3){
            System.out.println("informe a quantidade:");
            quantidade = scanner.nextInt();
            precoTotal = (float) 350.90 * quantidade;
            
        }else if ( produto == 4){
            System.out.println("informe a quantidade:");
            quantidade = scanner.nextInt();
            precoTotal = (float) 2000 * quantidade;
        }    
    }
}
  

