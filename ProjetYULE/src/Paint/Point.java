package Paint;

public class Point implements java.io.Serializable{
    int X;
    int Y;

    public Point(int a, int b) {
        X=a;
        Y=b;
    }
    /**-------------------------------------
     * Construit un point de coordonnees (0, 0) */

    public Point() {};
    /**-----------------------------------*/
     /** retourne l'ordonne du point X */
    public int getX() {return X;}

    /**-------------------------------------
     * retourne l'ordonnee du point Y */
    public int getY() {return Y;}

    public String ToString() {return Integer.toString(X) + Integer.toString(Y) ; }
}
