public class Point implements java.io.Serializable{
    int X;
    int Y;

    public String ToString() {return Integer.toString(X) + Integer.toString(Y) ; }

    /**
     * Construit un point de coordonnees (a, b)
     *
     * @param a abscisse du point
     * @param b ordonnée du point
     */
    public Point(int a, int b) {
        X=a;
        Y=b;
    }
    /**
     * Construit un point de coordonnees (0, 0)
     */
    public Point() {};
    /**
     * retourne l'abscisse du point
     */
    public int getX() {return X;}

    /** * Devuelve el orden del punto */
    public int getY() {return Y;}
}