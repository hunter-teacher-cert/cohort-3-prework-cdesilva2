public class Beer {
    public static void main(String[] args){
    for(int x = 99; x>0; x--)
    {
      int count = x; 
      System.out.println(x +"Bottles of Beer on the wall");
      System.out.println(x +"Bottles of Beer");
      System.out.println("Yay take one down, ya pass it around");

      count--;
      System.out.println(count +"Bottles of Beer on the wall");
      
    }
    System.out.println("No bottles of beer on the wall,");
    System.out.println("no bottles of beer,");
    System.out.println("ya’can’t take one down");System.out.println("ya can’t pass it around,");
    System.out.println("cause there are no more bottles of beer on the wall!");
    }
}