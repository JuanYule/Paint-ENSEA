import java.awt.*;

abstract class Figure {

    static Color C;

    public int semiAxisX;
    public int semiAxisY;

    public int width;
    public int length;

    public int X;
    public int Y;


    //========= GETTER =============//
    public Color getC() {
        return C;
    }
    public int getSemiAxisX() {
        return semiAxisX;
    }
    public int getSemiAxisY() {
        return semiAxisY;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }

//=============================================//



    //public Figure(Integer R, Integer B, Integer G){
    public Figure(int X, int Y, Color Coco){
        this.C = Coco;
        this.X = X;
        this.Y = Y;
        System.out.println("rectangle created");
    }


    public void setBoundingBox(){
        this.width = 0;
        this.length = 0;
    }



    //==================ABSTRACT METHODS===================//

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void Draw(Graphics g);


    static public void main(String[] args){
    }
}
