public class Greed{
    public static int greedy(int[] dice) {
      int score = 0;
      int cntOne = 0;
      int cntTwo = 0;
      int cntThree = 0;
      int cntFour = 0;
      int cntFive = 0;
      int cntSix = 0;
      
      for(int i = 0; i < dice.length; i++) {
        if(dice[i] == 1) {
          cntOne++;
        } if(dice[i] == 2) {
          cntTwo++;
        } if(dice[i] == 3) {
          cntThree++;
        } if(dice[i] == 4) {
          cntFour++;
        } if(dice[i] == 5) {
          cntFive++;
        } if(dice[i] == 6) {
          cntSix++;
        }
      }
      if(cntSix/3 >= 1) {
        int newSix = cntSix - (cntSix%3);
        score += (newSix/3) * 600;
      } 
      if(cntFive > 0) {
        if(cntFive%3 == 0) {
          score += (cntFive/3) * 500;
        } else if(cntFive/3 >= 1) {
          int newFive = cntFive - (cntFive%3);
          score += ((newFive/3) * 500) + ((cntFive%3) * 50);
        } else{score += ((cntFive%3) * 50);
          }
        }
       if(cntFour/3 >= 1) {
        int newFour = cntFour - (cntFour%3);
        score += (newFour/3) * 400;
      }
       if(cntThree/3 >= 1) {
        int newThree = cntThree - (cntThree%3);
        score += (newThree/3) * 300;
      }
       if(cntTwo/3 >= 1) {
        int newTwo = cntTwo - (cntTwo%3);
        score += (newTwo/3) * 200;
      }
      if(cntOne > 0) {
        if(cntOne%3 == 0) {
          score += (cntOne/3) * 1000;
        } else if(cntOne/3 >= 1) {
          int newOne = cntOne - (cntOne%3);
          score += ((newOne/3) * 1000) + ((cntOne%3) * 100);
        } else{score += ((cntOne%3) * 100);
          }
        }
      return score;
    }
  }

  //Score tracker for the game 'greed'

  public class Greed {

    public static int greedy(int[] dice) {
      int n[] = new int[7];
      for (int d : dice) n[d]++;
      return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
    }
  }

  //Optimized solution