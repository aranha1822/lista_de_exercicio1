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
public class caulcule_imc {
  public static void main(String [] args ){
     
     Scanner scanner = new Scanner (System.in);
     
      int opcao;
      float peso, altura, resultado;
      
      System.out.println("informe o seu peso ");
      peso = scanner.nextFloat();
      
      
      System.out.println("informe o sua altura ");
      altura = scanner.nextFloat();
      
      resultado = peso / (altura * altura);
      System.out.println("resultado:" + resultado);
      
      
 }   
}
