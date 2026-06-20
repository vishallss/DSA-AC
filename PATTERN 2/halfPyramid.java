public class halfPyramid {
   public static void Inverted_pyramid(int n){
      //outer loop || Rows
      for(int i=1; i<=n; i++){
         //space
         for(int j=1; j<=n-i; j++){
            System.out.print (" ");
            }
            //star
            for(int j=1; j<=i; j++){
               System.out.print("*");
            
            }
         System.out.println();
      }
   }

   //inverted haldf pyramid with number
   public static void inverted_half_pyramid_withNumber(int n){
      for(int i = 1; i<=n; i++){
         //inner loop -- number
         for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
         }
         System.out.println();
      }
   }


   //FLOYE'S triangle
   public static void floweds_trianle(int n){
      int counter = 1;
      for(int i=1; i<=n; i++){
         //inner -how many times will counter be pront
         for(int j=1; j<=i; j++){
            System.out.print(counter+ " ");
            counter++;
         }
         System.out.println();
      }
   }
      public static void main (String[] args){
         //Inverted_pyramid(4); 
         //inverted_half_pyramid_withNumber(5);
         floweds_trianle(5);
      }
   
}
 