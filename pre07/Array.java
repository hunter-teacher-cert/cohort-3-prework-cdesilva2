import java.util.Arrays;
public class Array{
public static double[] powArray(double[] a){
  double[] b = new double[a.length]; 
  for (int i = 0; i< a.length; i++){
    b[i] = a[i] * a[i];
  }
  return b; 
}

public static void main(String[] args){
double[] test = {1.0,2.0,3.0,4.0};
System.out.println("This is the original array" +Arrays.toString(test));
System.out.println("This is the power string:" +Arrays.toString(powArray(test)));
}
}