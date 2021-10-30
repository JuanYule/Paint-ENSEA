import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame implements ActionListener {

        protected Drawing draw = new Drawing();

        public Window(String Title,int x,int y)
        {
                super(Title);
                this.setSize(x,y);
                //this.setPreferredSize(new Dimension(x, y));
                this.setVisible(true);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container contentPanel = this.getContentPane() ;


                //Here we set the menu and submenus
                JMenuBar MenuBar= new JMenuBar();

                JMenu menu1= new JMenu("File");
                JMenuItem New = new JMenuItem("New") ;
                menu1.add(New);
                menu1.addSeparator();
                JMenuItem Open = new JMenuItem("Open") ;
                JMenuItem Save = new JMenuItem("Save") ;
                menu1.add(Open);
                menu1.add(Save);
                menu1.addSeparator();
                JMenuItem Quit = new JMenuItem("Quit") ;
                menu1.add(Quit);

                JMenu menu2 = new JMenu("About");
                JMenuItem Author = new JMenuItem("Author");
                Author.addActionListener(this);
                menu2.add(Author);

                MenuBar.add(menu1);
                MenuBar.add(menu2);

                //We add here the panels and buttons of our Paint
                //First the panel with colors
                JPanel southPanel1 = new JPanel();
                southPanel1.setLayout(new GridLayout(2,4));

                JButton Black= new JButton("Black");
                Black.setBackground(Color.BLACK);
                Black.setForeground(Color.WHITE);
                Black.addActionListener(this);
                southPanel1.add(Black);

                JButton Yellow= new JButton("Yellow");
                Yellow.setBackground(Color.YELLOW);
                Yellow.addActionListener(this);
                southPanel1.add(Yellow);

                JButton Red= new JButton("Red");
                Red.setBackground(Color.RED);
                Red.addActionListener(this);
                southPanel1.add(Red);

                JButton Pink= new JButton("Pink");
                Pink.setBackground(Color.PINK);
                Pink.addActionListener(this);
                southPanel1.add(Pink);

                JButton Green= new JButton("Green");
                Green.setBackground(Color.GREEN);
                Green.addActionListener(this);
                southPanel1.add(Green);

                JButton Magenta= new JButton("Magenta");
                Magenta.setBackground(Color.MAGENTA);
                Magenta.addActionListener(this);
                southPanel1.add(Magenta);

                JButton Blue= new JButton("Blue");
                Blue.setBackground(Color.BLUE);
                Blue.addActionListener(this);
                southPanel1.add(Blue);

                JButton Orange= new JButton("Orange");
                Orange.setBackground(Color.ORANGE);
                Orange.addActionListener(this);
                southPanel1.add(Orange);

                //Then the one with figures
                JPanel southPanel2 = new JPanel();
                southPanel2.setLayout(new GridLayout(2,2));

                JButton ellipse= new JButton("Ellipse");
                ellipse.addActionListener(this);
                southPanel2.add(ellipse);

                JButton circle= new JButton("Circle");
                circle.addActionListener(this);
                southPanel2.add(circle);

                JButton rectangle= new JButton("Rectangle");
                rectangle.addActionListener(this);
                southPanel2.add(rectangle);

                JButton square= new JButton("Square");
                square.addActionListener(this);
                southPanel2.add(square);

                JPanel southPanel = new JPanel();
                southPanel.setLayout(new GridLayout(1,2));

                contentPanel.add(southPanel,"South");
                southPanel.add(southPanel1,"West");
                southPanel.add(southPanel2,"East");

                draw.addMouseListener(new MouseAdapter() {

                        public void mouseClicked(MouseEvent e) {
                                //draw.mouseClicked(e);
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

                //draw.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                contentPanel.add(draw);

                this.setJMenuBar(MenuBar);
                this.setVisible(true);
                //this.pack();

        }

        public void actionPerformed(ActionEvent e)
        {
                String cmd=e.getActionCommand();
                switch (cmd) {
                        case "Black" -> {

                                draw.setColor(Color.BLACK);
                                System.out.println(draw.getColor());
                        }
                        case "Yellow" -> {
                                draw.setColor(Color.YELLOW);
                                System.out.println(draw.getColor());
                        }
                        case "Red" -> {

                                draw.setColor(Color.RED);
                                System.out.println(draw.getColor());
                        }
                        case "Pink" -> {

                                draw.setColor(Color.PINK);
                        }
                        case "Green" -> {

                                draw.setColor(Color.GREEN);
                        }
                        case "Magenta" -> {

                                draw.setColor(Color.MAGENTA);
                        }
                        case "Blue" -> {

                                draw.setColor(Color.BLUE);
                        }
                        case "Orange" -> {

                                draw.setColor(Color.ORANGE);
                        }
                        case "Circle" -> {

                                draw.setCurrent_figure(new Circle());
                        }
                        case "Ellipse" -> {

                                draw.setCurrent_figure(new Ellipse());
                        }
                        case "Rectangle" -> {

                                draw.setCurrent_figure(new Rectangle());
                        }
                        case "Square" -> {

                                draw.setCurrent_figure(new Square());
                        }
                        case "Author" -> {
                                JOptionPane info = new JOptionPane();
                                JOptionPane.showInternalMessageDialog( info, "Paint Lookalike by Loïc BOUCHERY",
                                        "Information",JOptionPane.INFORMATION_MESSAGE);
                        }


                }
        }

        public static void main (String[] args){
                Window win = new Window("Paint",800,600);

        }

}