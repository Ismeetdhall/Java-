/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june25;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class logic {
    
    int xcounter,count = 0;
    double  val1 ,val2, ans ;
    char opt , lastOPT;
    boolean firstRun;
    Scanner io = new Scanner(System.in);
    
    int run , addCount , minCount , mulCount, divCount;
             
       
    
            
    
    logic()
    { 
        firstRun = true;
        System.out.println("Your Calculator Enter first number then operator:+ - * / , after this enter 2 number to get the total press = \n\n\n");
        val1 = io.nextDouble(); 
        opt = io.next().charAt(0); 
        ans = val1;
        this.calculate(opt);
       
    }
    
    public void enterValue()
    { 
        run++;
        opt = io.next().charAt(0);
        this.calculate(opt);
    }
    
    public void calculate(char optx)
    {
        if(optx == '=')
        { 
            run = addCount + minCount + mulCount + divCount;
            run = (run==0) ? 1 : run;
            System.out.println(ans);
            System.out.println("+:"+addCount);
            System.out.println("-:"+minCount);
            System.out.println("*:"+mulCount);
            System.out.println("/:"+divCount);
            System.out.println("Toal Operations :"+run);
            
            
            
        }
        else if(optx == '+' || optx == '-' || optx == '*' || optx == '/')
        {
            val2 = io.nextDouble(); 
                switch(optx)
                {
                    case '+' : {val1 = val1 + val2; addCount++; break;}
                    case '-' : {val1 = val1 - val2; minCount++; break;}
                    case '*' : {val1 = val1 * val2; mulCount++; break;}
                    case '/' : {val1 = val1 / val2; divCount++; break;}
                    default : {break;}
                }
                 ans = val1; 
                 this.enterValue(); 
        }
        else
        {
            this.enterValue();
        } 
    }

    
}
