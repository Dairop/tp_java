/**
 * La classe Maison permet de gérer des Maisons
 * @author Dorian
 * @version 1.0.0
 */


public class Maison extends Batiment{
    private int nbPieces;
    private int surfaceJardin;


    public Maison() {
    }

    public Maison(int nbPieces, int surfaceJardin, String adresse, int surfaceHabitable) {
        super(adresse, surfaceHabitable);
        this.nbPieces = nbPieces;
        this.surfaceJardin = surfaceJardin;
    }


    public String toString(){
        return super.toString()+"  nb pieces:"+getNbPieces()+ 
        "  surface jardin:"+getSurfaceJardin();
    }


    public int getNbPieces() {
        return this.nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public int getSurfaceJardin() {
        return this.surfaceJardin;
    }

    public void setSurfaceJardin(int surfaceJardin) {
        this.surfaceJardin = surfaceJardin;
    }






}
