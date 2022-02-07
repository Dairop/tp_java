/**
 * La classe Immeuble permet de gérer des Immeubles
 * @author Dorian
 * @version 1.0.0
 */

public class Immeuble extends Batiment{
    private int nbApparts;


    public Immeuble() {
    }

    public Immeuble(int nbApparts, String adresse, int surfaceHabitable) {
        super(adresse, surfaceHabitable);
        this.nbApparts = nbApparts;
    }


    public String toString(){
        return super.toString()+"   Nb d'apparts:"+getNbApparts();
    }


    public int getNbApparts() {
        return this.nbApparts;
    }

    public void setNbApparts(int nbApparts) {
        this.nbApparts = nbApparts;
    }
}
