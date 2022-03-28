

public class Region implements Comparable{
    private String nom;
    private int population;
    private int pib;
    private int nbrCommunes;
    private int superficie;

    public Region(String nom, int pop, int pib, int nCom, int sup){
        this.nom = nom;
        this.population = pop;
        this.pib = pib;
        this.nbrCommunes = nCom;
        this.superficie = sup;
    }


    public String toString(){
        return "Region,"+nom+","+this.population+","+this.pib+
                ","+this.nbrCommunes+","+this.superficie;
    }

    public String getNom(){
        return this.nom;
    }
    
    public float getPIB() {
    	return this.pib;
    }
    
    public float getPOP() {
    	return this.population;
    }
    
    public int getSuperficie() {
    	return this.superficie;
    }
    
    public int compareTo(Region C2){
        return this.getNom().compareTo(C2.getNom());
    }

}
