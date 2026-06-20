public class Zero_onetriangle {
   public static void zero_one_trriangle(int n){
      for(int i=1; i<=n; i++){
         for(int j=1; j<=i; j++){// jevdi line No tevdi value pront
            if((i+j) % 2 == 0){
               System.out.print("1");
            }else{
               System.out.print("0");
            }
         }
         System.out.println();
      }
   }

 public static void main(String [] args){
    zero_one_trriangle(5 );
   
 }
}
