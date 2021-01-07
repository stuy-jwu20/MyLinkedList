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
      toAppend.setPrevData(end);
      end = toAppend;
    }
    size++;
    return true;
  }

  public void add (int index, String value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Your current index " + index + " is not between 0 and " + size);
    }

    Node newestNode = new Node (value);

    if (size == 0) {
      start = end = newestNode;
    } else {
      Node beforeNode = nodeFinder(index-1);
      Node afterNode = nodeFinder(index);
      if (index == 0) {
        start = newestNode;
        newestNode.setNextData(afterNode);
        afterNode.setPrevData(newestNode);
      } else if (index == size-1) {
        end = newestNode;
        newestNode.setPrevData(beforeNode);
        beforeNode.setNextData(newestNode);
      } else {
        newestNode.setPrevData(beforeNode);
        newestNode.setNextData(afterNode);
        beforeNode.setNextData(newestNode);
        afterNode.setPrevData(newestNode);
      }
    }

    size++;
  }

  public String get (int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Your current index " + index + " is not between 0 and " + (size-1));
    }

    return nodeFinder(index).getCurrentData();
  }

  public String set (int index, String value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Your current index " + index + " is not between 0 and " + (size-1));
    }

    String oldData = nodeFinder(index).getCurrentData();
    nodeFinder(index).setCurrentData(value);
    return oldData;
  }

  // This is just to test if my other parts do actually work and it isn't a fluke

  public String reversedToString() {
    String theNodeString = "[";
    for (int i = size - 1; i >= 0; i--) {
      if (i > 0) {
        theNodeString += this.get(i) + ", ";
      }
      else if (i == 0) {
        theNodeString += this.get(i);
      }
    }
    theNodeString += "]";
    return theNodeString;
  }

  public String toString() {
    String theNodeString = "[";
    for (int i = 0; size > 0 & i < size; i++) {
      if (i < size - 1) {
        theNodeString += this.get(i) + ", ";
      }
      else if (i == (size - 1)) {
        theNodeString += this.get(i);
      }
    }
    theNodeString += "]";
    return theNodeString;
  }

  private Node nodeFinder (int index) {
    Node aNode = start;

    for (int i = 0; i < index; i++) {
      aNode = aNode.getNextData();
    }

    return aNode;
  }

}
