public class Node {
  public Node (String value) {
    data = value;
  }

  private String data;

  private Node next, prev;

  public String getCurrentData () {
    return data;
  }

  public void setCurrentData (String otherData) {
    data = otherData;
  }

  public Node getNextData () {
    return next;
  }

  public void setNextData (Node newNextNode) {
    next = newNextNode;
  }

  public Node getPrevData () {
    return prev;
  }

  public void setPrevData (Node newPrevNode) {
    prev = newPrevNode;
  }

}
