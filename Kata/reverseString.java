public class Kata
{
  public static String reverseString(final String original)
  {
    // Have at it
    String result = "";
    char pointer;
    for(int i = 0; i < original.length(); i++) {
      pointer = original.charAt(i);
      result = pointer + result;
      
    }
    return result;
  }
}