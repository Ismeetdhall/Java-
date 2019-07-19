/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june20;

import java.util.Scanner;

/**
 *
 * @author comp10
 */
public class CalcTr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
       double a,b,Num;
       double ans = 0;
         char choice;
       int choiceCode;
       Scanner io = new Scanner(System.in);   
       System.out.println("Enter the num ");
       Num = io.nextDouble(); 
      do
      {       
        //System.out.println("Operator");
        System.out.println("press + for add, - for sub, * for mul, / for div"); 
        choiceCode = io.next().charAt(0);
        choice = (char) choiceCode;
        System.out.println("enter number");
        b = io.nextDouble();
          if(choice != '=')
        {
            //System.out.println("Num");
            Num = io.nextDouble();
             switch(choice)
      {
          case'+':
          {
              ans = Num + b ;
              break;
          }
          case'-':
          {
              ans = Num - b;
              break;
          }
          case'*':
          {
              ans = Num * b;
              break;
          }
          case'/':
          {
              ans = Num / b;
              break;
          }
          default:
          {
          ans = 0;
          break;
      }
      }
         
        } 
      }
      while(choice != '=');
        
        
     System.out.println("ans is :" + ans);
     
       
      
      
  
     
       
}

}

  /*    
            
           public void setNum()
   {
        System.out.println("Enter a num ");
        Num = io.nextInt();
        
   }

        public void setAdd()
    {
       Add = a + b ;    
       System.out.println("Sum of : " + Add);
    }
     
        public void setSub()
    {
       Sub = a - b ;    
       System.out.println("Sub of : " + Sub);
    }
      
      
        public void setMul()
    {
       Mul = a * b ;    
       System.out.println("Mul of : " + Mul);
    }
    
        public void setDivide()
    {
       Divide = a / b ;    
       System.out.println("Divide of : " + Divide);
    } 
        
        public void showResult()
    {
        System.out.println("Area of Rectangle is : "); 
    }
       
        
        
        
}

*/