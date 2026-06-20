public class PairsInArray {
   public static void PrintPairs(int numbers[]){
      //Print total pairs take one variable
      int tp = 0;

      //Use concept of nested loop
      for(int i=0; i<numbers.length; i++){
         int current = numbers[i];
         for(int j=i+1; j<numbers.length; j++){
            System.out.print("(" + current + "," + numbers[j] + ")");
            // after printing every pair increase tp
            tp++;
         }
         System.out.println();
      }
      System.out.println("Total pairs = " + tp);
   }
   public static void main (String[] args){
      int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
      PrintPairs(numbers);
   }
}