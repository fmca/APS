package factory_method;

abstract class Airline{
    
    public void flightProcedure(){
        takeOff();
        Food f = makeFood();
        serveFood(f);
        land();
        
    }
    
    public abstract Food makeFood();
    
    public void takeOff(){
        System.out.println(this.getClass().getSimpleName()+"'s airplane is taking off!");
    }
    
    public void serveFood(Food f){
        System.out.println("Serving " + f.getClass().getSimpleName() + " for everyone!");
    }
    
    public void land(){
        System.out.println("Landing!");
    }
    
}