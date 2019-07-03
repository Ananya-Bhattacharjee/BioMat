import java.io.*;

public class writeReal {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Dambe\\true-trees-scaled2down");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "", oldtext = "";
        int i=0;
        while ((line = reader.readLine()) != null) {

            //System.out.println(line);
            FileWriter writer = new FileWriter("F:\\Dambe\\mammals\\scale2down\\"+String.valueOf(i+1)+"real.DND");
            writer.write(line);


            writer.close();

            i++;
            if(i==10) break;
        }
        reader.close();

    }
}
