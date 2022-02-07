/**
 * La classe Quartier permet de gérer des Quartiers
 * @author Dorian
 * @version 1.0.0
 */

import java.util.ArrayList;

public class Quartier {
    //taille max de 100
    private ArrayList<Batiment> Bats = new ArrayList<Batiment>();


    public Quartier() {}

    // Ajoute un batiment dans Bats
    public void ajoutBatiment(Batiment B){
        Bats.add(B);
    }

    //Afiche les batiments
    public void afficherBatiments(){
        for (Batiment batiment : Bats) {
            if (batiment == null){
                return;
            }
            System.out.println(batiment.toString()+"\n");
        }
    }

    //Renvoie le plus grand (en surfacee habitable) des batiments du quartier 
    public Batiment plusGrandBatiments(){
        Batiment B = Bats.get(0);
        for (Batiment batiment : Bats) {
            if (batiment == null){
                return B;
            }
            B = B.comparer(batiment);
        }
        return B;
    }
    


    ArrayList<Batiment> getBats() {
        return this.Bats;
    }

    public void setBats(ArrayList<Batiment> Bats) {
        this.Bats = Bats;
    }
}
