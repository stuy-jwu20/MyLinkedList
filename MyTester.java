public class MyTester {
  public static void main(String[] args) {
    MyLinkedList thing = new MyLinkedList();
    thing.add("a");
    thing.add("ab");
    thing.add("abc");
    thing.add("abcd");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    thing.set(1, "NEWEWE");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    for (int i = 0; i < thing.size(); i++) {
      System.out.println(thing.get(i));
    }
    thing.add(2, "adsf");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    thing.add(0, "a1111111dsf");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    thing.add(6, "a000000dsf");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
  }
}
