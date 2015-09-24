package bridge;

class Picture extends Image{
    
    public static class User { 
        private String name; 
        public User(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    }
    private User user;
    
    public Picture(User user, ImageImpl imageImpl){
        super(imageImpl);
        this.user = user;
    }
    
    public void save(){
        getImageImpl().compress(this.getClass().getSimpleName() + "/" + this.user.getName());
    }
    
    public void show(){
        getImageImpl().load(this.getClass().getSimpleName() + "/" + this.user.getName());
    }
    
}