package factory_method;

abstract class Food {

  Food() {
    prepare();
  }

  protected abstract void prepare();
}
