import static com.google.common.base.CaseFormat.*;

class Solution {
  static String toCamelCase(String s) {
      String result = "";
    if(s.contains("-")) {
result = LOWER_HYPHEN.to(LOWER_CAMEL, s);
      }
    if(s.contains("_")) {
result = LOWER_UNDERSCORE.to(LOWER_CAMEL, s);
      }
    return result;
  }
}

//Uses Guava to convert delimited strings to plaintext camelCase strings.
//Can be improved in efficiency/universal utility with a regex, may revisit.