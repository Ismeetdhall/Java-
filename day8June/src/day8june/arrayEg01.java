/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8june;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class arrayEg01 {
    
    public static void main(String[] args)
    {
        /*int sub1, sub2, sub3;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects");
        sub1 = io.nextInt();
        sub2 = io.nextInt();
        sub3 = io.nextInt();
        
        int total = sub1 + sub2 + sub3;
        
        System.out.println("Total marks :" + total); 
                */
        int i , sub , total = 0;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects");
        for(i=0;i<=2;i++)
        {
            sub = io.nextInt();
            total += sub;
        } 
        System.out.println("Total marks :" + total); 
        
        /*
        Scanner io = new Scanner(System.in);
        int[] sub = new int[6]; 
        int xCounter = 5;
        int i,total=0;
        System.out.println("Enter marks of 3 subjects");
        for(i=0;i<=xCounter;i++)
        {
            System.out.printf("Enter marks of Subject %d : " , i+1);
            sub[i] = io.nextInt();
        }
        //total = sub[0] + sub[1] + sub[2];
        for(i=0;i<=xCounter;i++)
        {
            total += sub[i];
        }
        System.out.println("Total marks :" + total); 
        */
        
        
       System.out.printf("Enter 5 values");
        int[] a = new int[5]; 
        for(i=0;i<=4;i++)
        {
            a[i] = io.nextInt();
        }
        
        Arrays.sort(a); 
        for (int r : a)
        {
            System.out.println(r);
        } 
        
    }
    
}
