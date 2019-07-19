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
public class Day7JuneEg02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int marks , minlowerlimit;
        
        minlowerlimit = 321;
        
        Scanner io  = new Scanner(System.in);
        System.out.println("Enter Your marks");
        marks = io.nextInt();
        
        if(marks >= 350)
        {
            System.out.println("You are pass");
        }
        if(marks >=321 && marks<350)
        {
            System.out.println("You need to work hard");
        }
        
        
        
        
    }
    
}
