public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
      int avg = 0, sum = 0;
      for(int i = 0; i < classPoints.length; i++) {
        sum += classPoints[i];
      }
      avg = sum / classPoints.length;
      return yourPoints > avg;
    }
  }

  //Finds average of an integer array and compares an integer argument.
  //Returns true if the second argument is greater than the average of all ints in the array.