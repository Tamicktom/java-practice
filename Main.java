
public class Main {
  public static void main(String[] args) {
    WindowApp windowApp = new WindowApp();
    try {
      windowApp.start(args);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
