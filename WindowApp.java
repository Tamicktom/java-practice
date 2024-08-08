import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowApp {
  public int clickCounter = 0;

  public void start(String[] args) {
    // create a label
    JLabel label = new JLabel("Hello World");
    label.setSize(200, 200);

    // create a button
    JButton button = new JButton("Click Me");
    button.setSize(200, 200);

    // add the label and button to the frame
    JFrame frame = new JFrame("Hello World");

    frame.add(label);
    frame.add(button);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocation(100, 100);
    frame.setVisible(true);

    // add an action listener to the button
    button.addActionListener(e -> {
      // increment the click counter
      incrementClickCounter();

      // update the label text
      label.setText("You clicked the button " + clickCounter + " times");
    });
  }

  private void incrementClickCounter() {
    clickCounter++;
  }
}