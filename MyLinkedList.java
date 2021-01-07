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

  public void add (int index, String value) {

  }

  public String get (int index) {
    Node toGetNode = nodeFinder(index);
    return toGetNode.getCurrentData();
  }

  public String set (int index, String value) {
    Node toReplaceNode = nodeFinder(index);
    return toReplaceNode.setCurrentData(value);
  }

  public String toString() {

  }

  public String reversedToString() {

  }

  private Node nodeFinder (int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsExceptions("Your current index " + index + " is not between 0 and " + size);
    }

    Node aNode = start;

    for (int i = 0; i <= index; i++) {
      aNode = aNode.getNextData();
    }

    return aNode;
  }
}
