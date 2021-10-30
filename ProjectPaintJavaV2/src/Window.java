import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {

    public Window(String Title,int x,int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;
        contentPanel.setLayout(null);
//================ menu bar ===========================//
        JMenuBar m = new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenuItem New = new JMenuItem("New") ;
        JMenuItem Open = new JMenuItem("Open") ;
        JMenuItem Save = new JMenuItem("Save") ;
        JMenuItem Quit = new JMenuItem("Quit") ;

        menu1.add(New);
        menu1.add(Open);
        menu1.add(Save);
        menu1.add(Quit);

        m.add(menu1);

        this.setJMenuBar(m);
        this.setVisible(true);

//====================Panel Colors=========================================


        JButton black = new JButton("Black");
        black.addActionListener(this);
        black.setBackground(Color.black);
        JButton yellow = new JButton("Yellow");
        yellow.setBackground(Color.yellow);
        yellow.addActionListener(this);
        JButton red = new JButton("Red");
        red.setBackground(Color.red);
        red.addActionListener(this);
        JButton pink = new JButton("Pink");
        pink.setBackground(Color.pink);
        pink.addActionListener(this);
        JButton green = new JButton("Green");
        green.setBackground(Color.green);
        green.addActionListener(this);
        JButton purple = new JButton("Purple");
        purple.setBackground(Color.cyan);
        purple.addActionListener(this);
        JButton blue = new JButton("Blue");
        blue.setBackground(Color.blue);
        blue.addActionListener(this);
        JButton orange = new JButton("Orange");
        orange.setBackground(Color.orange);
        orange.addActionListener(this);



        JPanel deref = new JPanel();
        deref.setLayout(new GridLayout(2,4));
        deref.add(black);
        deref.add(yellow);
        deref.add(red);
        deref.add(pink);
        deref.add(green);
        deref.add(purple);
        deref.add(blue);
        deref.add(orange);

        contentPanel.add(deref);
        deref.setBounds(1,480,400,60);



//=====================Panel Figures======================================

        JButton Ellipse = new JButton("Ellipse");
        Ellipse.addActionListener(this);
        JButton Rectangle = new JButton("Rectangle");
        Rectangle.addActionListener(this);
        JButton Circle = new JButton("Circle");
        JButton Square = new JButton("Square");

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,2));
        southPanel.add(Ellipse);
        southPanel.add(Rectangle);
        southPanel.add(Circle);
        southPanel.add(Square);

        contentPanel.add(southPanel);
        southPanel.setBounds(400,480,400,60);

//============================Panel Draw==================================//

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(60,1));
        //southwestPanel.setBounds(400,400,400,100);
        contentPanel.add(northPanel,"North");
    }

    //======================Button Implementation Colors==============================
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Black":
                System.out.println("I've been clicked black!");
                break;
            case "Red":
                System.out.println("I've been clicked red!");
                break;
            case "Yellow":
                System.out.println("I've been clicked yellow!");
                break;
            case "Purple":
                System.out.println("I've been clicked purple!");
                break;
            case "Blue":
                System.out.println("I've been clicked blue!");
                break;
            case "Green":
                System.out.println("I've been clicked green!");
                break;
            case "Orange":
                System.out.println("I've been clicked orange!");
                break;

    //======================Button Implementation Figures==============================

            case "Ellipse":
                System.out.println("I've been clicked ellipse!");
                break;
            case "Rectangle":
                System.out.println("I've been clicked rectangle!");
                break;
            case "Square":
                System.out.println("I've been clicked square!");
                break;
            case "Circle":
                System.out.println("I've been clicked circle!");
                break;
        }
    }




    //======================Main======================0


    public static void main(String[] args) {
        Window win = new Window("Paint it black", 800, 600);



    }
}
