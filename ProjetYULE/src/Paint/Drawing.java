package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener ,MouseMotionListener {

    private Color C;
    private String nameFigure;
    private Figure current_figure;
    private ArrayList<Figure> List = new ArrayList<Figure>();
    private int x;
    private int y;

    public Color getColor() {
        return C;
    }
    public String getNameFigure() {
        return nameFigure;
    }
    public Figure getCurrent_figure(){
        return current_figure;
    }

    public void setColor(Color c) {
        this.C = c;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public void setCurrent_figure(Figure current_figure) {
        this.current_figure = current_figure;
    }

    public Drawing(){
        super();
        this.setBackground(Color.WHITE);
        this.C = Color.BLACK;
        this.nameFigure = "Rectangle";
        this.current_figure = new Rectangle();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        System.out.println(e);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        System.out.println(this.x+" et "+ this.y + " couleur =" + this.C);
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}
}
