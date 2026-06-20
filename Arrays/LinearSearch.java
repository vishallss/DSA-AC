public class LinearSearch {
   public static int linearsearch(int number[], int key){
      for(int i=0; i<number.length; i++){
         if (number[i]==key){
            return i;
         }
      }
      return -1;  //key is out of array

   }
   public static void main(String [] args){
      int number[] = {2, 4, 6, 8 ,10 ,12, 14, 16};
      int key = 10;
      //System.out.println(linearsearch(number, key)); //o/p= 4
      int index = linearsearch(number, key);
      if(index == -1){
         System.out.println("not found");
      }else{
         System.out.println("key is at index : " + index);
         
      }
   }
} 

