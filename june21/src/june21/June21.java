/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june21;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class June21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner io = new Scanner(System.in);   
      String run = "y" ;
     
      do
      {
        System.out.println("RUN...... "); 
        run = io.next();
      }
      
      while(!run.equalsIgnoreCase("n"));
      
      
    }
    
}
