import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int passengers = 0;
    for(int i = 0; i < stops.size(); i++) {
      passengers += ((stops.get(i)[0]) - (stops.get(i)[1]));
  }
    return passengers;
}
  }

  //Determines how many passengers are on a bus given:
  //The bus starts a route with 0 passengers
  //The argument accepted is a list of int Arrays which contain two values
  ///The first value in the array is the amount of passengers entering the bus, and the second is the amount exiting the bus