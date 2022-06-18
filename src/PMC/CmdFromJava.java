package PMC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdFromJava {

    public static void main(String[] args) throws IOException, InterruptedException {
        String cmd = "cd C:/home/appia01/Javelin/;";
        Runtime run = Runtime.getRuntime();
        Process pr = null;
        try {
            pr = run.exec(cmd);
            pr.waitFor();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            //Log.error(e1);
            System.out.println(e1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            //Log.error(e);
        }
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        try {
            while ((line=buf.readLine())!=null) {
                System.out.println("Line is: "+line);
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            //Log.error(e1);
        }
    }
}
