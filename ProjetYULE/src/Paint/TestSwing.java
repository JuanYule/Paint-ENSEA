package Paint;

public class TestSwing {

    protected Drawing draw = new Drawing();

    public static void main(String[] args) {
        //Verifica la creación del punto//
        /*On a crée 2 points
        Point P1 = new Point(3,4);
        Point P2 = new Point(8,5);
        System.out.println("l'ordonne de X: " + P1.getX());
        System.out.println("l'ordonne de Y: " + P1.getY());
        System.out.println("l'ordonne de X2: " + P2.getX());
        System.out.println("l'ordonne de Y2: " + P2.getY());

        Rectangle Rect1 = new Rectangle(3,6, Color.LIGHT_GRAY);
        System.out.println("X: " + Rect1.getX() + "||Y: " + Rect1.getY() + "||Color: " + Rect1.getC());
        Ellipse Ellip1 = new Ellipse(7,4, Color.BLUE);
        System.out.println("X: " + Ellip1.getX() + "||Y: " + Ellip1.getY() + "||Color: " + Ellip1.getC());
        System.out.println(Rect1.getPerimeter());

        //Change de Lenght et Width du rectangle et Ellipse
        Rect1.setLength(8);
        Rect1.setWidth(10);
        System.out.println("Length: "+Rect1.getLength(Rect1));/
        System.out.println("Width: "+Rect1.getWidth(Rect1));
        System.out.println("Perimeter :" + Rect1.getPerimeter(Rect1)); //Verification du périmètre
        System.out.println("Surface :" + Rect1.getSurface(Rect1));  //Verification de la surface du rectangle
        //===============================//
        //Vérification des valeurs de Ellipse
        Ellip1.setSemiAxisX(10);
        Ellip1.setSemiAxisY(2);
        System.out.println("SemiAxesX: " + Ellip1.getSemiAxisX(Ellip1));
        System.out.println("SemiAxesY: " + Ellip1.getSemiAxisY(Ellip1));
        System.out.println("Perimeter : " + Ellip1.getPerimeter(Ellip1));
        //===============================//
        //Vérification des valeurs de Square
        Square  square1 = new Square(10, Color.ORANGE);
        System.out.println("L Square :" + square1.getX());
        //===============================//
        */
        //=====Creation window===========//
        Window win = new Window("Paint by YULE", 800, 600);
    }
}
