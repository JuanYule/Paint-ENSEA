import java.awt.* ; // pour importer Color et Container 

public abstract class Figure implements java.io.Serializable {

    /**
     * @return perimetre de la figure
     */
    //public abstract double getPerimetre(Figure figure);
    /**
     * @return surface de la figure
     */
    //public abstract double getSurface(Figure figure);
    protected int x;
    protected int y;

    protected Color color ;
    protected Point origine;

    protected int longueur;
    protected int largeur;

    public abstract void setBoundingBox(int  heightBB,  int  widthBB);
    public abstract void draw(Graphics g);

    //Constructeur à deux paramètres
	/*public Figure(int x, int y){
		origine = new Point(x, y); 
		this.color = Color.black;
	}*/

    public Figure (Point point) {
        origine = point;
    }

    public Figure (int x, int y, Color c) {
        origine = new Point(x, y);
        this.color = c;
    }

    public Figure (Point p, Color c) {
        origine = p;
        this.color = c;
    }

    public Point get_origine(Point p) {return p;}
    public String ToString() {return Integer.toString(x) + Integer.toString(y); }
}