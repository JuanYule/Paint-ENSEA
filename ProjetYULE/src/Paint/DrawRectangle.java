package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawRectangle extends JFrame implements ActionListener {

    public static void main(String[] arguments) {

        MyPanel draw = new MyPanel();
        // create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JFrame Color Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel to main frame
        frame.add(draw);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

// create a panel that you can draw on.
class MyPanel extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10,10,100,100);
    }
}