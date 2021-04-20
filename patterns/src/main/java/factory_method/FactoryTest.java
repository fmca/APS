package factory_method;

final class FactoryTest {

  private FactoryTest() {}

  public static void main(final String[] args) {
    Airline airline1 = new TAM();
    Airline airline2 = new TAP();
    airline1.flightProcedure();
    airline2.flightProcedure();
  }
}
