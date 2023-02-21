public class Kata {

  public static int makeNegative(final int x) {
    if(x == 0) {
      return 0;
    } else if(x > 0) {
      return (x - (x*2));
    } else return x;
  }
}

//returns the negative of the absolute value of x