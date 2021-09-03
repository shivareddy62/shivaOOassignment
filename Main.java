import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Container;

public class Main {
    public static void main(String[] args) {

    JFrame window  = new  JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(500 , 300);
    window.setLocation(500, 300);

Container cp = window.getContentPane();
JPanel panel = new JPanel();
panel.add(new JTextField("hello world!"));
panel.add(new JButton("click on me!"));
panel.add(new JButton("sign up!"));
panel.add(new JTextField("java world!"));
cp.add(panel);

    window.pack();
    window.setVisible(true);


}
}