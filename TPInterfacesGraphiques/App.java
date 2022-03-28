import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test {
    public static void main(String[] args){
        JFrame Window = new JFrame();
        Window.setSize(800, 650);
        Window.setLocationRelativeTo(null);
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Window.setLayout(new FlowLayout());


        JLabel label = new JLabel("On peut initialiser un texte ici");
        label.setText("What is your name ?");
        Window.add(label);


        JButton OkButton = new JButton("Ok");

        JTextField TextField = new JTextField(45);
        Window.add(TextField);
        Window.add(OkButton);


        Window.repaint();


        OkButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    System.out.println(TextField.getText());
                }
            }
        );



    }
}
