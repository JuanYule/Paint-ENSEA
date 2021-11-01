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
    private ArrayList<Figure> list = new ArrayList<Figure>();
    private int x;
    private int y;
    private int x_pressed;
    private int y_pressed;
    private int x_releassed;
    private int y_releassed;

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
    public void setName(String name){
        this.nameFigure = name;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x_pressed = e.getX();
        this.y_pressed = e.getY();
        System.out.println(this.x_pressed+" et "+ this.y_pressed + " couleur =" + this.C);

        int x_real = Math.abs(x_pressed-x_releassed);
        int y_real = Math.abs(y_pressed-y_releassed);
        if (nameFigure.equals("Rectangle")){
            Rectangle rectangle0 = new Rectangle(x_real, y_real, C);
            this.list.add(rectangle0);
            System.out.println(list);
        }
        if (nameFigure.equals("Ellipse")){
            Ellipse ellipse0 = new Ellipse(x_real/2, y_real/2, C);
            this.list.add(ellipse0);
            System.out.println(list);
        }
        if (nameFigure.equals("Square")){
            Square cuadrado = new Square();
            this.list.add(cuadrado);
            System.out.println(list);
        }
        if (nameFigure.equals("Circle")){
            Circle circulo = new Circle();
            this.list.add(circulo);
            System.out.println(list);
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        this.x_releassed = e.getX();
        this.y_releassed = e.getY();
    }
    @Override
    public void mouseDragged(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
}
