package bridge;

class BridgeTest {

  public static void main(String[] args) {

    Image i = new Picture(new Picture.User("user1"), new JPEGImpl());
    Image i2 = new Picture(new Picture.User("user2"), new PNGImpl());

    i.save();
    i2.save();
  }
}
