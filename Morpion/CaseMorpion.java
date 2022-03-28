import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CaseMorpion {
    public JButton Bouton;
    private Game game;
    private int x, y;
    public CaseMorpion(int x, int y, final Game Gme){
        this.x = x;
        this.y = y;
        this.game = Gme;

        this.Bouton = new JButton();



        this.Bouton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    game.Jouer(x, y);
                    Bouton.setEnabled(false);
                    if (game.getTable()[x][y] == 1) {
                        Bouton.setText("O");
                    } else {
                        Bouton.setText("X");
                    }
                }
            }
        );
    }

}
