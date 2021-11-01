package Paint;
import java.awt.*;

public abstract class Figure implements java.io.Serializable{

    static Color c;

    protected int x;
    protected int y;

    protected Point origine;

    public int length;
    public int width;

    public int semiAxisX;
    public int semiAxisY;
    //========= GETTER =============//
    public Color getC() {
        return c;
    }
    public int getSemiAxisX() {
        return semiAxisX;
    }
    public int getSemiAxisY() {
        return semiAxisY;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double getPerimeter(){return ((2*x)+2*y);}
    //------------------------------//
    /**
     * @return perimetre de la figure
     */
    ///public abstract double getPerimetre(Figure figure);
    /**
     * @return surface de la figure
     */
    //public abstract double getSurface(Figure figure);

    //public Figure(Integer R, Integer B, Integer G){
    public Figure(int X, int Y, Color Co){
        this.c = Co;
        this.x = X;
        this.y = Y;
    }
    public Figure(Point p, Color col) {
        origine = p;
        this.c =col;
    }

    //---------Abstract methodes------------------//
    //--------------------------------------------///
    public abstract void setBoundingBox(int  heightBB,  int  widthBB);
    public abstract void draw(Graphics graphics);

    public String ToString() {return Integer.toString(x) + Integer.toString(y); }
}
