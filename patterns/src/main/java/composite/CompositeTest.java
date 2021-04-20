package composite;

final class CompositeTest {

  private CompositeTest() {}

  public static void main(final String[] args) {

    Subscriber citi = new Group(new Subscriber[] {
       new Student("x from citi"), new Student("y from citi")
    });

    Subscriber cin = new Group(new Subscriber[] {citi, new Student("y")});

    cin.warn();
  }
}
