import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Drawing extends JPanel {

    private Color C;
    private String nameFigure;
    ArrayList<Figure> List = new ArrayList<Figure>();

    public Color getC() {
        return C;
    }
    public String getNameFigure() {
        return nameFigure;
    }

    public void setC(Color c) {
        C = c;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public Drawing(){
        this.setBackground(Color.white);

    }




}
