package bridge;

abstract class Image {

  private ImageImpl imageImpl;

  public Image(ImageImpl imageImpl) {
    this.imageImpl = imageImpl;
  }

  protected ImageImpl getImageImpl() {
    return this.imageImpl;
  }

  public abstract void save();

  public abstract void show();
}
