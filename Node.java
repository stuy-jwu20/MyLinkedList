public class Node {
  public Node (String value) {
    data = value;
  }

  private String data;

  private Node next, prev;

  public String getCurrentData () {
    return data;
  }

  public String setCurrentData (String otherData) {
    String oldData = data;
    data = otherData;
    return oldData
  }

  public Node getNextData () {
    return next;
  }

  public Node setNextData (Node otherNode) {
    Node oldNextNode = next;
    next = otherNode;
    return oldNextNode;
  }

  public Node getPrevData () {
    return prev;
  }
}
