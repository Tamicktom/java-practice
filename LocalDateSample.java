import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample implements Handlable {

  private LocalDate date;

  public LocalDateSample() {
    this.date = LocalDate.now();
  }

  @Override
  public void handle() {
    System.out.println(date);

    LocalDate myBirthDay = LocalDate.of(1990, 1, 1);
    System.out.println("My birth day: " + myBirthDay);

    myBirthDay = myBirthDay.plusYears(10);
    System.out.println("My birth day in 10 years: " + myBirthDay);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataConcreta = LocalDate.parse("01/01/2020", formatter);
    System.out.println(dataConcreta);
  }
}
