/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

/**
 *
 * @author comp10
 */
public class gsResult {
    
   public static void main(String[] arg)
    {
       grossSalary obj = new grossSalary();
        obj.setbasic();
        obj.setTA();
        obj.setDA();
        obj.setHRA();
        obj.Gross_Salary();
        
        obj.showResult(); 
    } 

    
    
    
    
}
