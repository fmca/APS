package bridge;

class Picture extends Image {

  public static class User {
    private String name;

    User(final String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }
  }

  private User user;

  Picture(final User user, final ImageImpl imageImpl) {
    super(imageImpl);
    this.user = user;
  }

  public void save() {
    getImageImpl().compress(
      this.getClass().getSimpleName() + "/" + this.user.getName());
  }

  public void show() {
    getImageImpl().load(
      this.getClass().getSimpleName() + "/" + this.user.getName());
  }
}
