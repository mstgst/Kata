class Kata {
    public static String getMiddle(String word) {
      final boolean even = (word.length()%2 == 0);
      int middle = (word.length()/2);
      String result = "";
      if(even) {
        result = result + word.charAt(middle-1) + word.charAt(middle);
      } else {
      result = result + (word.charAt(middle));
        }
      return result;
    }
  }

  //Returns the middle character of odd string/middle two characters of an even string.