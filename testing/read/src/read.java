import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class read {

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    public static void main(String[] args) {




        {
            try {
                File file = new File("F:\\Dambe\\test\\mtDNA\\mtDNAPri3F84SE.DIS");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "", oldtext = "";
                while ((line = reader.readLine()) != null) {
                    oldtext += line + "\r\n";
                    //System.out.println("1");
                }
                reader.close();

                //System.out.println(oldtext);
                String[] words = oldtext.split(" ");
                FileWriter writer = new FileWriter("F:\\Dambe\\test\\mtDNA\\realDisEdit10.dis");
                //writer.write(replacedtext);
                int i=0;


                Random rn = new Random();
                int replacement=0;

                while(i<words.length) {
                    String word=words[i];
                    //System.out.println(word);
                    //System.out.println(word+isNumeric(word));
                    int x = rn.nextInt();

                    if(isNumeric(word) && x%10==0)
                    {
                        //System.out.println(x);
                        oldtext=oldtext.replaceAll( word, "." );
                        replacement++;
                        System.out.println(replacement);

                    }
                    i++;
                    //System.out.println(words.length);
                    if(replacement==8)
                    {
                        System.out.println(replacement);
                        break;
                    }
                    if(i>=words.length && replacement!=8) {
                        i = 0;
                        System.out.println(replacement);
                    }


                }
                writer.write(oldtext);


                writer.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}