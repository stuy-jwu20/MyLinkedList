public class MyLinkedList {
  private int size;

  private Node start, end;

  public MyLinkedList() {
    size = 0;
    this.start = null;
    this.end = null;
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
      add(value);
    } else if (index == 0) {
      Node beforeNode = nodeFinder(index-1);
      Node afterNode = nodeFinder(index);
      start = newestNode;
      newestNode.setNextData(afterNode);
      afterNode.setPrevData(newestNode);
    } else if (index == size-1) {
      Node beforeNode = nodeFinder(index-1);
      Node afterNode = nodeFinder(index);
      end = newestNode;
      newestNode.setPrevData(beforeNode);
      beforeNode.setNextData(newestNode);
    } else {
      Node beforeNode = nodeFinder(index-1);
      Node afterNode = nodeFinder(index);
      newestNode.setPrevData(beforeNode);
      newestNode.setNextData(afterNode);
      beforeNode.setNextData(newestNode);
      afterNode.setPrevData(newestNode);
      }
    size++;
  }

  public String get (int index) {
    if (index < 0 || index >= this.size()) {
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
    if (size == 0) return "[]";

    String theNodeString = "[";
    Node currentNode = end;
    while (currentNode.getPrevData() != null) {
      theNodeString += currentNode.getCurrentData() + ", ";
      currentNode = currentNode.getPrevData();
    }
    theNodeString += currentNode.getCurrentData() + "]";
    return theNodeString;
  }

  public String toString() {
    if (size == 0) return "[]";

    String theNodeString = "[";
    Node currentNode = start;
    while (currentNode.getNextData() != null) {
      theNodeString += currentNode.getCurrentData() + ", ";
      currentNode = currentNode.getNextData();
    }
    theNodeString += currentNode.getCurrentData() + "]";
    return theNodeString;
  }

  private Node nodeFinder (int index) {
    Node aNode = start;
    int counter = 0;
    while (aNode != null && counter < index) {
      aNode = aNode.getNextData();
      counter++;
    }
    return aNode;
  }

/////////////////////////// Part 2 ///////////////////////////

  public String remove (int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Your current index " + index + " is not between 0 and " + (size-1));
    }
    System.out.println(index + " " + (size -1));
    String removedString = nodeFinder(index).getCurrentData();
    if (index == 0) {
      Node newFirst = nodeFinder(index+1);
      start = newFirst;
      newFirst.setPrevData(null);
    } else if (size == 1) {
      start = end = null;
    } else if (index == size-2) {
      Node newLast = nodeFinder(index-1);
      end = newLast;
      newLast.setNextData(null);
    } else {
      Node nodeBefore = nodeFinder(index-1);
      Node nodeAfter = nodeFinder(index+1);
      nodeBefore.setNextData(nodeAfter);
      nodeAfter.setPrevData(nodeBefore);
    }
    size--;
    return removedString;
  }

  public void extend (MyLinkedList other) {
  }

}
