import java.util.*;

// BY REFRANCE CONSEPT

public class fxnArgument {
   public static void update(int marks[]){
      for (int i=0; i<marks.length; i++){ //track every position of array
         marks[i] = marks[i] + 1;
      }
   }
   public static void main(String[] args){
      int marks[] = {97,98,99};
      update(marks);

      //print our marks
   for(int i=0; i<marks.length; i++) { 
      System.out.println(marks[i]+" ");
   }
   System.out.println();
   
 }
}