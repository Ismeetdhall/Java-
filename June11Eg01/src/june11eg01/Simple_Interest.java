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
public class Simple_Interest {
     
    
   public static void main(String[] args){
     
     
   float p,r,t ;
   Scanner io = new Scanner(System.in);
   System.out.println("Eneter the principal : ");
   p = io.nextFloat();
   System.out.println("Enter the rate : ");
   r = io.nextFloat();
   System.out.println("Enter the time : ");
   t = io.nextFloat();
   
   float si;
   si = (p * r * t)/100 ;
   System.out.println("The Simple Interest Is : " + si );
   
     
     
     
 }   
    
    
    
    
    
}

    
}
