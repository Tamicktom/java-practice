public class SimpleExpressions {
  public static void main(String[] args) {
    String name = "Tamick";
    String secondName = "Tom";
    String fullName = "%s %s".formatted(name, secondName);

    Integer number = 10;
    Double salary = 100.0;

    String printedText = String.format("Hello %-30s %d %f", fullName, number, salary);

    System.out.println(printedText);
  }
}
