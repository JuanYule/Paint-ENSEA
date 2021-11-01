import javax.swing.*;
import java.awt.* ; // pour importer Color et Container
import java.awt.event.*;
import java.util.*;

public class Dessin extends JPanel implements MouseListener, MouseMotionListener {
    //private ArrayList<Figure> liste;
    private ArrayList<Figure> liste = new ArrayList<Figure>();
    private Color c;
    private String nomFigure;
    private int x;
    private int y;

    public ArrayList<Figure> getListe() {
        return liste;
    }

    public void mouseClicked(MouseEvent e) {}

    int Pressedy;
    int Pressedx;
    int dist_x;
    int dist_y;


    public Graphics g;

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        dist_x = x - Pressedx ;
        dist_y = y - Pressedy ;
        liste.get(liste.size()-1).setBoundingBox(dist_x, dist_y);
        this.repaint();
    }
    public void mouseMoved(MouseEvent e) {
        //System.out.println("J'ai bougé, je suis une thug");
    }
    public void mouseExited(MouseEvent e) {}
    public void mouseCliked(MouseEvent e) {
        System.out.println("J'ai appuyé, je suis une thug");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("J'ai relaché, car je suis faible");
    }
    public void mouseEntered(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        Pressedx = e.getX();
        Pressedy = e.getY();
		/*dist_x = 0;
		dist_y = 0; */
        Color c = this.c;
        System.out.println("L'abscisse est : "+ x + " et l'ordonnée est : " + y);
        if(nomFigure.equals("Haha")) {
            Rectangle rect0 = new Rectangle(Pressedx, Pressedy, dist_x, dist_y, c);
            this.liste.add(rect0);
            //System.out.println("la longueur de rect0 est "+ rect0.longueur);
            //System.out.print("La liste est :" + liste);
        }

        if(nomFigure.equals("Hihi")) {
            Carre square0 =new Carre(Pressedx, Pressedy, dist_x, c);
            this.liste.add(square0);
            //System.out.print("La liste est :" + liste);
        }

        if(nomFigure.equals("Hoho")) {
            Cercle circle =new Cercle(Pressedx, Pressedy, dist_x, c);
            this.liste.add(circle);
            //System.out.print("La liste est :" + liste);
        }

        if(nomFigure.equals("Ah des barres")) {
            Ellipse ellipse= new Ellipse(Pressedx, Pressedy, dist_x, dist_y, c);
            this.liste.add(ellipse);
            System.out.println("la longueur du petit axe de ellipse est "+ellipse.PetitAxe);
            //System.out.print("La liste est :" + liste);
        }

    }

    public void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        this.setBackground(Color.white);
        graph.setColor(Color.pink); //on choisit la couleur qu'on veut et c'est très marrant
        graph.drawString("Rage pas Cyril, et va acheter des bonbons <3", 100, 100);
        //System.out.println(nomFigure);
        for(Figure f : liste){
            f.draw(graph); //on renvoie ici le polymorphisme dynamique
        }
    }

    public void setColor(Color color) {
        this.c = color;
    }

    public void setNomFigure(String maFigure) {
        this.nomFigure = maFigure ;
    }

    public Dessin(Color color, String fig) {
        super();
        c = color;
        addMouseListener(this);
        addMouseMotionListener(this);
        setNomFigure(fig) ;
    }
}