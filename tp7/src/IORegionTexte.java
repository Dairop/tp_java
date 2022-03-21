import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;



public class IORegionTexte implements IORegion{
    public void IORegion(){};

    public void sauver(String fileName, ArrayList<Region> Arr){
        try {
            PrintWriter P = new PrintWriter( new FileWriter(fileName, true));

            for (Region R : Arr) {
                P.write("\n"+R.toString());
            }

            P.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Region> lire(String fileName){
        ArrayList <Region> ArrayOfRegions = new ArrayList<>(); 

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                Region NewRegion = new Region(data[1], 
                            Integer.parseInt(data[2]), 
                            Integer.parseInt(data[3]), 
                            Integer.parseInt(data[4]), 
                            Integer.parseInt(data[5]));
                ArrayOfRegions.add(NewRegion);
           
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        

        return ArrayOfRegions;

    }

}
