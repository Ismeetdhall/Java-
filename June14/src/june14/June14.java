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
public class June14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ram_sub1 , ram_sub2 , ram_sub3 , ram_sub4, ram_total ;
        int sham_sub1 , sham_sub2 , sham_sub3 , sham_sub4 ,sham_total ;
        int geeta_sub1 , geeta_sub2 , geeta_sub3 , geeta_sub4,geeta_total;
        int sita_sub1 , sita_sub2 , sita_sub3 , sita_sub4, sita_total;
        
        Scanner io = new Scanner(System.in);
        
        System.out.println("Enter Ram Result Details:");
        System.out.println("Marks in Sub1:");
        ram_sub1 = io.nextInt();
        
        System.out.println("Marks in Sub2:");
        ram_sub2 = io.nextInt();
                
        System.out.println("Marks in Sub3:");
        ram_sub3 = io.nextInt();
        
        System.out.println("Marks in Sub4:");
        ram_sub4 = io.nextInt();
        
        ram_total = ram_sub1 +ram_sub2 +ram_sub3+ram_sub4; 
        System.out.println("Total Marks of Ram :" + ram_total);
        
        
        System.out.println("Enter sham Result Details:");
        System.out.println("Marks in Sub1:");
        sham_sub1 = io.nextInt();
        
        System.out.println("Marks in Sub2:");
        sham_sub2 = io.nextInt();
                
        System.out.println("Marks in Sub3:");
        sham_sub3 = io.nextInt();
        
        
        System.out.println("Marks in Sub4:");
        sham_sub4 = io.nextInt();
        
        sham_total = sham_sub1 +sham_sub2 +sham_sub3 + sham_sub4; 
        System.out.println("Total Marks of Sham :" + sham_total);
        
        System.out.println("Enter Geeta Result Details:");
        System.out.println("Marks in Sub1:");
        geeta_sub1 = io.nextInt();
        
        System.out.println("Marks in Sub2:");
        geeta_sub2 = io.nextInt();
                
        System.out.println("Marks in Sub3:");
        geeta_sub3 = io.nextInt();
        
       System.out.println("Marks in Sub4:");
        geeta_sub4 = io.nextInt();
        
        
        geeta_total = geeta_sub1 +geeta_sub2 +geeta_sub3+geeta_sub4; 
        System.out.println("Total Marks of geeta :" + geeta_total);
        
        
        System.out.println("Enter Sita Result Details:");
        System.out.println("Marks in Sub1:");
        sita_sub1 = io.nextInt();
        
        System.out.println("Marks in Sub2:");
        sita_sub2 = io.nextInt();
                
        System.out.println("Marks in Sub3:");
        sita_sub3 = io.nextInt();
        
        System.out.println("Marks in Sub4:");
        sita_sub4 = io.nextInt();
        
        
        sita_total = sita_sub1 +sita_sub2 +sita_sub3+sita_sub4; 
        System.out.println("Total Marks of geeta :" + sita_total);
        
        
        
    }
    
}
