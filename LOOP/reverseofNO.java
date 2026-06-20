package LOOP;

public class reverseofNO {
   public static void main(String[] args){
      
      for(int i = 10032; i>0;){
         
         int lastdigit = i%10;
         System.out.print(lastdigit);
         i=i/10;
      }
   }
   
}
