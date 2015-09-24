package factory_method;

class EatableFood extends Food{
    
    public void prepare(){
        System.out.println("Cooking stuff.");
    }
}