public class Point extends PeutSeDeplacer{
    private float x, y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public double dist(Point P2){
        return Math.sqrt((double) ((P2.getX() - this.x)*(P2.getX() - this.x) + (P2.getY() -this.y)*(P2.getY() - this.y)));
    }

    public String toString(){
        return "("+x+", "+y+")";
    }

    public void translation(float xt, float yt){
        this.x += xt; this.y += yt;
    }

}
