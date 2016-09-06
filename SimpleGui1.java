import javax.swing.*;
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
    button = new JButton("click me " + count);

    button.addActionListener(this);

    frame.getContentPane().add(button);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event) {
    count++;
    button.setText(Integer.toString(count));
  }

}
