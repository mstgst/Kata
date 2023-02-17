public class XO {
  
    public static boolean getXO (String str) {
      int oCount = 0, xCount = 0; String caseInsensitive = str.toLowerCase();
      for(int i = 0; i < caseInsensitive.length(); i++) {
        if(caseInsensitive.charAt(i) == 'o') oCount++;
        if(caseInsensitive.charAt(i) == 'x') xCount++;
      }
      return oCount == xCount;
    }
  }