/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june18;

/**
 *
 * @author comp10
 */
public class t1 {
    private int x;
    public int y;
    public t1()
    {
        x = 10;
        this.showX();
    }
    
    public t1(int val)
    {
        x = val;
        this.showX();
    }
            
    public void showX()
    {
        System.out.println("Value of X : " + x);
    }
    
     public void showY()
    {
        System.out.println("Value of Y : " + y);
    }
    
    
}
