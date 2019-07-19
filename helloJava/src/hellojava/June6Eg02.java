/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Scanner;


/**
 *
 * @author comp10
 */
public class June6Eg02 {
    
    public static void main(String[] args)
    {
       Scanner io = new Scanner(System.in);
       
       int val1 , val2 , ans;
       String name;
       
        
       System.out.println("Enter Your Name");
       name = io.nextLine();
       System.out.println("Enter Value 1");
       val1 = io.nextInt();
       System.out.println("Enter Value 2");
       val2 = io.nextInt();
       
       
       ans = val1+val2;
       double ans2 = val1 + val2;
      // System.out.println("Hello " + name + ", your addtion of " + val1 + " and " + val2 + " equals to " + ans );
       System.out.printf("Hello %s , your addtion of %d and %d is equals to %6.2f" ,name, val1,val2, ans2);
       
       
       
    }
    
}
