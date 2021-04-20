package bridge;

class PNGImpl extends ImageImpl {

  public void compress(final String pathToCompressedFile) {
    // JPEG compression algorithm
    System.out.println("Compressing PNG");
    // save into file
    System.out.println("Saving: " + pathToCompressedFile + ".png");
  }

  public void load(final String path) {
    // save into file
    System.out.println("Loading from " + path + ".png");
  }
}
