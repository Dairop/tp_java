public class Rectangle extends Forme{
    private int longueur;
    private int largeur;

    public Rectangle(int x, int y, int longueur, int largeur){
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public String toString(){
        return "rectangle "+this.x+" "+this.y+" "+this.largeur+" "+this.longueur;
    }
}