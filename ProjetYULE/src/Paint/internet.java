package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mousedrag extends JFrame implements  MouseListener,MouseMotionListener
{
    //
    int x,y,x1,y1;
    mousedrag()
    {
        addMouseListener(this);
        addMouseMotionListener(this);

    }
    public void mouseEntered(MouseEvent me) {

    }
    public void mousePressed(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();

    }
    public void mouseClicked(MouseEvent me) {

    }
    public void mouseReleased(MouseEvent me) {

    }
    public void mouseMoved(MouseEvent me) {

    }
    public void mouseDragged(MouseEvent me)
    {
        x1=me.getX();
        y1=me.getY();
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {

    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(x,y,Math.abs(x-x1),Math.abs(y-y1));
    }

    public static void main(String args[])
    {
        mousedrag f=new mousedrag();
        f.setTitle("demo of mouse event");
        f.setSize(400,400);
        f.setVisible(true);
    }
}