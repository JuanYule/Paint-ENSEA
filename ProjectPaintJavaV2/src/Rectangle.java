import java.awt.*;

class Rectangle extends Figure{
    private int Width = 0;
    private int Length = 0;

    public Rectangle (int px, int py, Color c){
        super(px, py, c);
        System.out.println("rectangle created");
    }


    @Override public void setBoundingBox(int nex, int ney){

    }

    @Override public void Draw(Graphics G){

    }

    static public void main(String[] args){
        Figure cosito = new Rectangle(2,2, Color.BLUE);

    }

}
