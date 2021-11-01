package Paint;

import java.awt.*;

public class Rectangle extends Figure{

    int x;
    int y;

    protected int length = 0; //lengt du rectangle
    protected int width = 0;  //width du rectangle

    //Constructor sin parametros
    ////	Rectangle(){
    ////		origine = new Point(x, y);
    /////	}

    public Rectangle (int px, int py, Color c){
        super(px, py, c);
        this.length = px;
        this.width = py;
    }
    public Rectangle (int x, int y, int m, int n, Color c){
        super(x, y, c);
        this.length = n;
        this.width = m;
    }
    //=============== SET====================/
   /* public void setLength(int l) {
        if (l > 0) {
            this.length = l;
        }
    }
    public void setWidth(int L) {
        if (L > 0) {
            this.width = L ;
        }
    }*/
    //=============GETER======================/
    /*public int getLength(Rectangle rectangle){return rectangle.length;}
    public int getWidth(Rectangle rectangle){return rectangle.width;}
    public int getPerimeter(Rectangle rectangle){return (2*(rectangle.length+ rectangle.width));}
    public int getSurface(Rectangle rectangle){return rectangle.length*rectangle.width;}*/
    public void setBoundingBox(int  heightBB,  int  widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }
    public void draw(Graphics g) {
        //System.out.println(this.color);
        g.setColor(this.c);
        g.fillRect(origine.getX(),origine.getY(), length, width);
    }
}
