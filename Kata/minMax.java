public class Kata {
    public static String highAndLow(String numbers) {
          String[] arr = numbers.split(" ");
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          for (int i=0; i< arr.length; i++){
              int value = Integer.parseInt(arr[i]);
              if (value < min) min = value;
              if (value > max) max = value;
          }
          return String.format("%d %d", max, min);
    }
  }

  //Find highest and lowest values in a string of numbers, return result as a string