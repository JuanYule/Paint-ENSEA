package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Window extends JFrame implements ActionListener {

    private Drawing drawing;
    protected String miFigura;

    public Window(String Title, int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();
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
        southPanel.setLayout(new GridLayout(2,2));
        southPanel.add(Ellipse);
        southPanel.add(Rectangle);
        southPanel.add(Circle);
        southPanel.add(Square);
//==============Add panel colors and figures in one panel==========//
        JPanel South = new JPanel();
        South.setLayout(new GridLayout(1, 2));
        South.add(deref);
        South.add(southPanel);
//====================DAWING PANEL==============================//
        this.miFigura = "";
        this.drawing = new Drawing(Color.red, miFigura);
        contentPanel.add(this.drawing, "Center");
        ///JPanel northPanel = new JPanel();
        //northPanel.setLayout(new GridLayout(60,1));
        //northPanel.setBackground(Color.WHITE);
//========================== menu bar ===========================//
        JMenuBar m = new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenuItem New = new JMenuItem("New") ;
        JMenuItem Open = new JMenuItem("Open") ;
        JMenuItem Save = new JMenuItem("Save") ;
        JMenuItem Quit = new JMenuItem("Quit") ;

        Save.addActionListener(this);
        Open.addActionListener(this);
        Quit.addActionListener(this);

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
        m.add(menu1);
        m.add(menu2);

        this.setJMenuBar(m);
    //========
        contentPanel.add(South,"South");
        this.setVisible(true);
    }
 //=====================================================================///
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Noir":
                this.drawing.setColor(Color.BLACK);
                //System.out.println("I've been clicked Noir!");
                break;
            case "Rouge":
                //System.out.println("I've been clicked rouge!");
                this.drawing.setColor(Color.RED);
                break;
            case "Jaune":
                //System.out.println("I've been clicked jaune!");
                this.drawing.setColor(Color.YELLOW);
                break;
            case "Purple":
                //System.out.println("I've been clicked purple!");
                this.drawing.setColor(Color.MAGENTA);
                break;
            case "Bleu":
                //System.out.println("I've been clicked blue!");
                this.drawing.setColor(Color.BLUE);
                break;
            case "Vert":
                //System.out.println("I've been clicked vert!");
                this.drawing.setColor(Color.GREEN);
                break;
            case "Orange":
                //System.out.println("I've been clicked orange!");
                this.drawing.setColor(Color.ORANGE);
                break;
            case "Rose":
                //System.out.println("I've been clicked Rose");
                this.drawing.setColor(Color.PINK);
                break;
            //======================Button Implementation Figures==============================
            case "Ellipse":
                //System.out.println("I've been clicked ellipse!");
                miFigura = "Ellipse";
                this.drawing.setName(miFigura);
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Rectangle":
                //System.out.println("I've been clicked rectangle!");
                miFigura = "Rectangle";
                this.drawing.setName(miFigura);
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Square":
                //System.out.println("I've been clicked square!");
                miFigura = "Square";
                this.drawing.setName(miFigura);
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Circle":
                //System.out.println("I've been clicked circle!");
                miFigura = "Circle";
                this.drawing.setName(miFigura);
                //System.out.println(draw.getCurrent_figure() + " " + draw.getColor());
                break;
            case "Save":
                SaveFile();
                break;
            case "Open":
                OpenFile();
                break;
            case "Author":
                JOptionPane info = new JOptionPane();
                JOptionPane.showInternalMessageDialog( info, "Paint by Juan S. Yule",
                        "Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void SaveFile() {
        FileOutputStream file;
        ObjectOutputStream out;
        try {
            file = new FileOutputStream("Dessin.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(this.drawing);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void OpenFile() {
        FileInputStream file_in;
        ObjectInputStream in ;
        Container contentPane = getContentPane();
        contentPane.remove(this.drawing);
        try {
            file_in = new FileInputStream("Dessin.txt");
            in = new ObjectInputStream(file_in);
            this.drawing = (Drawing) in.readObject();
            contentPane.add(this.drawing);
            contentPane.revalidate();
            contentPane.repaint();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
