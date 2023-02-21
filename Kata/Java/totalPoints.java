public class TotalPoints {
  
    public static int points(String[] games) {
      int points = 0;
      for(int i = 0; i < games.length; i++) {
        int home = Character.getNumericValue(games[i].charAt(0)), 
        away = Character.getNumericValue(games[i].charAt(2));
        if(home > away) points += 3;
        if(home == away) points++;
      }
      return points;
    }
}

//Calculates total points in a season of sports games
//Where victory = 3 points, draw = 1 point, loss = 0 points