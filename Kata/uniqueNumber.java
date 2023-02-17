public class Kata {
    public static double findUniq(double arr[]) {
      double a = arr[0], b = arr[0], result = 0.0;
      int aCount = 0, bCount = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] == a) {
          aCount++; 
       } else if(arr[i] != a) {
          b = arr[i]; bCount++;
       } else if(arr[i] == b) {
          bCount++; }
      if(aCount > bCount) {
        result = b;
      } else result = a;
    }
      return result;
}
   }

   //Finds the unique element in an array of numbers and returns it

   public class Kata {
    public static double findUniq(double arr[]) {
      final double a = arr[arr[0] == arr[1] ? 0 : 2];
      for (double b : arr)
        if (b != a)
          return b;
    }
  }
  //More optimized solution using ternary operator