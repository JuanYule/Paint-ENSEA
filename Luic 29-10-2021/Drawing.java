import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener,MouseListener {

    private Color color;
    private Figure current_figure;
    private ArrayList<Figure> list;
    private String nameFigure;
    private int x;
    private int y;

    public Drawing(){
        super();
        this.setBackground(Color.WHITE);
        this.color = Color.BLACK;
        this.nameFigure = "Rectangle";
        this.current_figure = new Rectangle();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() { return this.color; }

    public void setCurrent_figure(Figure current_figure) {
        this.current_figure = current_figure;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        System.out.println(this.x+" et "+ this.y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //new Figure();
        this.x = e.getX();
        this.y = e.getY();
        System.out.println(this.x+" et "+ this.y + " couleur =" + this.color);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int width = e.getX() - this.x;
        int length = e.getY() - this.y;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
