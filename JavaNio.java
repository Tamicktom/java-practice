import java.io.File;
import java.io.FileOutputStream;

public class JavaNio {
  public static void main(String[] args) {
    File dir = new File("/home/tamicktom/Documents/estudo/java-practice/teste");
    System.out.println("dir exists? " + dir.exists());

    if (!dir.exists()) {
      // create directory
      dir.mkdir();
    }

    // create file
    File file = new File(dir, "test.txt");

    StringBuilder content = new StringBuilder();
    content.append("Hello World!");

    try {
      file.createNewFile();
      file.setWritable(true);
      file.setReadable(true);
      file.setExecutable(true);

      // write content
      FileOutputStream fos = new FileOutputStream(file);
      fos.write(content.toString().getBytes());
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}