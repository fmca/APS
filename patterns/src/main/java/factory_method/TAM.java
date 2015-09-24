package factory_method;

class TAM extends Airline{
    
    public Food makeFood(){
        return new CheapFood();
    }
}