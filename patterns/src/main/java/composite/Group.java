package composite;

class Group implements Subscriber {

  Subscriber[] subscribers;

  public Group(Subscriber[] subscribers) {
    this.subscribers = subscribers;
  }

  public void warn() {
    for (Subscriber s : subscribers) {
      s.warn();
    }
  }
}
