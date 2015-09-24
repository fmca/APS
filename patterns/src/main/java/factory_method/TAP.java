package factory_method;

class TAP extends Airline{
    
    public Food makeFood(){
        return new EatableFood();
    }
}