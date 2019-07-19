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
public class June19a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myClass1a[] obj = new myClass1a[3];
        System.out.println("Array Based Objs - 1");
        obj[0] = new myClass1a();
        obj[1] = new myClass1a();
        obj[2] = new myClass1a();
        
         obj[0].show();
         obj[1].show();
         obj[2].show();
        
         System.out.println("Simple  Obj - x");
         myClass1a x = new myClass1a();         
         x.show();
         
         System.out.println("Simple  Obj - y");
         myClass1a y = new myClass1a();         
         y.show();
         
         
         System.out.println("Simple  Obj - z");
         myClass1a z = new myClass1a();         
         z.show();
         
    }
    
}
