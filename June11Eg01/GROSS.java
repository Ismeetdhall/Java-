/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june11eg01;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class GROSS {
     
    
   public static void main(String[] args){
     
     
   float BASIC,GROSS_SALARY,TA,DA,HRA ;
   
   Scanner io = new Scanner(System.in);
   System.out.println("Enter the basic salary : ");
   BASIC = io.nextFloat();
   
   
     TA =  (10*BASIC)/100;
      DA = (10*BASIC)/100;
       HRA =(5*BASIC)/100;
       
      GROSS_SALARY = TA +DA +HRA;
      
      System.out.println("gross salary is:" + GROSS_SALARY );
 }   
    
    
    
    
    
}

    

