public class MyLinkedList {
  private int size;

  private Node start, end;

  public MyLinkedList() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add (String value) {
    Node toAppend = new Node (value);
    if (size == 0) {
      start = end = toAppend;
    } else {
      end.setNextData(toAppend);
      end = toAppend;
    }
    size++;
    return true;
  }

  public boolean add (int, index, String value) {

  }

  public void add (int index, String value) {

  }

  public String get (int index) {

  }

  public String set (int index, String value) {

  }

  public String toString() {

  }

  public String reversedToString() {

  }

  private Node nodeFinder(Node currentNode) {

  }
}
