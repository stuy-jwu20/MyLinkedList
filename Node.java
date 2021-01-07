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

  public Node setNextData (Node newNextNode) {
    Node oldNextNode = next;
    next = newNextNode;
    return oldNextNode;
  }

  public Node getPrevData () {
    return prev;
  }

  public Node setPrevData (Node newPrevNode) {
    Node oldPrevNode = prev;
    prev = newPrevNode;
    return oldPrevNode;
  }
}
