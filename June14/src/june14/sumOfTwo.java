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
public class sumOfTwo {
    
    private int val1 ,val2, ans;
    Scanner io = new Scanner(System.in);

    public void setVal1()
    {
        System.out.println("Enter Val1");
        val1 = io.nextInt();
    }
    
    public void setVal2()
    {
        System.out.println("Enter Val1");
        val2 = io.nextInt();
    }
    
    public void sum()
    { 
        ans = val1+val2;
    }
    
    public void showResult()
    {
        System.out.println("Sum of " + val1 + " and " + val2 + " = " + ans); 
    }
    
    
}
