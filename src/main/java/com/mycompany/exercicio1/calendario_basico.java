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
public class calendario_basico {
    public static void main (String [] args){
        
       Scanner scanner = new Scanner(System.in);
        
         int janeiro = 31;
         int  fevereiro = 28;
         int  março = 31;          
         int  abril = 30;
         int  maio = 31;
         int  junho = 30;
         int  julho = 31;
         int  agosto = 31;
         int  setembro = 30;
         int  outubro = 31;
         int  novembro = 30;
         int  dezembro = 31;
        
         int mes;
         
         System.out.println("1 - informe o mes");
         mes = scanner.nextInt();
        
        
         if (mes == 1){
             System.out.println("janeiro tem: " + janeiro + " dias");
         }else if (mes == 2){
             System.out.println("feveiro tem: " + fevereiro + "dias");
         } else if ( mes == 3 ){
             System.out.println("março tem: "+ março + " dias");
         }else if ( mes == 4 ){
             System.out.println("abril tem: "+ abril + " dias");
         }else if (mes == 5 ){
             System.out.println("maio tem: " + maio + " dias");
         }else if (mes == 6 ) {
             System.out.println("junho tem: " + junho + " dias");
         }else if (mes == 7 ) {
            System.out.println("julho tem: " + julho + " dias");
         }else if (mes == 8 ) {         
             System.out.println("agosto tem: " + agosto + " dias");
         }else if (mes == 9 ) {      
             System.out.println("setembro tem: " + setembro + " dias");
         }else if (mes == 10 ){
             System.out.println("outubro tem: " + outubro + " dias");
         }else if (mes == 11) {
            System.out.println("novembro tem: " + novembro + " dias");
         }else if (mes == 12 ){
            System.out.println("dezembro tem: " + dezembro + " dias");
         }else{
            System.out.println(" MES NÃO ENCOTRADO ");
         }
    }

    }