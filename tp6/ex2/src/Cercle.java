public class Cercle extends Forme{
    private int rayon;

    public Cercle(int x, int y, int rayon){
        super(x, y);
        this.rayon = rayon;
    }

    public String toString(){
        return "Cercle "+this.x+" "+this.y+" "+this.rayon;
    }
}