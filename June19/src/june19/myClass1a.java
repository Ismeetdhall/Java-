/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june19;

import java.util.Random;

/**
 *
 * @author comp10
 */
public class myClass1a {
    
    private int a,b,c,xID;
    private static int nextId;
    
    myClass1a()
    {
        a =100;
        b =200;
        c =300;  
    }
    myClass1a(int x)
    {
        this.a = x; 
    }
    myClass1a(int x, int y)
    {
        this.a = x;
        this.b = y; 
    }
    myClass1a(int x, int y, int z)
    {
        this.a = x;
        this.b = y;
        this.c = z;
        
    }
    
    public void show()
    { 
        System.out.println( " Static ID " + xID);
        System.out.println(a + " " +  b + " " + c);
        
        System.out.println( "\n======================================\n Next Static ID for object :" + this.nextId + "\n======================================\n");
        
        
    }
    
    
    static {     
        //Random generator = new Random();   
        //nextId = generator.nextInt(10000); 
        nextId = 0;
    }
    
    {
          xID = nextId;
          nextId++;
    }

       
    
}
