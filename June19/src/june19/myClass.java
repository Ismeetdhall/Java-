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
public class myClass {
    
    private int a,b,c;
    private static int nextId;
    
    myClass()
    {
        a =1;
        b =2;
        c =3;
    }
    myClass(int x)
    {
        this.a = x; 
    }
    myClass(int x, int y)
    {
        this.a = x;
        this.b = y; 
    }
    myClass(int x, int y, int z)
    {
        this.a = x;
        this.b = y;
        this.c = z;
        
    }
    
    public void show()
    {
        System.out.println( " ID " + this.nextId);
        System.out.println(a + " " +  b + " " + c);
    }
    
    
    static {     
        Random generator = new Random();   
        nextId = generator.nextInt(10000); 
    }

       
    
}
