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
public class Day7JuneEg04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String city;
        Scanner io  = new Scanner(System.in);
        System.out.println("Enter Your City");
        city = io.nextLine();
        
        
        //if(city == "Delhi")
        if(city.equalsIgnoreCase("Delhi") || city.equalsIgnoreCase("Mohali") || city.equalsIgnoreCase("Chandigarh"))
        {
            System.out.println("Turn Right");
        }
        else if(city.equalsIgnoreCase("Amritsar") || city.equalsIgnoreCase("NSR")|| city.equalsIgnoreCase("Manali"))
        {
            System.out.println("Turn Left");
        }
        
        else if(city.equalsIgnoreCase("Anadpur sahib") || city.equalsIgnoreCase("una"))
        {
            System.out.println("Turn Straight");
        } 
        else
        {
            System.out.println("U Turn");
        }
        
        
        
    }
    
}
