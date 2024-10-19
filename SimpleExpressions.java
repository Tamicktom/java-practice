public class SimpleExpressions {
  public static void main(String[] args) {
    String name = "Tamick";
    String secondName = "Tom";
    // String printedText = "Hello ".concat(name).concat(" ").concat(secondName);

    Integer number = 10;
    Double salary = 100.0;

    String printedText = String.format("Hello %s %s %d %f", name, secondName, number, salary);

    System.out.println(printedText);
  }
}
