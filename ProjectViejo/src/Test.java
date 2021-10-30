class Test {
    public static void main(String [] args) {
        // créer un nouvel objet, une nouvelle instance

        //Question 3
		/*int X = 3;
		int Y = 2;
		int X0 = 0;
		int Y0 = 0 ;
		Point monPoint = new Point(X, Y);
		Point monOrigine = new Point(X0, Y0);
		System.out.println("abscisse de monPoint =" + monPoint.getX(X));
		System.out.println("ordonée de monPoint =" + monPoint.getY(Y));
		System.out.println("abscisse de monOrigine =" + monOrigine.getX(X0));
		System.out.println("ordonée de monOrigine =" + monOrigine.getY(Y0));*/
        /* pour le "print", ne pas oublier qu'on concatène avec un "+" !! */

        //Question 4
        System.out.println("On veut voir les coordonnées d'un rectangla abcd, tq d soit confondu avec l'origine");
		/*Rectangle monRectangle = new Rectangle(0, 0, 5, 10);
		monRectangle.largeur= 5;
		monRectangle.longueur = 10;   /*on se sert de ces deux lignes dans la première partie*/


        //Question 5 et 6
		/*System.out.println("La largeur de monRectangle =" + monRectangle.getLargeur(monRectangle));
		System.out.println("La longueur de monRectangle = " + monRectangle.getLongueur(monRectangle));
		System.out.println("L'origine de monRectangle = " + monRectangle.get_origine(monOrigine)); */

        //Question 7
		/*System.out.println("Le perimetre de monRectangle =" + monRectangle.getPerimetre(monRectangle));
		System.out.println("La surface de monRectangle =" + monRectangle.getSurface(monRectangle));

		monRectangle.setLargeur(6);
		monRectangle.setLongueur(7);

		System.out.println("Finalement, la largeur de monRectangle =" + monRectangle.getLargeur(monRectangle));
		System.out.println("Finalement, la longueur de monRectangle = " + monRectangle.getLongueur(monRectangle)); */


        //Question 8
		/*Rectangle r1 = new Rectangle(0, 0, 10, 3) ;
		System.out.println("La largeur de r1 =" + r1.getLargeur(r1)); //Vérification code
		System.out.println(r1.affiche(r1));
		System.out.println(r1);*/


        /** Partie 2
         *
         */

        //Question 4
        /*Rectangle n'est pas définie*/


        //Question 6
        /* La console affiche la classe de l'objet ainsi que son adresse */

        //Question 11
		/*Carre petit_c = new Carre(0, 0, 5, 5);
		System.out.println("Le cote de mon carre vaut =" + petit_c.getLargeur(petit_c));
		System.out.println(petit_c.affiche(petit_c));
		petit_c.setLongueur(10);
		System.out.println("Le cote de mon carre vaut =" + petit_c.getLargeur(petit_c));
		System.out.println(petit_c.affiche(petit_c));*/
        /*Le carré est le même, c'est très bizarre*/

        //Question 12
        /*On cherche à corriger l'erreur vue précédemment, pour cela, on redéfinit setLongueur et setLargeur*/
		/*petit_c.cote(3);
		System.out.println("Le cote de mon carre vaut =" + petit_c.getLargeur(petit_c));
		System.out.println(petit_c.affiche(petit_c));*/

        /** Partie 2
         *
         */

        //Question 1
        /*Rectangle r1 = new Carre(8);
         * La classe Carre hérite de la classe Rectangle mais pas l'inverse !
         */

        /*Rectangle r2 = new Cercle(8);
         * Ca ne marche pas car la classe Cercle n'hérite pas de la classe Rectangle
         */


        //Question 2
        /*Carre r2 = new Rectangle(2,8);
         * ça ne marche pas car il faut que L=l.
         */

        //Question 3
        /*Rectangle r1_bis = new Carre(8);
         * Carre r2 = r1_bis;
         * Je comprends pas ce qu'il se passe
         * Carre r2 = (Carre) r1 ;
         */


        //Question 4
		/*Figure[] tf = new Figure[4];
				tf[0] = new Ellipse(12,4);
				tf[1] = new Rectangle(8,3);
				tf[2] = new Carre(4);
				tf[3] = new Cercle(4);*/

        //Question 5

		/*Rectangle Alex = (Rectangle) tf[1];

		System.out.println("Le perimetre de Alex  =" + Alex.getPerimetre(Alex));
		System.out.println("La surface de Alex =" + Alex.getSurface(Alex));

		Rectangle prout = (Rectangle) tf[2];
		System.out.println("Le perimetre de prout  =" + prout.getPerimetre(prout));
		System.out.println("La surface de prout =" + prout.getSurface(prout));
		System.out.println("La largeur de prout =" + prout.getLargeur(prout));
		System.out.println("La longueur de prout = " + prout.getLongueur(prout));

		Cercle nutella = (Cercle) tf[3];
		System.out.println("La surface de nutella =" + nutella.getSurface(nutella)); */

		/*Fenetre win = new Fenetre("Marc est un rageux et Popo est grosse", 200, 100, true, 8, 10);
		 * win.setVisible(true);
		win.setSize(50, 50); //une fenêtre est créée. On ne s'y attendait pas du tout
		 */

    }
}
