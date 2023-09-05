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
public class idade_do_atleta {
  public static void main ( String [] args ){
      
     Scanner scanner = new Scanner(System.in);  
      
        int idade;
      
          System.out.println("informe a sua idade:");
          idade = scanner.nextInt();
     
       if(idade >= 5 && idade <= 7 ){
           
           System.out.println("infantil A ");
        }else if (idade >= 8 && idade <= 10 ){
           
           System.out.println("infantil B ");
        }else if (idade >= 11 && idade <= 13){
           
           System.out.println(" juvenil A ");
        }else if ( idade >= 14 && idade <= 17){
           
           System.out.println(" juvenil B ");
        }else if ( idade >= 18){
           
           System .out.println("adulto");
       } 
    }
  }    

