import java.awt.* ; // pour importer Color et Container
import java.io.* ;

public class Rectangle extends Figure {

    int x;
    int y;


    //Constructeur sans paramètre

    ////	Rectangle(){
    ////		origine = new Point(x, y);
    ////	}

    protected int longueur;
    /**
     * largeur du rectangle
     */
    protected int largeur;

    public void setBoundingBox(int  hauteurBB,  int  largeurBB) {
        this.longueur = hauteurBB;
        this.largeur = largeurBB;
    }

    public void draw(Graphics g) {
        //System.out.println(this.color);
        g.setColor(this.color);
        g.fillRect(origine.getX(),origine.getY(), longueur, largeur);
    }

    public Rectangle(int x, int y, int L, int l){
        super(x, y, Color.black);
        this.longueur = L;
        this.largeur = l;
    }

    public Rectangle(int x, int y, int L, int l, Color c){
        super(x, y, c);
        this.longueur = L;
        this.largeur = l;
        System.out.println("color"+this.color);
    }
	/*public Rectangle(int L, int l) {
		super(0, 0); 
		this.longueur = l; 
		this.largeur = L; 
	}*/

    public Rectangle(int L, int l, Color c) {
        super(0, 0,c);
        this.longueur = l;
        this.largeur = L;
    }
	
	
	/*Point a = new Point(largeur,0); 
	Point b = new Point(largeur, longueur); 
	//Point c = new Point (0,longueur); 
	Point d = new Point (0, 0); */

    //Pour retourner différents paramètres
    public int getLargeur(Rectangle rectangle){return rectangle.largeur;}
    public int getLongueur(Rectangle rectangle){return rectangle.longueur;}
    public double getSurface(Rectangle rectangle) {return rectangle.longueur*rectangle.largeur;}
    public double getPerimetre(Rectangle rectangle) {return 2*(rectangle.largeur+rectangle.longueur);}

    //Modifie la longueur du rectangle
    public void setLongueur(int L) {
        if (L > 0) {
            this.longueur = L ;
        }
    }


    //Modifie la largeur du rectangle
    public void setLargeur(int l) {
        if (l > 0) {
            this.largeur = l;
        }
    }


    public String affiche(Rectangle rectangle) {
        String dessin = "+";
        int i ;
        int j ;
        int k;
        int lon = rectangle.longueur ;
        int lar = rectangle.largeur ;
        for (i=1; i<lon; i++) {
            dessin += "--";
        }
        dessin+= "+";
        for (j=1; j<lar; j++) {
            if (j<lar-1) {
                dessin += "\n|";
                for(k=1; k<lon; k++) {
                    dessin += "  ";
                }
                dessin+="|";
            }
            else {
                dessin += "\n+";
                for (i=1; i<lon; i++) {
                    dessin += "--";
                }
                dessin+="+";
            }
        }
        return dessin;
    }

    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(longueur) + Integer.toString(largeur); }

}