import java.util.Arrays;
public class Solution {

    public static boolean check(Object[] a, Object x) {
        return (Arrays.asList(a).contains(x));
    }

}

//Accepts two arguments: Array of objects and objects
//Checks if the array contains a given object