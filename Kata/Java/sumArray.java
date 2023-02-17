public class SumArray {

    public static double sum(double[] numbers) {
      double sum = 0.0;
      for(int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
      return sum;
    }
  }

  //Returns the sum of all numbers in an array