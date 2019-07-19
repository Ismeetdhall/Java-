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
public class June11Eg02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        String number ;
        char x;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter any 4 digit number ");
        number = io.nextLine(); 
        
        for(i=0;i<number.length();i++)
        {
            x = (char)number.charAt(i); 
            switch(x)
            { 
                case '1' : {System.out.print("One ");break;}
                case '2' : {System.out.print("Two ");break;}
                case '3' : {System.out.print("Three ");break;}
                case '4' : {System.out.print("Four ");break;}
                case '5' : {System.out.print("Five ");break;}
                case '6' : {System.out.print("Six ");break;}
                case '7' : {System.out.print("Seven ");break;}
                case '8' : {System.out.print("Eight ");break;}
                case '9' : {System.out.print("Nine ");break;}
                case '0' : {System.out.print("Zero ");break;}
                default :{System.out.print("");break;}
            }
        }
        
        
        
        
    }
    
}
