package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame implements ActionListener {

    protected Drawing draw = new Drawing();

    public Window(String Title, int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;
        contentPanel.setLayout(null);

//====================NORTH PANEL==============================//
        JPanel northPanel = new JPanel();
        //northPanel.setLayout(new GridLayout(60,1));
        northPanel.setBounds(0,0,800,480);
        northPanel.setBackground(Color.WHITE);
//====================Panel Colors=========================================//
        JButton noir = new JButton("Noir");
        noir.addActionListener( this);
        noir.setBackground(Color.black);

        JButton jaune = new JButton("Jaune");
        jaune.addActionListener( this);
        jaune.setBackground(Color.yellow);

        JButton rouge = new JButton("Rouge");
        rouge.addActionListener( this);
        rouge.setBackground(Color.red);

        JButton rose = new JButton("Rose");
        rose.addActionListener( this);
        rose.setBackground(Color.pink);

        JButton vert = new JButton("Vert");
        vert.addActionListener( this);
        vert.setBackground(Color.green);

        JButton purple = new JButton("Purple");
        purple.addActionListener( this);
        purple.setBackground(Color.magenta);

        JButton bleu = new JButton("Bleu");
        bleu.addActionListener( this);
        bleu.setBackground(Color.blue);

        JButton orange = new JButton("Orange");
        orange.addActionListener( this);
        orange.setBackground(Color.orange);

        JPanel deref = new JPanel();
        deref.setBounds(1,480,400,60);
        deref.setLayout(new GridLayout(2,4));
        deref.add(noir);
        deref.add(rouge);
        deref.add(vert);
        deref.add(bleu);
        deref.add(jaune);
        deref.add(rose);
        deref.add(purple);
        deref.add(orange);
//=====================Panel Figures======================================
        JButton Ellipse = new JButton("Ellipse");
        Ellipse.addActionListener( this);
        JButton Rectangle = new JButton("Rectangle");
        Rectangle.addActionListener( this);
        JButton Circle = new JButton("Circle");
        Circle.addActionListener( this);
        JButton Square = new JButton("Square");
        Square.addActionListener( this);

        JPanel southPanel = new JPanel();
        southPanel.setBounds(400,480,400,60);
        southPanel.setLayout(new GridLayout(2,2));
        southPanel.add(Ellipse);
        southPanel.add(Rectangle);
        southPanel.add(Circle);
        southPanel.add(Square);
//========================== menu bar ===========================//
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

        JMenu menu2 = new JMenu("About");
        JMenuItem Author = new JMenuItem("Author");
        Author.addActionListener(this);

        menu2.add(Author);

        m.add(menu1);
        m.add(menu2);

        this.setJMenuBar(m);

        contentPanel.add(northPanel,"Center");
        contentPanel.add(southPanel, "South");
        contentPanel.add(deref);
        this.setVisible(true);
//======================================================//
        draw.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                draw.mouseClicked(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                draw.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                draw.mouseReleased(e);
            }
        });
        draw.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                draw.mouseDragged(e);
            }
        });
    }
 //=====================================================================///
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Noir":
                draw.setColor(Color.BLACK);
                //System.out.println("I've been clicked Noir!");
                break;
            case "Rouge":
                //System.out.println("I've been clicked rouge!");
                draw.setColor(Color.RED);
                break;
            case "Jaune":
                //System.out.println("I've been clicked jaune!");
                draw.setColor(Color.YELLOW);
                break;
            case "Purple":
                //System.out.println("I've been clicked purple!");
                draw.setColor(Color.MAGENTA);
                break;
            case "Bleu":
                //System.out.println("I've been clicked blue!");
                draw.setColor(Color.BLUE);
                break;
            case "Vert":
                //System.out.println("I've been clicked vert!");
                draw.setColor(Color.GREEN);
                break;
            case "Orange":
                //System.out.println("I've been clicked orange!");
                draw.setColor(Color.ORANGE);
                break;
            case "Rose":
                //System.out.println("I've been clicked Rose");
                draw.setColor(Color.PINK);
                break;
            //======================Button Implementation Figures==============================
            case "Ellipse":
                //System.out.println("I've been clicked ellipse!");
                draw.setCurrent_figure(new Ellipse());
                draw.setName("Ellipse");
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Rectangle":
                //System.out.println("I've been clicked rectangle!");
                draw.setCurrent_figure(new Rectangle());
                draw.setName("Rectagle");
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Square":
                //System.out.println("I've been clicked square!");
                draw.setCurrent_figure(new Square());
                draw.setName("Square");
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Circle":
                //System.out.println("I've been clicked circle!");
                draw.setCurrent_figure(new Circle());
                draw.setName("Circle");
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Author":
                JOptionPane info = new JOptionPane();
                JOptionPane.showInternalMessageDialog( info, "Paint by Juan S. Yule",
                        "Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
