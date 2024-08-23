public class SelfInstance {

  private static SelfInstance instance;

  private SelfInstance() {
  }

  public static SelfInstance getInstance() {
    if (instance == null) {
      instance = new SelfInstance();
    }
    return instance;
  }

  public void print() {
    System.out.println("Hello from SelfInstance");
  }
}
