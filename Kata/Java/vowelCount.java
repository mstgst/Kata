public class Vowels {

    public static int getCount(String str) {
      int result = 0;
      for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'i' | 
           str.charAt(i) == 'o' | str.charAt(i) == 'u') {
          result++;
        }
      }
      return result;
    }
  
  //MY INITIAL SOLUTION


    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
    
    //REGEX BASED SOLUTION
}