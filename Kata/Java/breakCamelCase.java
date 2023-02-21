class Solution {
    public static String camelCase(String input) {
      return String.join(" ", input.split("(?<!^)(?=[A-Z])"));
    }
  }

  //breaks camelCase strings with a space, leaves non camelCase strings intact