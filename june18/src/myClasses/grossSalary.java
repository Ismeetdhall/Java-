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
public class grossSalary {
 
 
   private int basic ,TA ,DA ,HRA , Gross_Salary ;
   Scanner io = new Scanner(System.in);
    
    public void setbasic()
   {
       System.out.println("Enter Basic Salary " );
       basic  = io.nextInt() ;
   }
   
    public void setTA()
   {
       TA = (basic / 100) * 10;
               
   }
   
     public void setDA()
   {
       DA = (basic / 100) * 5 ;
       
   }
     
     public void setHRA()
   {
       HRA = (basic / 100) * 12 ;
       
   }
    
    public void Gross_Salary()
   {
       Gross_Salary = basic + TA + DA + HRA ; 
      
   }
   
     public void showResult()
    {
        System.out.println("Gross_Salary is : " + Gross_Salary ); 
    }
    
   
   
   
     
}
