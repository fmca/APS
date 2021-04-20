package bridge;

abstract class ImageImpl {

  private byte[] pixels;

  public abstract void compress(String filePath);

  public abstract void load(String filePath);
}
