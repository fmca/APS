package factory_method;

class FactoryTest {

  private FactoryTest() {}
  
  public static void main(String[] args) {
    Airline airline1 = new TAM();
    Airline airline2 = new TAP();
    airline1.flightProcedure();
    airline2.flightProcedure();
  }
}
