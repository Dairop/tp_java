/**
 * La classe Batiment permet de gérer des Batiments
 * @author Dorian
 * @version 1.0.0
 */

public class Batiment {
    private String adresse;
    private int surfaceHabitable;


    public Batiment() {
    }

    //                                    Surface en m²
    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }


    public int Categorie(){
        if (surfaceHabitable < 30) return 1;
        else if (surfaceHabitable < 70) return 2;
        return 3;
    }

    //compare 2 batiments et renvoie le plus grand en surface
    public Batiment comparer(Batiment B2){
        if (this.surfaceHabitable>B2.surfaceHabitable) return this;
        return B2;
    }





    // transforme en string décrivant le batiment
    public String toString(){
        return "Adresse: "+getAdresse()+"   Surface habitable:"+getSurfaceHabitable();
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getSurfaceHabitable() {
        return this.surfaceHabitable;
    }

    public void setSurfaceHabitable(int surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

}
