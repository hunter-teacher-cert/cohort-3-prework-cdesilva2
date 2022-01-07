//2. Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
//x1 =(x0 + a/x0) / 2 
//In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.
import static java.lang.Math.*;
public class Loops{
  public static double squareRoot(double a){
    double x = a/2; //initial guess
    double x1 = (x + a/x) / 2; //second guess
     
    while (x - x1 > 0.0001)
    {
      x = (x1 + (a/x1))/2;
      x1 = (x + (a/x))/2; }
    return round(x1, 2);  
  }
  public static double powerloop(double x, int n){
    double result = 0;
    while (n > 0)
    {
       result = result + x;
       n--;
    }
    return result;
  }
  public static void main (String[] args){
       System.out.println("Estimate of the value of Square Root (25): "+squareRoot(25.0));
       System.out.println("Multiply 4 and 2 using loops: " +powerloop(4.0,2));

  }
}