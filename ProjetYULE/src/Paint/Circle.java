package Paint;

import java.awt.*;

public class Circle extends Ellipse{

    double pi = 3.14;
    int r;

    public Circle(int radio, Color c) {
        super(radio, radio , c); // On utilse 2 pk SemiAxisX et SemiAxisY
        this.semiAxisX = radio;
        this.semiAxisY = radio;
        this.c = c;
    }
    public Circle (int x, int y, int radio, Color c){
        super(x, y, radio, radio, c);
        this.semiAxisX = radio;
        this.semiAxisY = radio;
    }
    //==============SETS=================//
    public void setSemiAxisY(int axisY){
        if (axisY > 0){
            this.semiAxisY = axisY;
        }
    }
    public void setSemiAxisX(int AxisX){
        if (AxisX > 0){
            this.semiAxisX = AxisX;
        }
    }

    public double getSurface(Circle circle) {return pi*circle.semiAxisX*circle.semiAxisY;}
    public double getPerimetre(Circle circle) {return 2*pi*circle.semiAxisX;}

    public void setBoundingBox(int hauteurBB, int largeurBB) {}
    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(r); }
}
