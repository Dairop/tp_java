import java.io.Serializable;

public abstract class Forme implements Serializable {
    int x;
    int y;
    public Forme(int x, int y){
        this.x = x; 
        this.y = y;
    }




    public static void afficher(Forme[] Formes){
        for (Forme F : Formes){
            System.out.println(F.toString());
        }
    }
}
