public class Cercle extends FormeGeometrique{
    private Point Centre;
    private float rayon;

    public Cercle(Point Centre, float rayon, String nom){
        this.Centre = Centre;
        this.rayon = rayon;
        this.nom = nom;
    }

    public float perimetre(){
        return 3.1415926f*rayon*2;
    }


    public String toString() {
        return "Cercle [nom="+ nom +", Centre=" + Centre + ", rayon=" + rayon +"]";
    }

    public void translation(float xt, float yt){
        Centre.translation(xt, yt);
    }
}
