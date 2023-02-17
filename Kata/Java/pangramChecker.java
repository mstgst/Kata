public class PangramChecker {
    public boolean check(String sentence) {
      boolean[] alphabet = new boolean[26];
      String str = sentence.toLowerCase();
      int pointer = 0;
      boolean result = true;
      for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
          pointer = str.charAt(i) - 'a';
        }
        alphabet[pointer]=true;
      }
      for(int i = 0; i <= 25; i++) {
        if(alphabet[i]==false) {
          result = false; }
      }
      return result;
    }
  }

  //Checks if a given sentence is a pangram (containing all letters of the alphabet)

  return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;

  // more optimal map one liner