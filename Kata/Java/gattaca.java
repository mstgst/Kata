public class DnaStrand {
    public static String makeComplement(String dna) {
      String result = "";
      for(int i = 0; i < dna.length(); i++) {
        if(dna.charAt(i) == 'A') {
          result += 'T';
        } if(dna.charAt(i) == 'T') {
          result += 'A'; }
        if(dna.charAt(i) == 'C') {
          result += 'G';
        } if(dna.charAt(i) == 'G') {
          result += 'C';
        }
      }
      return result;
    }
  }

  //Accepts String argument, replaces DNA sequence with the appropriate complementary sequence