/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funinnumbers;

import java.util.Scanner;

/**
 *
 * @author Kareem_29
 */
public class FunInNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double n1, n2;
        int x=0;
        Scanner input =new Scanner (System.in);
        Numbers number = new Numbers();
        System.out.print("Enter the First number: ");
       
        n1= input.nextDouble();
        
        System.out.print("Enter the Second number: ");
        n2= input.nextDouble();
        number.setNum1(n1);
        number.setNum2(n2);
        do{
         System.out.println("What do you want to compute? ");
         System.out.println("1-Sum ");
         System.out.println("2-Product ");
          System.out.println("3-Higher ");
          System.out.println("4-Power ");
        System.out.println("5-Exit ");
          
        System.out.print("Enter the number of your choice ");
        x = input.nextInt();
       
        switch(x){
            case 1: 
                System.out.println("The sum is "+number.getSum());
            break;
                
            case 2: 
                System.out.println("The proudct is "+number.getProduct());
            break;
                    
            case 3:
                 System.out.println("The higher is "+number.getHigher());
            break;
                        
            case 4: 
               System.out.println("The pewor "+number.getPow());
            break;
            case 5:
                System.exit(0);
        }
        
            
        
    }while(x !=5);
        
    }
}

