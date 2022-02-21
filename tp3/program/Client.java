package program;
public class Client {
    protected int numeroClient;
    public String nom;
    protected double solde;

    public Client() {
    }

    public Client(String nom) {
        this.numeroClient = cptClient;
        this.nom = nom;
        this.solde = 0;
        cptClient++;
    }

    public int getNumeroClient() {
        return this.numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void addSolde(double solde) {
        this.solde += solde;
    }

    public String toString(){
        return "n°"+numeroClient+" "+nom+" "+solde+"€";
    }


    public boolean equals(Object C){
        return this.getNom() == ((Client) C).getNom();
    }






    static int cptClient = 0;


}
