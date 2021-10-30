import javax.swing.*;
import java.awt.* ; // pour importer Color et Container
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;


public class Fenetre extends JFrame implements ActionListener{
    /*Si on ne met pas la ligne suivante, il y a une erreur car il faut redéfinir les méthodes dont hérite
     * fenêtre de ActionListener.
     * */
    protected Color myColor;
    protected String maFigure;
    private Dessin CarcaQuiDessineBourre ;
    protected ArrayList<Figure> liste_bis ;

    public void saveFile() {
        FileOutputStream file;
        ObjectOutputStream out;
        try {
            file = new FileOutputStream("Dessin.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(this.CarcaQuiDessineBourre);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void openFile() {
        FileInputStream file_in;
        ObjectInputStream in ;
        Container contentPane = getContentPane();
        contentPane.remove(this.CarcaQuiDessineBourre);
        try {
            file_in = new FileInputStream("Dessin.txt");
            in = new ObjectInputStream(file_in);
            this.CarcaQuiDessineBourre = (Dessin) in.readObject();
            contentPane.add(this.CarcaQuiDessineBourre);
            contentPane.revalidate();
            contentPane.repaint();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void actionPerformed (ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Popo")) {
            System.out.println("Roh, du saucisson !");
            myColor = Color.red;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Carca")) {
            System.out.println("La technique de la pince");
            myColor = Color.yellow;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Cyril")) {
            System.out.println("Je sais pas faire des pompes");
            myColor = Color.white;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Alex")) {
            System.out.println("T'es virée");
            myColor = Color.magenta;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Marco")) {
            System.out.println("Je rage au moins quatre fois par jour");
            myColor = Color.gray;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Logan")) {
            System.out.println("Je suis un apple addict");
            myColor = Color.green;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Pattes")) {
            System.out.println("Awé ?");
            myColor = Color.pink;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Tutur")) {
            System.out.println("Habile");
            myColor = Color.blue;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("JS")) {
            System.out.println("GOT");
            myColor = Color.black;
            this.CarcaQuiDessineBourre.setColor(myColor);
        }
        else if(cmd.equals("Paul out")) {
            System.out.println("J'ai un mac, pas toi grosse merde");
            myColor = Color.cyan;
            this.CarcaQuiDessineBourre.setColor(myColor);

        }
        else if(cmd.equals("Haha")) {
            System.out.println("T'es marrant");
            maFigure = "Haha";
            this.CarcaQuiDessineBourre.setNomFigure(maFigure);
        }
        else if(cmd.equals("Hihi")) {
            System.out.println("Qu'est-ce qu'on s'amuse");
            maFigure = "Hihi";
            this.CarcaQuiDessineBourre.setNomFigure(maFigure);
        }
        else if(cmd.equals("Hoho")) {
            System.out.println("Qu'est ce qu'on rigole");
            maFigure = "Hoho" ;
            this.CarcaQuiDessineBourre.setNomFigure(maFigure);
        }
        else if(cmd.equals("Ah des barres")) {
            System.out.println("Ben non pas des barres");
            maFigure = "Ah des barres";
            this.CarcaQuiDessineBourre.setNomFigure(maFigure);
        }
        else if(cmd.equals("On déroule ?")) {
            System.out.println("Ah t'es trop nulle");
        }
        else if(cmd.equals("Banque")) {
            System.out.println("Ah oui, je suis la banque");
        }
        else if(cmd.equals("Avance le RU stp")) {
            System.out.println("Je suis vraiment la banque");
        }
        else if(cmd.equals("T'as la prepa de TP ?")) {
            System.out.println("Ouais je te donne dans le drive");
        }
        else if(cmd.equals("C'est quand la cremaillere ?")) {
            System.out.println("Euh, attends c'est repoussé !");
        }
        else if(cmd.equals("On fait un roulé au nutella ?")) {
            System.out.println("Ah ouais quand tu veux, dimanche par exemple");
        }
        else if(cmd.equals("new")) {
            liste_bis = this.CarcaQuiDessineBourre.getListe();
            liste_bis = new ArrayList<Figure>();
            this.CarcaQuiDessineBourre.repaint();
        }
        else if(cmd.equals("On fait before chez Alex ?")) {
            System.out.println("Venez quand vous voulez");
        }
        else if(cmd.equals("Il est beau ton jogging !")) {
            System.out.println("Non il est dégueu");
        }
        else if(cmd.equals("Clique ici Cyril")) {
            JOptionPane.showMessageDialog(null, "TG Cyril, t'es nul en info", "Cyril la pute", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmd.equals("Save")) {
            saveFile();
        }
        else if(cmd.equals("Open")) {
            openFile();
        }
		/*else if(cmd.equals("Importer/Exporter")) {
			openFile();
		}*/
        else{
            System.err.println(cmd);
        }
    }




    public Fenetre(String titre, int length, int width, boolean b, int loc1, int loc2) {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(length, width);
        setLocation(loc1, loc2);
        setVisible(b);
    }

    public Fenetre(String titre){
        super(titre);
        System.out.println("On a faim");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,200);
        setSize(500,250);
        // conteneur contient un BorderLayout remplace
        //setLayout(new BorderLayout());
        Container contentPane = getContentPane() ;

        /*Pour les panels */
        JPanel TJS = new JPanel();
        TJS.setLayout(new GridLayout(2,6));
        JButton JS = new JButton("JS");
        JS.setBackground(Color.black);
        JS.addActionListener(this);
        TJS.add(JS);
        JButton Popo = new JButton("Popo");
        Popo.setBackground(Color.red);
        Popo.addActionListener(this);
        TJS.add(Popo);
        JButton Carca = new JButton("Carca");
        Carca.setBackground(Color.yellow);
        Carca.addActionListener(this);
        TJS.add(Carca);
        JButton Cyril = new JButton("Cyril");
        Cyril.setBackground(Color.white);
        Cyril.addActionListener(this);
        TJS.add(Cyril);
        JButton Alex = new JButton("Alex");
        Alex.setBackground(Color.magenta);
        Alex.addActionListener(this);
        TJS.add(Alex);
        JButton Logan = new JButton("Logan");
        Logan.setBackground(Color.green);
        Logan.addActionListener(this);
        TJS.add(Logan);
        JButton Pattes = new JButton("Pattes");
        Pattes.setBackground(Color.pink);
        Pattes.addActionListener(this);
        TJS.add(Pattes);
        JButton Tutur = new JButton("Tutur");
        Tutur.setBackground(Color.blue);
        Tutur.addActionListener(this);
        TJS.add(Tutur);
        JButton Marco = new JButton("Marco");
        Marco.setBackground(Color.gray);
        Marco.addActionListener(this);
        TJS.add(Marco);
        JButton Paul_out = new JButton("Paul out");
        Paul_out.setBackground(Color.cyan);
        Paul_out.addActionListener(this);
        TJS.add(Paul_out);

        JPanel Cmarrant = new JPanel();
        Cmarrant.setLayout(new GridLayout(2,2));
        JButton Haha = new JButton("Haha");
        Haha.addActionListener(this);
        Cmarrant.add(Haha);
        JButton Hihi = new JButton("Hihi");
        Hihi.addActionListener(this);
        Cmarrant.add(Hihi);
        JButton Hoho = new JButton("Hoho");
        Hoho.addActionListener(this);
        Cmarrant.add(Hoho);
        JButton Bouton_relou = new JButton("Ah des barres");
        Bouton_relou.addActionListener(this);
        Cmarrant.add(Bouton_relou);

        this.maFigure = "";

        this.CarcaQuiDessineBourre = new Dessin(Color.black, maFigure);
        contentPane.add(this.CarcaQuiDessineBourre, "Center");
        //contentPane.add(new JTextArea("T'es virée"),"Center");



        JPanel ATable = new JPanel();
        ATable.setLayout(new GridLayout(1, 2));
        ATable.add(TJS);
        ATable.add(Cmarrant);
        contentPane.add(ATable, "South");

        /* Pour les menus*/
        JMenuBar m= new JMenuBar();
        JMenu menu1=new JMenu("Cyril");
        JMenuItem un = new JMenuItem("Banque") ;
        un.addActionListener(this);
        menu1.add(un);
        //raccourci
        un.setAccelerator(KeyStroke.getKeyStroke('U',
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
        //separe dun trait
        menu1.addSeparator();
        JMenuItem deux = new JMenuItem("Avance le RU stp") ;
        deux.addActionListener(this);
        menu1.add(deux);
        menu1.addSeparator();
        JMenuItem trois = new JMenuItem("T'as la prepa de TP ?") ;
        trois.addActionListener(this);
        menu1.add(trois);
        menu1.addSeparator();
        JMenuItem quatre = new JMenuItem("C'est quand la cremaillere ?") ;
        quatre.addActionListener(this);
        menu1.add(quatre);
        menu1.addSeparator();
        JMenuItem cinq = new JMenuItem("On fait un roulé au nutella ?") ;
        cinq.addActionListener(this);
        menu1.add(cinq);
        menu1.addSeparator();
        JMenuItem six = new JMenuItem("On déroule ?") ;
        six.addActionListener(this);
        menu1.add(six);
        menu1.addSeparator();
        JMenuItem sixb = new JMenuItem("new") ;
        sixb.addActionListener(this);
        menu1.add(sixb);
        m.add(menu1);
        JMenu menu2 = new JMenu("Alex");
        JMenuItem sept = new JMenuItem("On fait before chez Alex ?") ;
        sept.addActionListener(this);
        menu2.add(sept);
        menu2.addSeparator();
        JMenuItem huit = new JMenuItem("Il est beau ton jogging !") ;
        huit.addActionListener(this);
        menu2.add(huit);
        menu2.addSeparator();
        JMenuItem huit_bis = new JMenuItem("Clique ici Cyril") ;
        huit_bis.addActionListener(this);
        menu2.add(huit_bis);
        m.add(menu2);
        JMenu menu3 = new JMenu("Menu");
        JMenuItem neuf = new JMenuItem("Save");
        neuf.addActionListener(this);
        menu3.add(neuf);
        menu3.addSeparator();
        JMenuItem dix = new JMenuItem("Open");
        dix.addActionListener(this);
        menu3.add(dix);
		/*menu3.addSeparator();
		JMenuItem onze = new JMenuItem("Importer/Exporter");
		onze.addActionListener(this);
		menu3.add(onze);*/
        m.add(menu3);
        setJMenuBar(m);

        setVisible(true);
    }
}

