/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june11eg01;

import java.util.Scanner;

/**
 *
 * @author SAINI
 */
public class DivisibleNo {
    
    
 public static void main(String[] args){
 
 int n , i , from , to ;
 Scanner io = new Scanner(System.in);
 System.out.println("Enter any number : ");
 n = io.nextInt();
 
 System.out.println("Enter from && to : ");
 from = io.nextInt();
 to = io.nextInt();

 for(i=from;i<=to;i++)
{

  if(i % n ==0){
     
   System.out.println(i + " Is Divisible by : " + n ) ;
   
 }

   
}  
 }   
    
}
