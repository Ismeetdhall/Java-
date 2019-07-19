/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june19;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author comp10
 */
public class June19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GregorianCalendar today = new GregorianCalendar(); 
        System.out.println("Today is : " + today.getTime());
        
        
        GregorianCalendar deadline = new GregorianCalendar(2018, 5 , 21);
         System.out.println("Appoitment is : " + deadline.getTime());
         
         myClass x = new myClass(2);         
         x.show();
         
         myClass xx = new myClass(2,3);         
         xx.show();
         
         myClass y = new myClass();  
         y.show();
         
         myClass z = new myClass();  
         z.show();
         
    }
    
}
