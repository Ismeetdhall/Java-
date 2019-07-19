/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8june;

/**
 *
 * @author comp10
 */
public class Day8June {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //while
        //do-while
        //for
        // 1.)Start 2.) condition check 3.) increment / decrement (re-initilization) 
        
        int i;
        i=0;
        while(i<=4)
        {
            System.out.println("Hello JAVA : While");
            i++;
        }
        //----------------------------------------------------------
        i=0;
        do
        {
            System.out.println("Hello JAVA : Do While");
            i++;
        }
        while(i<=4);
        //----------------------------------------------------------
        for(i=0;i<=4;i++)
        {
           System.out.println("Hello JAVA : For");  
        }
        
        i=0;
        for(;i<=4;)
        {
           System.out.println("Hello JAVA : For Fun");
           i++;
        }
        
        
        //-----------------------------------------------------------
        for(i=0;i<=10;i++)
        {
            if(i==3 || i==7 || i==8)
            {
                continue;
            }
           System.out.println(i); 
        }
        
        
        for(i=0;i<=10;i++)
        {
            if(i==3 || i==7 || i==8)
            {
                break;
            }
           System.out.println(i); 
        }
        
        
    }
    
}
