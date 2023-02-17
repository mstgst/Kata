public class BitCounting {

	public static int countBits(int n){
		// Show me the code!
    int result = 0;
    String binary = Integer.toBinaryString(n);
    for(int i = 0; i < binary.length(); i++) {
      if( binary.charAt(i) == '1' ) {
        result++;
      }
    }
    return result;
	}
	
}

//Converts an integer arguent to binary and determines the number of bits 