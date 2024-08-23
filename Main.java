import java.util.List;

import enums.BrazilianState;

public class Main {
  public static void main(String[] args) {
    brazilianStates();
    selfInstanceTest();
    localDateSample();
  }

  private static void brazilianStates() {
    BrazilianState state1 = BrazilianState.SAO_PAULO;

    System.out.println(state1.getName());
    System.out.println(state1.getAbbreviation());

    List<BrazilianState> states = BrazilianState.getStates();

    for (BrazilianState state : states) {
      String name = state.getName();
      String abbreviation = state.getAbbreviation();

      String message = String.format("State: %s (%s)", name, abbreviation);

      System.out.println(message);
    }
  }

  private static void selfInstanceTest() {
    SelfInstance selfInstance = SelfInstance.getInstance();

    selfInstance.print();
  }

  private static void localDateSample() {
    LocalDateSample sample = new LocalDateSample();

    sample.handle();
  }
}
