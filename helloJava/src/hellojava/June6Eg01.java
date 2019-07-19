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
public class June6Eg01 {
    
    public static void main(String[] arg)
    {
        String name = "Ramanjot";
        String subName = name.substring(5, 8);
        
        String sName = "jot";
        
        System.out.println("Value : " + name);
        System.out.println("Value : " + name.length());
        System.out.println("Value : " + subName);
        
        System.out.println("Value : " + subName.equals(sName));
        
        
        String myString;
        myString = "Hello";
        System.out.println(myString);
        myString += " How";
        System.out.println(myString);
        myString += " Are";
        System.out.println(myString);
        myString += " You?";
        System.out.println(myString);
        
        
        StringBuilder friendList = new StringBuilder();
        
        friendList.append("Ram ");
        friendList.append("Sham ");
        friendList.append("Gopal ");
        friendList.append("Adam ");
        
        
       System.out.println(friendList.length()); 
        
        
    }
    
}
