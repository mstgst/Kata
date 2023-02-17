public class Codewars {
    public static String oddOrEven (int[] array) {
      int sum = 0;
    for(int i =0; i<array.length; i++) {
      sum += array[i];
    }
      return (sum%2==0) ? "even" : "odd";
    }
  }

  //Determines if the sum of all numbers in an array are even or odd


  import static java.util.Arrays.stream;

class Codewars {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

//Stream solution