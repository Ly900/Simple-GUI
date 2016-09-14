import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1 implements ActionListener {
  JButton button;
  public static int count;

  public static void main(String[] args) {
    SimpleGui1 gui = new SimpleGui1();
    gui.go();
  }

  public void go() {
    count = 0;
    JFrame frame = new JFrame();
    button = new JButton("Clicked me " + count + " times.");

    button.addActionListener(this);

    frame.getContentPane().add(BorderLayout.CENTER, button);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event) {
    count++;
    Integer.toString(count);
    button.setText("Clicked me " + count + " times.");
  }

}
