package bridge;

class JPEGImpl extends ImageImpl {

  public void compress(final String pathToCompressedFile) {
    // JPEG compression algorithm
    System.out.println("Compressing JPEG");
    // save into file
    System.out.println("Saving: " + pathToCompressedFile + ".jpg");
  }

  public void load(final String path) {
    // save into file
    System.out.println("Loading from " + path + ".jpg");
  }
}
