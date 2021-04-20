package composite;

class CompositeTest {

  public static void main(String[] args) {

    Subscriber citi =
        new Group(new Subscriber[] {new Student("x from citi"), new Student("y from citi")});

    Subscriber cin = new Group(new Subscriber[] {citi, new Student("y")});

    cin.warn();
  }
}
