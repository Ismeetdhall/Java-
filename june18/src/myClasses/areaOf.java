/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class areaOf {
    
   private int length , breadth , side ,base , height ,area ;
   Scanner io = new Scanner(System.in);
   
   public void setLength()
   {
      System.out.println("Enter Length ");
      length = io.nextInt();
      
   }
   
    public void setBreadth()
   {
      System.out.println("Enter Breadth ");
      breadth = io.nextInt();
      
   }
    
     public void area()
   {
      area = length * breadth ;
    
   }
     
      public void showResult()
    {
        System.out.println("Area of Rectangle is : " + area); 
    }
    
     
     
     
}
