package Paint;

public class Point implements java.io.Serializable{
    int X;
    int Y;

    public Point(int a, int b) {
        X=a;
        Y=b;
    }

    public Point() {};

    public int getX() {return X;}

    public int getY() {return Y;}

    public String ToString() {return Integer.toString(X) + Integer.toString(Y) ; }
}
