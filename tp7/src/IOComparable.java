public class IOComparable implements Comparable{
    public void IOComparable(){};
    
    public int compareTo(Region C1, Region C2){
        return C1.getNom().compareTo(C2.getNom());
    }
}
