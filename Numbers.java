/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funinnumbers;

/**
 *
 * @author Kareem_29
 */
public class Numbers {
    private double num1; 
    private double num2;
    
    public Numbers(){ 
        this.num1=0; 
        this.num2=0; 
} 

   public double getNum1() {
       return this.num1;} 
public void setNum1(double n1) {
    num1=n1;} 
public double getNum2() {
    return this.num2;} 
public void setNum2(double n2) {
    num2=n2;} 
 
    public double getSum(){ 
        double sum=this.num1+this.num2; 
        return sum; 
} 

    public double getProduct(){ 
        double product=this.num1*this.num2; 
        return product; 
} 

    public double getHigher(){ 
        double higher=Math.max(num1, num2); 
        return higher; 
} 

    public double getPow(){ 
        double result=Math.pow(num1, num2); 
        return result; 
} 

  
}
