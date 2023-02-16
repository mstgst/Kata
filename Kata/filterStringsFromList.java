import java.util.*;

public class Kata {
  
  public static List filterList(final List list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                result.add(list.get(i));
            }
        }
        return result;
    }
  }

  //NON STREAM SOLUTION 