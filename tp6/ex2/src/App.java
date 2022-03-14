import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Forme[] Formes = new Forme[5];

        Formes[0] = new Rectangle(3, 2, 5, 6);
        Formes[1] = new Cercle(3, 0, 5);
        Formes[2] = new Cercle(3, 3, 6);
        Formes[3] = new Rectangle(3, 1, 4, 2);
        Formes[4] = new Rectangle(-1, 0, 4, 3);

        Forme.afficher(Formes);
    }
}
