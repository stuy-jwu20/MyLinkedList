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
    Node newestNode = new Node (value);

    if (index == 0) {
      if (size == 0) {
          start = end = toAppend;
        } else {
          newestNode.setNextData(start);
          start = newestNode;
        }
      } else {
        if (index < 0 || index > size) {
          throw new IndexOutOfBoundsExceptions("Your current index " + index + " is not between 0 and " + size);
        }
        else if (index == size) {
          end.setNextData(newestNode);
          end = newestNode;
        } else {
          Node nodeBeforeIndex = nodeFinder(index - 1);
          Node afterOldNode = nodeBeforeIndex.setNextData(newestNode);
          newestNode.setNextData(afterOldNode);
        }
      }
      size++;
  }

  public String get (int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsExceptions("Your current index " + index + " is not between 0 and " + size);
    }

    Node toGetNode = nodeFinder(index);
    return toGetNode.getCurrentData();
  }

  public String set (int index, String value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsExceptions("Your current index " + index + " is not between 0 and " + size);
    }

    Node toReplaceNode = nodeFinder(index);
    return toReplaceNode.setCurrentData(value);
  }

  public String reversedToString() {
    String theNodeString = "[";
    Node currentNode = start;
    for (int i = size - 1; i >= 0; i--) {
      if (i > 0) {
        theNodeString += currentNode + ", ";
        currentNode.getPrevData();
      }
      else if (i = 0) {
        theNodeString += currentNode + "]";
      }
    }
    return theNodeString;
  }

  public String toString() {
    String theNodeString = "[";
    Node currentNode = end;
    for (int i = 0; i < size; i++) {
      if (i < size - 1) {
        theNodeString += currentNode + ", ";
        currentNode.getNextData();
      }
      else if (i = size - 1) {
        theNodeString += currentNode + "]";
      }
    }
    return theNodeString;
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
