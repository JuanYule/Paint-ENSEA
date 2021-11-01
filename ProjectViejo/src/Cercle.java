import java.awt.* ; // pour importer Color et Container

public class Cercle extends Ellipse {
    double Pi = 3.141;
    int r;

    public void setBoundingBox(int  hauteurBB,  int  largeurBB) {
        this.r = hauteurBB;
        this.r = largeurBB ;
    }
	/*public Cercle(int x, int y, int rayon){
		super(x, y);
		if(x==y) {
			this.r = rayon;
		}
		else {
			System.out.println("Ce n'est pas un cercle");
		}
	}*/
	/*public Cercle(int x, int y, int rayon, Color c){
		super(x, y);
		if(x==y) {
			this.r = rayon;
		}
		else {
			System.out.println("Ce n'est pas un cercle");
		}
		this.color = c;
	} */
	/*public Cercle(int rayon) {
		super(0, 0);
		this.GrandAxe = rayon;
	}*/
    public Cercle(int rayon, Color c) {
        super(rayon, rayon , c);
        this.GrandAxe = rayon;
        this.PetitAxe = rayon;
        this.color = c;
    }

    public Cercle(int x, int y, int rayon, Color c) {
        super(x, y, rayon, rayon , c);
        this.GrandAxe = rayon;
        this.PetitAxe = rayon;
    }
    public double getSurface(Cercle cercle) {return cercle.GrandAxe*cercle.GrandAxe*Pi;}
    public double getPerimetre(Cercle cercle) {return cercle.GrandAxe*2*Pi;}

    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(r); }
}

