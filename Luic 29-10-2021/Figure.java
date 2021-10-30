import java.awt.*;

public abstract class Figure{

    protected Color color;
    protected Point origin;

    public Figure(Color c, Point x){
        this.color = c;
        this.origin = x;
    }

    public Figure(){
        this.color = Color.black;
        this.origin = new Point();
    }

    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                '}';
    }
}