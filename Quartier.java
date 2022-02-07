/**
 * La classe Quartier permet de gérer des Quartier
 * @author Dorian
 * @version 1.0.0
 */

public class Quartier {
    //taille max de 100
    private Batiment[] Bats = new Batiment[100];


    public Quartier() {}

    // Ajoute un batiment dans Bats
    public void ajoutBatiment(Batiment B){
        for (int i = 0; i < Bats.length; i++){
            if (Bats[i] == null){
                Bats[i] = B;
                return;
            }
        }
        System.out.println("Oops, the memory is full! \n");
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
        Batiment B = Bats[0];
        for (Batiment batiment : Bats) {
            if (batiment == null){
                return B;
            }
            B = B.comparer(batiment);
        }
        return B;
    }
    



    public Batiment[] getBats() {
        return this.Bats;
    }

    public void setBats(Batiment[] Bats) {
        this.Bats = Bats;
    }
}
