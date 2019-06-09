import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class check {

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    public static void main(String[] args) {




        {
            try {
                File file = new File("F:\\Dambe\\new\\logdet\\logdetEdited342.dis");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "", oldtext = "";
                while ((line = reader.readLine()) != null) {
                    oldtext += line + "\r\n";
                    //System.out.println("1");
                }
                reader.close();
                System.out.println(oldtext.length());


                //writer.write(replacedtext);
                int i=0;



                //System.out.println(oldtext);
                //writer.write(replacedtext);

                int count=0;
                char []old=oldtext.toCharArray();
                while(i<oldtext.length())
                {
                    if(oldtext.charAt(i)=='?')
                    {
                        old[i]='.';
                        count++;
                    }




                    i++;

                }

                System.out.println(count);
                FileWriter writer = new FileWriter("F:\\Dambe\\new\\logdet\\logdetEdited342.dis");
                writer.write(old);


                writer.close();





            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}