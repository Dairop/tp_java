import java.io.File;
import java.util.ArrayList;

public interface IORegion {
    public ArrayList<Region> lire(String fileName);
    public void sauver(String fileName, ArrayList<Region> Arr);
}
