import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {

        JFrame Window = new JFrame();
        Window.setSize(800, 650);
        Window.setLocationRelativeTo(null);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Window.setLayout(new GridLayout(3, 3));

        Game Morpion = new Game();


        CaseMorpion A1 = new CaseMorpion(0, 0, Morpion);
        CaseMorpion A2 = new CaseMorpion(1, 0, Morpion);
        CaseMorpion A3 = new CaseMorpion(2, 0, Morpion);
        CaseMorpion B1 = new CaseMorpion(0, 1, Morpion);
        CaseMorpion B2 = new CaseMorpion(1, 1, Morpion);
        CaseMorpion B3 = new CaseMorpion(2, 1, Morpion);
        CaseMorpion C1 = new CaseMorpion(0, 2, Morpion);
        CaseMorpion C2 = new CaseMorpion(1, 2, Morpion);
        CaseMorpion C3 = new CaseMorpion(2, 2, Morpion);

        Window.add(A1.Bouton);  Window.add(A2.Bouton);  Window.add(A3.Bouton);
        Window.add(B1.Bouton);  Window.add(B2.Bouton);  Window.add(B3.Bouton);
        Window.add(C1.Bouton);  Window.add(C2.Bouton);  Window.add(C3.Bouton);

        Window.setVisible(true);
        Window.repaint();
    }
}
