/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june11eg01;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class Total_Commision {
    
   public static void main(String[] args) {
       
    int p1 ,p2 , p3,SP1,CP1,SP2,CP2,SP3,CP3,TOTAL ;
    Scanner io = new Scanner(System.in);
    System.out.println("ENTER S.P AND C.P OF THREE PRODUCTS" );
    SP1 = io.nextInt();
    CP1 = io.nextInt();
     SP2 = io.nextInt();
    CP2 = io.nextInt();
     SP3= io.nextInt();
    CP3 = io.nextInt();
       
    p1 = SP1-CP1;
    p2 = SP2-CP2;
    p3 = SP3-CP3;
    
    
     TOTAL = p1+p2+p3 ;
     
    System.out.println(" TOTAL : " + TOTAL );
     
    double COMMISSION ;
    COMMISSION = (0.05 * TOTAL) ;
    System.out.println(" TOTAL COMMISION IS = : " + COMMISSION );    
    
    
   } 
    
    
    
}
