package PMC;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileCreationTime {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:/home/appia01/Javelin/");
        System.out.println(folder);
        //File[] listOfFiles = folder.listFiles();
        String[] listOfFiles = folder.list();
        Path recentPath = null;
        long newest = 0L;
        BasicFileAttributes attr = null;
        System.out.println(listOfFiles);
        for(String fileName: listOfFiles) {
            try {
                Path p = Paths.get(folder+"/"+fileName);
                System.out.println(p);
                attr = Files.readAttributes(p, BasicFileAttributes.class);
                System.out.println(attr.creationTime().toMillis());
            }
            catch(Exception e) {
                //Log.error(e);
            }
        }
        /*for(int i=0;i<listOfFiles.length;i++) {
            System.out.println(listOfFiles[i].getName());
            if(listOfFiles[i].getName().startsWith("Appia")) {
                Path path = listOfFiles[i].toPath();
                System.out.println("Path: "+path + "---"+ path.getFileName());
                BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
                long fileTime = attr.creationTime().toMillis();
                if (fileTime > newest) {
                    newest = fileTime;
                    recentPath = path;
                }
                System.out.println(path + "---" + fileTime);
                System.out.println(recentPath);
            }
        }*/
        String str = "AppiaBuyAppia-4.1.3_02";
        System.out.println(str.substring(8));
    }
}
