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
public class June11Eg01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numberCount , min , max , i , num;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter count of number to enter ");
        numberCount = io.nextInt();
        min=0;
        max=0;
        
        for(i=1;i<=numberCount; i++)
        {
             System.out.println("Enter Number " + i + " : ");
             num = io.nextInt();
             if(i==1)
             {
                 min=num;
                 max=num;
             }
             
             if(num<min)
             {
                 min = num;
             }
             else if(num>max)
             {
                 max = num;
             }
        }
        
        System.out.println("Max Number " + max);
        System.out.println("Min Number " + min);
        
    }
    
}
