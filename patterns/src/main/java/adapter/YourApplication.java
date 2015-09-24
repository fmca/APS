package adapter;

class YourApplication{
    
    ISocialNetwork socialNetwork;
    
    public YourApplication(ISocialNetwork socialNetwork){
        this.socialNetwork = socialNetwork;
    }
    
    public void postOnSocialNetwork(){
        socialNetwork.post();
    }
    
    //...
    
}