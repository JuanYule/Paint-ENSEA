package Paint;

import java.awt.*;

public class Ellipse extends Figure{

    int x;
    int y;
    double pi = 3.14;

    protected int semiAxisX = 0; //
    protected int semiAxisY = 0;  //

    //Created Ellipse
    public Ellipse (int px, int py, Color c){
        super(px, py, c);
    }

    public Ellipse (int px, int py, int r, Color C){
        super(px, py, C);

    }

    public Ellipse() {

    }


    public void setSemiAxisX(int axisX){
        if (axisX > 0){
            this.semiAxisX = axisX;
        }
    }
    public void setSemiAxisY(int axisY){
        if (axisY > 0){
            this.semiAxisY = axisY;
        }
    }

    //=========SET=============//
    public double getSurface(Ellipse ellipse){return pi*ellipse.semiAxisY*ellipse.semiAxisX;}
    public int getSemiAxisX(Ellipse ellipse){return ellipse.semiAxisX;}
    public int getSemiAxisY(Ellipse ellipse){return ellipse.semiAxisY;}
    public double getPerimeter(Ellipse ellipse){return Math.round(2*pi*(Math.sqrt((Math.pow(ellipse.semiAxisX, 2)+Math.pow(ellipse.semiAxisY, 2))/2)));}

    public void setBoundingBox(int  hauteurBB,  int  largeurBB) {
        this.semiAxisX = hauteurBB;
        this.semiAxisY = largeurBB;
    }

    public void draw(Graphics g) {
        //System.out.println(this.color);
        g.setColor(this.c);
        g.fillRect(origine.getX(),origine.getY(), semiAxisX, semiAxisY);
    }
    public String ToString() {return Integer.toString(x) + Integer.toString(y); }
}