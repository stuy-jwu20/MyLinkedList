public class Node {
  public Node (String value) {
    data = value;
  }

  private String data;

  private Node next, prev;

  public String getCurerntData () {
    return data;
  }

  public Node getNextData () {
    return next;
  }

  public Node getPrevData () {
    return prev;
  }
}
