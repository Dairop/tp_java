//Tableau
public class Quartier {

	Batiment[] TabBatiment;

	public Quartier() {
		TabBatiment = new Batiment[100];
	}
	
	void ajoutBatiment(Batiment b){
			
		for (int i = 0; i < TabBatiment.length; i++) {
			if(TabBatiment[i]==null){
				TabBatiment[i]=b;
				break;
			}
		}
	}
}




//Arraylist
import java.util.ArrayList; // import the ArrayList class

public class Main{
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
}





// classe abstraite: contient au moins une méthode abstraite
//On définit cette méthode dans les classes filles
//
//Exemple:
abstract class Vehicule{
	String nom;
	String marque;
	
	public Vehicule(String nom, String marque) {
		this.nom = nom;
		this.marque = marque;
	}
	
	public abstract void demarrer();
	public void avancer() {
		// ...
	};
}


//On l'appelle de la manière suivante
class Voiture extends Vehicule{
	//...
	public void activerAirbag() { 
		//...
	}
	
	@Override
	public void demarrer() {
		//...
	}
}





//interface: comme une classe abstraite mais contient uniquement des méthodes abstraites
//On a pas besoin de préciser que la méthode est abstraite
//C'est un package de méthodes qu'une classe devra ensuite définir
//
//Exemple:
interface ActionVehicule{
	public void freiner();
	public void passerVitesse();
}

//On l'appelle de la manière suivante
class Voiture extends Vehicule implements ActionVehicule {
	@Override
	public void freiner() {
		// ...
	}
	
	@Override
	public void passerVitesse() {
		// ...
	}
	//...
}





//Exceptions
//si on peut renvoyer une exception dans une méthode, on lui rajoute throws *le type d'exception*
//
//Exemple:

//On définit la classe OperationException 
class OperationException extends Exception {
	
	public OperationException() {
		super();
	}
	public OperationException(String message) {
		super(message);
	}
	
}

//on peut maintenant renvoyer ce type d'exceptions

public class Calculatrice {
	//...
	
	public String saisieOperation() throws OperationException{

		//...
		if(test) {
			throw new OperationException("L'operation n'est pas valide");
		}

		return "end";
	}	
}




//Lire et écrire dans des fichiers 
//Exemple en csv: https://github.com/Dairop/tp_java/blob/main/tp7/src/IORegionTexte.java




//different types de champs dans un interface graphique
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





//
// Tri rapide avec des threads
//
public class TriRapide extends Thread {

    ArrayList<Integer> T;
    Integer first;
    Integer last;


    public TriRapide(ArrayList<Integer> T, Integer first, Integer last){
        this.T = T; this.first = first; this.last = last;
    }

    public synchronized void echanger(Integer a, Integer b){
        //echanger a et b
        /*
            a = a+b
            b = a-b
            a = a-b
        */
        Integer c = T.get(a);
        T.set(a, T.get(b));
        T.set(b, c);
    }


    public Integer partitionner(){
        Integer j = first;
        for (Integer i = first; i<=last; i++){
            if (T.get(i) <= T.get(last)){
                echanger(i, j);

                j++;
            }
        }
        echanger(last, j);

        return j;
    }
    
    public void run(){
        if (first < last){
            Integer pivot = partitionner();
            TriRapide Tri1 = new TriRapide(T, first, pivot-1);
            TriRapide Tri2 = new TriRapide(T, pivot+1, last);
            Tri1.start();
            Tri2.start();

            try {
                Tri1.join(); Tri2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}




	
	
//Comparateur
//
//exemple: trier des "Players" en fonction de leur score


class Checker implements Comparator<Player>{

	
	// retourne une valeur négative si x < y
	// retourne 0 si x == y
	retourne une valeur positive si x > y
	public int compare(Player a, Player b){
		if (a.score == b.score{
			//compare using their name ...
			return /* value */;
		}
		return a.score - b.score;
	}
}










