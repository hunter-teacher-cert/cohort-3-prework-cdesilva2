//2. Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
//3. Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
//Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).
public class Methods {
  public static boolean isDivisible (int n, int m){
    if ((n % m) > 0)
    return false; 
    else 
    return true;  
  }
  public static boolean isTriangle (int a, int b, int c)
  {
     if (c > (a + b) || c > (b + a))
     return false;
     else if (b > (a + c) || b > (c + a))
     return false;
     else if (a > (c + b) || c > (b + c))
     return false;
     else 
     return true; 
  }
  public static int ack (int m , int n)
  {
    if ( m == 0 )
    n++;
    else if ((m > 0) && (n == 0))
    ack(m-1,1);
    else if (m > 0 && n > 0)
    ack(m-1,ack(m,n-1));
    else
    System.err.println("Error");
    //not sure what to return
    return 0; 
  }
   public static void main(String[] args){
    int n = 2;
    int m = 3;
    int p = 5;
    System.out.println("Is Divisible " +isDivisible(n,m));
    System.out.println("Is isTriangle " +isTriangle(n,m,p));
    System.out.println("Is ack " +ack(n,m));
   }
}