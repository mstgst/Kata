import java.util.Arrays;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    
    if( a==null || b==null) {
      return false;
    }
    
    if (a.length != b.length) {
      return false;
    }
    
    for(int i = 0; i < a.length; i++) {
      a[i] = a[i] * a[i];
      }
    
    Arrays.sort(a); Arrays.sort(b);
    
    for(int i = 0; i < a.length; i++) {
      if(a[i] != b[i]) return false;
      }
    return true;
    }
}

//Returns true if all contents of array a are the square root of all contents in array b, 
// regardless of order of the elements of the arrays
// Returns false in all other circumstances, including null input, uneven arrays
