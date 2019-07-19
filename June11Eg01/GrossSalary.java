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
public class GrossSalary {
    
 public static void main(String arg[]){
     
    Scanner io = new Scanner(System.in);
     
    
    char x ;
    
  
    
    
            
        int qnty;
        double payAmnt, total, netPft, rate , tax , totalAmount, commission , grossAmount, discount ;
        System.out.println("Enter Qnty");
        qnty = io.nextInt();
  
        System.out.println("Enter Rate ");
        rate = io.nextDouble();
        
        System.out.println("Enter discount ");
        discount = io.nextDouble();
        System.out.println("Enter Tax Rate");
        tax = io.nextDouble();
        
        total = qnty * rate ;
        discount = total/100 * discount;
        
        tax = (total - discount)/100 * tax ;
        payAmnt = (total - discount) + tax;
        
         System.out.println("PAYAMT IS: " + payAmnt);
         
        System.out.println("Enter commission ");
        commission = io.nextDouble();
        commission = (total - discount)/100 * commission ;
        
        netPft = rate - commission;
        
        
        System.out.println("Net profit is : " + netPft);
    
        
        
        
        
 
 }
    
    
    
}
