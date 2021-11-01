import java.awt.* ; // pour importer Color et Container

public class Carre extends Rectangle {
    int x;
    int y;
    int L;
    int l;
    int cot ;

    public void setBoundingBox(int  hauteurBB,  int  largeurBB) {
        this.cot = hauteurBB;
        this.largeur = largeurBB;
        this.longueur = largeurBB;
    }
	/*public Carre(int x, int y, int L, int l){
		super(x, y, L, l);
		if (L==l) {
			this.largeur = L;
			this.longueur = l;
			}
		else {
				System.out.println("ce n'est pas un carré");
			}
	}*/
    public Carre(int L, Color ccc){
        super(L, L, ccc);
        this.largeur = L;
        this.longueur = L;
    }
    public Carre(int x, int y, int L, Color ccc) {
        super (x, y, L, L, ccc);
        this.largeur = L;
        this.longueur = L;
    }
	/*public Carre(int x, int y, int L, int l, Color col){
		super(x, y, L, l);
		if (L==l) {
		this.largeur = L;
		this.longueur = l;
		this.color = col;
		}
		else {
			System.out.println("ce n'est pas un carré");
		}
	} */
	/*public Carre(int cote) {
		super(0, 0);
		this.cot = cote;
	} */
	/*public Carre(int cote, Color col) {
		super(0);
		this.largeur = cote;
		this.longueur = cote;
		this.color = col;
	}*/
    Point a = new Point(largeur,0);
    Point b = new Point(largeur, largeur);
    Point c = new Point (0,largeur);
    Point d = new Point (0, 0);

    //Pour retourner différents paramètres
    public int getCote(Carre carre) {return carre.largeur;}
    public int getSurface(Carre carre) {return carre.largeur*carre.largeur;}
    public int getPerimetre(Carre carre) {return 4*carre.largeur;}

    //Modifie le cote du carré
    public void cote(int cc) {
        if (cc > 0) {
            this.largeur = cc ;
            this.longueur = cc;
        }
    }
    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(L); }
}
