package composite;

class Group implements Subscriber {

  private Subscriber[] subscribers;

  Group(Subscriber[] subscribers) {
    this.subscribers = subscribers;
  }

  public void warn() {
    for (Subscriber s : subscribers) {
      s.warn();
    }
  }
}
