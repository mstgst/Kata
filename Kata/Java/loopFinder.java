import java.util.HashMap;
public class LoopInspector {
  public int loopSize(Node node) {
    Node current = node;
    HashMap<Node, Integer> map = new HashMap<>();
    int i = 0;
    for(; !map.containsKey(current); i++) {
      map.put(current, i);
      current = current.getNext();
    }
    return i - map.get(current);
  }
}

// You are given a node that is the beginning of a linked list.
// This list contains a dangling piece and a loop. 
// Your objective is to determine the length of the loop. 