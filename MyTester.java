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
    System.out.println(thing.size());
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    for (int i = 0; i < thing.size(); i++) {
      System.out.println(thing.get(i));
    }
    thing.add(2, "adsf");
    System.out.println(thing.size());
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    thing.add(0, "a1111111dsf");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    System.out.println(thing.size());
    thing.add(6, "a000000dsf");
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    thing.remove(3);
    System.out.println(thing);
    System.out.println(thing.reversedToString());
    System.out.println(thing.size());

    MyLinkedList thing2 = new MyLinkedList();
    thing2.add("a");
    thing2.add("ab");
    thing2.add("abc");
    thing2.add("abcd");
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    thing2.set(1, "NEWEWE");
    System.out.println(thing2.size());
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    for (int i = 0; i < thing2.size(); i++) {
      System.out.println(thing2.get(i));
    }
    thing2.add(2, "adsf");
    System.out.println(thing2.size());
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    thing2.add(0, "a1111111dsf");
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    System.out.println(thing2.size());
    thing2.add(6, "a000000dsf");
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    thing2.remove(3);
    System.out.println(thing2);
    System.out.println(thing2.reversedToString());
    System.out.println(thing2.size());

    thing.extend(thing2);
    System.out.println(thing);
  }
}
