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
public class HWQ9 {
    
    public static void main(String arg[])
    {
        Scanner io = new Scanner(System.in);
        int qnty;
        double rate , taxRate , taxAmount , totalAmount, comissionAmount , comissionRate , grossAmount, discount ;
        System.out.println("Enter Qnty");
        qnty = io.nextInt();
        
        System.out.println("Enter Rate");
        rate = io.nextDouble();
        System.out.println("Enter Tax Rate");
        taxRate = io.nextDouble();
        
        totalAmount = qnty * rate;
        taxAmount = totalAmount / 100 * taxRate;
        grossAmount = totalAmount + taxAmount;
        
            System.out.println("Qnty :" + qnty);
            System.out.println("Rate :" + rate);
            System.out.println("Total Amount :" + totalAmount);
            System.out.println("Tax @ " + taxRate + " : " + taxAmount);
            System.out.println("Gross Amount :" + grossAmount);
        
        if(totalAmount > 3000)
        {
            System.out.println("Enter Commission Rate");
            comissionRate = io.nextDouble();
            comissionAmount = totalAmount / 100 * comissionRate;
            System.out.println("Comission Paid " + comissionAmount);

        }
        
        
        
    }
    
    
}
