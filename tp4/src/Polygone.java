import java.util.ArrayList;

public class Polygone extends FormeGeometrique {
    //protected pour pouvoir ajouter les points quand
    //on définit un rectangle ou une autre forme en général
    protected ArrayList<Point> points;

    public Polygone(String nom) {
    	this.nom = nom;
        this.points = new ArrayList<Point>();
    }
    
    public Polygone(ArrayList<Point> p, String nom) {
    	this.nom = nom;
        this.points = p;
    }

    public float perimetre(){
        if (points.size() <= 1) return 0f;
        double per = 0;
        for (int p = 1; p < points.size(); p++){
            per += points.get(p).dist(points.get((p+1)%points.size()));
        }

        return (float) per;
    }
    
    public void translation(float xt, float yt){
        for (int i = 0; i < points.size(); i++) {
        	points.get(i).translation(xt, yt);
        }
    }
    
    public String toString() {
    	String s = nom + " [";
    	for (int i = 0; i < points.size(); i++) {
    		s += points.get(i).toString();
    		if (i < points.size()-1) {
    			s += ", ";
    		}
    	}
    	
    	s += "] perimetre="+perimetre();
    	return s;
    }
}
