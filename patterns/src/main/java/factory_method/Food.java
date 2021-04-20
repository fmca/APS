package factory_method;

abstract class Food {

  public Food() {
    prepare();
  }

  protected abstract void prepare();
}
