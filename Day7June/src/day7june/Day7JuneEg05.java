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
public class Day7JuneEg05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char option;
        int a,b, ans;
        Scanner io  = new Scanner(System.in);
        System.out.println("Press one of the following\n + for add\n - for minus\n * for multiply");
        option = (char)io.next().charAt(0);
        
        System.out.print("\nEnter Val 1 :");
        a = io.nextInt();
        System.out.print("\nEnter Val 2 :");
        b = io.nextInt();
        
        
        
        switch(option)
        {
            case '+' : { ans = a + b; break;}
            case '-' : { ans = a-b; break;}
            case '*' : { ans = a*b; break;}
            default : { ans = 0; System.out.println("\nWrong selection of option...!");}
        }
        
        System.out.printf("\nAnswer is %d", ans);
        
        
        
        
    }
    
}
