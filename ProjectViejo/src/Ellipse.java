import java.awt.* ; // pour importer Color et Container

public class Ellipse extends Figure{
    int x;
    int y;
    int L;
    int l;
    double Pi = 3.141;

    protected int GrandAxe;
    protected int PetitAxe;

    public void setBoundingBox(int  hauteurBB,  int  largeurBB) {
        this.GrandAxe = hauteurBB;
        this.PetitAxe = largeurBB;
    }


    public Ellipse(int x, int y, int A, int a){
        super(x, y, Color.black);
        this.GrandAxe = A;
        this.PetitAxe = a;
    }
	
	/*public Ellipse(int A, int a) {
		super(0, 0);
		this.GrandAxe = A; 
		this.PetitAxe = a;
	}*/

    public Ellipse(int A, int a, Color c) {
        super(0, 0, c);
        this.GrandAxe = A;
        this.PetitAxe = a;
        this.color = c;
    }

    public Ellipse(int x, int y, int A, int a, Color c ){
        super(x, y, c);
        this.GrandAxe = A;
        this.PetitAxe = a;
    }

    public double getSurface(Ellipse ellipse) {return (ellipse.GrandAxe*ellipse.PetitAxe*Pi)/4;}

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(origine.getX(),origine.getY(), GrandAxe, PetitAxe);
        //System.out.println("Breuh " + origine.getX() );
    }

    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(GrandAxe) + Integer.toString(PetitAxe); }

    //Flemme de faire le périmètre
}