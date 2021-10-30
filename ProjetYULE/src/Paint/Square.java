package Paint;
import java.awt.*;

public class Square extends Rectangle{

    public Square(int L, Color c) {
        super(L, L, c);
        this.length = L;
        this.width = L;
    }

    public Square() {

    }


    //======SETS===========//
    public void setLength(int lengthSquare){
        if (lengthSquare > 0){
            this.length = lengthSquare;
        }
    }
    public void setWidth(int widthSquare){
        if (widthSquare > 0){
            this.width = widthSquare;
        }
    }

    public void setBoundingBox(int  length,  int  width) {
        this.length = length;
        this.width = width;
    }

}
