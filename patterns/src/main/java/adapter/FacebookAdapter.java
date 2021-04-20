package adapter;

import java.util.Date;
import lib.com.facebook.api.FacebookService;

class FacebookAdapter implements ISocialNetwork {

  private FacebookService facebookService;

  FacebookAdapter(final FacebookService facebookService) {
    this.facebookService = facebookService;
  }

  public void post() {
    this.facebookService.postOnTimeline(new Date());
  }
}
