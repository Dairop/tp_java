import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    	PeutSeDeplacer[] tabFormes = new PeutSeDeplacer[5];
    	
        Point P = new Point(0, 0);
        tabFormes[0] = P;
        
        ArrayList<Point> p = new ArrayList<Point>();
        p.add(new Point(0, 0)); p.add(new Point(1, 0)); p.add(new Point(1, 2)); p.add(new Point(2, 1.5f));
        p.add(new Point(-1, 1)); p.add(new Point(0, -1));
        Polygone Poly = new Polygone(p, "PolygoneDeLespoir");
        tabFormes[1] = Poly;
        
        Rectangle R = new Rectangle(new Point(0, 0), new Point(5, 0), new Point(5, -3), new Point(0, -3), "RectangleDeLaReussite");
        tabFormes[2] = R;

        Triangle T = new Triangle(new Point(0, 0), new Point(5, 0), new Point(5, -3), "TriangleDeLAvenir");
        tabFormes[3] = T;
        
        Cercle C = new Cercle(new Point(1, 1), 5f, "nomDuCercle");
        tabFormes[4] = C;
        
        for (int i = 0; i < tabFormes.length; i++) {
        	System.out.println(tabFormes[i].toString());
        }
        
        
        for (int i = 0; i < tabFormes.length; i++) {
        	tabFormes[i].translation(3.14159265f/2, 1.5f);
        }
        
        
        
        for (int i = 0; i < tabFormes.length; i++) {
        	System.out.println(tabFormes[i].toString());
        }
    }
}