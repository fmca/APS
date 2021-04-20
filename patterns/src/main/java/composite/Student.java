package composite;

public final class Student implements Subscriber {

  private String name;

  public Student(final String name) {
    this.name = name;
  }

  public void warn() {
    System.out.println(name + ", be warned!");
  }
}
