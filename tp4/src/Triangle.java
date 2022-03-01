public class Triangle extends Polygone{
    public Triangle(Point P1, Point P2, Point P3, String nom){
    	super(nom);
        this.points.clear();
        this.points.add(P1);
        this.points.add(P2);
        this.points.add(P3);
    }

    public String toString() {
        return "Triangle ["+points.get(0).toString()+", "+
        points.get(1).toString()+", "+
        points.get(2).toString()+"] perimetre=" + perimetre();
    }
}
