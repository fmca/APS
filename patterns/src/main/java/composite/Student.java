package composite;

public class Student implements Subscriber {

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void warn() {
    System.out.println(name + ", be warned!");
  }
}
