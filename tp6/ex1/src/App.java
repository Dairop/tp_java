import java.io.File;

public class App {
    public static void main(String[] args) {
        String relativePath = args[0];
        File F = new File(relativePath);
        String path = F.getAbsolutePath();
        long size = F.length();

        
        System.out.println("Chemin: " + relativePath);
        if (F.exists()){
            if (F.isFile()){
            System.out.println("Type: Fichier");
            System.out.println("Chemin absolu: "+path);
            System.out.println("Taille: "+size);


            } else if (F.isDirectory()) {
                System.out.println("Type: Répertoire");
                System.out.println("Liste des fichiers et répertoires du dossier \""+F.getName()+"\"");
                File[] childs = F.listFiles();
                for (File child: childs) {
                    System.out.println(child.getName());
                }
            } else {

            }
        }
        else {
            System.out.println("Il n'y a rien à cette adresse");
        }
    }
}
