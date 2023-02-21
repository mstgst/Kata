public class Kata
{
  public static int sum(int[] numbers)
  {
    if(numbers == null || numbers.length <= 2) {
      return 0;
    }
    int sum = 0, low = numbers[0], high = numbers[0];
    for(int i : numbers) {
      sum += i;
      if(i > high) high = i;
      if(i < low) low = i;
    }
    return sum - (high+low);
  }
}

//sums all numbers in an array, minus the highest and lowest number. returns 0 if array is null