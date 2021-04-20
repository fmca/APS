package adapter;

class YourApplication {

  private ISocialNetwork socialNetwork;

  YourApplication(final ISocialNetwork socialNetwork) {
    this.socialNetwork = socialNetwork;
  }

  public void postOnSocialNetwork() {
    socialNetwork.post();
  }

  // ...

}
