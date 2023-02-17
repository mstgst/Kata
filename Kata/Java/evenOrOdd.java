public class EvenOrOdd {
    public static String even_or_odd(int number) {
        Boolean even = number % 2 == 0;
      return even ? "Even" : "Odd";
    }
}

//Returns a string declaring if an int argument is even or odd.