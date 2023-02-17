import java.lang.StringBuilder;
class Solution {

  static String toCamelCase(String s) {
    final String regex = "([^a-zA-Z']+)'*\\1*";
    String[] split = s.split(regex);
    StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                sb.append(split[i]);
            } else if (split[i].length()>0){
                sb.append(split[i].replaceFirst(split[i].substring(0, 1), split[i].substring(0, 1).toUpperCase()));
            }
        }
        return new String(sb);
  }
}

// Stringbuilder based solution to camelCase problem.
// Covers both camel and pascal case.