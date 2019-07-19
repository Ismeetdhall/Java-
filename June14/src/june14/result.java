/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june14;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class result {
    
    private int sub1, sub2, sub3, sub4 ,total;
    private String stuName;
    Scanner io = new Scanner(System.in);
   
     
    
    public void setMarks()
    {
        System.out.println("Enter marks of " +stuName);
        System.out.println("Marks of Sub1");
        sub1 = io.nextInt();
        System.out.println("Marks of Sub2");
        sub2 = io.nextInt();
        System.out.println("Marks of Sub3");
        sub3 = io.nextInt(); 
        System.out.println("Marks of Sub4");
        sub4 = io.nextInt(); 
    }
    
    public void calculateTotal()
    {
       this.total = sub1+sub2+sub3+sub4;
    }
    
    
    public void showResult()
    {
       System.out.println("Total Marks of "+stuName + " " + total);
    }

    /**
     * @return the stuName
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName the stuName to set
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
 
    
    
 
    
}
