import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

    System.out.println(dataConcreta.isAfter(LocalDate.now()));
    System.out.println(dataConcreta.isBefore(LocalDate.now()));

    System.out.println(
        dataConcreta.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

    LocalTime horaAtual = LocalTime.now();
    System.out.println(horaAtual);
  }
}
