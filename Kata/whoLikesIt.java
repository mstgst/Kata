class Solution {
    public static String whoLikesIt(String... names) {
      String result = "";
      int totalLikes = names.length-2;
      if(names.length <= 0) result = "no one likes this";
      if(names.length == 1) result = names[0] + " likes this";
      if(names.length == 2) result = names[0] + " and " + names[1] + " like this";
      if(names.length == 3) result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
      if(names.length >= 4) result = names[0] + ", " + names[1] + " and " + totalLikes + " others like this";
      
        return result;
    }
}

// function which takes an array containing the names of people that 'like' an item.
// returns string to display based on parameters determined by the amount and order of likes