package adapter;
import java.util.Date;
import lib.com.facebook.api.FacebookService;

class FacebookAdapter implements ISocialNetwork{
    
    FacebookService facebookService;
    
    public FacebookAdapter(FacebookService facebookService){
        this.facebookService = facebookService;
    }
    
    public void post(){
        this.facebookService.postOnTimeline(new Date());
    }
}