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
    private int x_pressed;
    private int y_pressed;
    private int x_releassed;
    private int y_releassed;
    int x_dragged;
    int y_dragged;
    int x_real;
    int y_real;

    public Color getColor() {
        return C;
    }
    public String getNameFigure() {
        return nameFigure;
    }
    public Figure getCurrent_figure(){
        return current_figure;
    }

    public Graphics g;

    public void setColor(Color c) {
        this.C = c;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public void setCurrent_figure(Figure current_figure) {
        this.current_figure = current_figure;
    }

    public Drawing(Color color, String fig){
        super();
        C = color;
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void setName(String name){
        this.nameFigure = name;
    }


    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);
        for (Figure f : list){
            f.draw(graphics);
        }
        //graphics.drawRect(x_pressed,y_pressed,Math.abs(x_pressed-x_releassed),Math.abs(y_pressed-y_releassed));
    }

    public void mousePressed(MouseEvent e) {
        x_pressed = e.getX();
        y_pressed = e.getY();
        System.out.println(this.x_pressed+" et "+ this.y_pressed + " couleur =" + this.C);
        Color C = this.C;

        if (nameFigure.equals("Rectangle")){
            Rectangle rectangle0 = new Rectangle(x_pressed, y_pressed, x_real, y_real, C);
            this.list.add(rectangle0);
            //System.out.println(list);
        }
        if (nameFigure.equals("Ellipse")){
            Ellipse ellipse0 = new Ellipse(x_pressed, y_pressed, x_real/2, y_real/2, C);
            this.list.add(ellipse0);
            //System.out.println(list);
        }
        if (nameFigure.equals("Square")){
            Square cuadrado = new Square(x_pressed,  y_pressed, x_real, C);
            this.list.add(cuadrado);
            //System.out.println(list);
        }
        if (nameFigure.equals("Circle")){
            Circle circulo = new Circle(x_pressed, y_pressed, x_real, C);
            this.list.add(circulo);
            //System.out.println(list);
        }
    }
    public void mouseReleased(MouseEvent e) {
        this.x_releassed = e.getX();
        this.y_releassed = e.getY();
    }
    public void mouseDragged(MouseEvent e) {
        x_dragged = e.getX();
        y_dragged = e.getY();
        //System.out.println("x:"+" "+ x_dragged+" y:"+y_dragged);
        x_real = x_dragged-x_pressed;
        y_real = y_dragged-y_pressed;
        System.out.println("x:"+" "+ x_real+" y:"+y_real);
        list.get(list.size()-1).setBoundingBox(x_real, y_real);
        this.repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
}
