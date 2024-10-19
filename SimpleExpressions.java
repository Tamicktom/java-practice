import java.time.LocalDate;

public class SimpleExpressions {
  public static void main(String[] args) {
    String name = "Henrique";
    String secondName = "Angelo Vieira Fonseca";
    String fullName = "%s %s".formatted(name, secondName);

    LocalDate beginDate = LocalDate.of(2020, 1, 1);

    Integer number = 10;
    Double salary = 100.0;

    String printedText = String.format("Hello %-24.24s %d %f %td/%<tm/%<tY", fullName, number, salary, beginDate);

    System.out.println(printedText);
  }
}
