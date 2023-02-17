public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      String caseInsensitive = name.toUpperCase();
      String[] firstLast = caseInsensitive.split(" ");
      return firstLast[0].charAt(0) + "." + firstLast[1].charAt(0);
    }
  }

  //Returns a name as initials