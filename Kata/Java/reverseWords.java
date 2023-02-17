public class Kata
import java.util.Arrays;
import java.util.stream.Collectors;
{
  
//STREAM SOLUTION FOR REVERSING WORDS
//SIMPLE BUT REQUIRES UTIL IMPORT
  public static String reverseWords(final String original)
  {
    String reversedString = Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    
    return reversedString;
  }

//STRINGBUILDER SOLUTION WITH DEFAULT JAVA LIBRARIES
//THIS SOLUTION INCLUDES A BUG WHEN A STRING OF PURELY SPACES IS PROVIDED
//MAY REVISIT
  public static String reverseWords(final String original)
  {
    String words[]=original.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder pointer=new StringBuilder(w);  
        pointer.reverse();  
        reverseWord+=pointer.toString()+" ";  
    }  
    return reverseWord.trim();
  }
}
