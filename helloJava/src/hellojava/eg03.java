/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author comp10
 */
public class eg03 {
    
    public static void main(String[] arg)
    {
        int a = 0;
        final double pi = 3.14;
        
        
        System.out.println("PI" + pi); 
        
        
         System.out.println("A" + a);
         System.out.println("\u005B\u005D");
         System.out.println("Infowaves \u2122");
         
         boolean married;
         married = true;
         
         System.out.println("Ram is married : " + married);
         
         int x, y;
         
         x =10; y =15;
         
         System.out.println(x!=y);
         
         
         System.out.println("SQRT of " + y + " is = " + Math.sqrt(y) );
         
         
         
         double eq = 16.2356;
         int roundOff = (int)eq;
         
         System.out.println("EQ Round-OFF: " + roundOff);
         
         
         int eq1 = 16;
         double roundOff2 =  eq1;
         
         System.out.println("EQ Round-OFF: " + roundOff2);
         
         double marks , extra , total;
         
         marks = 500 ; extra = 20 ; total = 0;
         
         total = marks - marks/100*20 + 30;
         
         System.out.println(" Total" + total);
         
         
         total = marks - (marks/100*(20 + 30));
         
         System.out.println(" Total" + total);         
         
       
         int speed = 80 , distance , time = 45 ;
         
         distance = speed * time;
         
         System.out.println(" Distance" + distance);
         
         
         
         double length , breadth , area  ;
         
          length = 25 ; breadth = 70 ; area = 0 ;
          
          area  = length * breadth ;
          
          System.out.println(" Area Of " + area  );
          
    }    
       
    
}
