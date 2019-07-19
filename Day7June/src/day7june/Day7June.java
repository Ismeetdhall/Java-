/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7june;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class Day7June {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        Scanner io  = new Scanner(System.in);
        System.out.println("Enter Your age");
        age = io.nextInt();
        
        if(age >= 18)
        {
            System.out.println("You can vote");
        }
        
        
        
        
    }
    
}
