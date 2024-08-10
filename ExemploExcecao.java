import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

  public static void main(String[] args) {
    doubleParse();
    numberFormat();
  }

  private static void doubleParse() {
    String str = "1.75";

    try {
      Double valor = Double.valueOf(str);

      System.out.println(valor);
    } catch (Exception e) {
      System.err.println("Não foi possível converter o valor para Double");
    }
  }

  private static void numberFormat() {
    String str = "1.75";

    try {
      Number valor = NumberFormat.getInstance().parse(str);

      System.out.println(valor);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}