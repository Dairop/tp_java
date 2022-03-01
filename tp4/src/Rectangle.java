public class Rectangle extends Polygone{
    
    public Rectangle(Point P1, Point P2, Point P3, Point P4, String nom){
    	super(nom);
        this.points.clear();
        this.points.add(P1);
        this.points.add(P2);
        this.points.add(P3);
        this.points.add(P4);
    }

    public String toString() {
        return "Rectangle ["+points.get(0).toString()+", "+
        points.get(1).toString()+", "+
        points.get(2).toString()+", "+
        points.get(3).toString()+"] perimetre=" + perimetre();
    }
}
