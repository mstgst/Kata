import java.util.*;

public class Kata {
    public static String findNeedle(Object[] haystack) {
      String result = "found the needle at position ";
      for(int i = 0; i < haystack.length; i++) {
        if(haystack[i] == "needle") result += String.valueOf(i);
      }
      return result;
    }
  }

  //Finds a needle in a haystack, and returns index where it was located

    public static String findNeedle(Object[] haystack) {
      return "found the needle at position " +
       Arrays.asList(haystack).indexOf("needle");
     }

     //Improved solution requiring library imports