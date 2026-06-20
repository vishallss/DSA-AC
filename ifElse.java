import java.util.Scanner;

public class ifElse {
   public static void main (String[] args){
     Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      if ( a >= 18) {
         System.out.println("audelt");
      }
      else{
         System.out.println("not audelt");
      }
   }
   
}
