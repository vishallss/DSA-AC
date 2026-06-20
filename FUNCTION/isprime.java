public class isprime {

   //only for n>=2
   public static boolean isPrime(int n){



      // Corner case
      //2
      if(n==2){
         return true; 
      }



      boolean isPrime = true;
      for (int i=2; i<=n-1; i++){
         if(n % i == 0){  //competely dividing
         isPrime= false;
          break;  // or Break; or return false;
         }
      }
      
      return isPrime ;
}
}