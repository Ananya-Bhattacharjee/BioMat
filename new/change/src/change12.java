import java.io.*;

public class change12 {

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    public static void main(String[] args) {




        {
            try {
                for(int ii=1;ii<11;ii++) {
                    File file = new File("F:\\Dambe\\mammals\\scale2down\\"+ String.valueOf(ii)+".fasta");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line = "", oldtext = "";
                    while ((line = reader.readLine()) != null) {
                        oldtext += line + "\r\n";
                        //System.out.println("1");
                    }
                    reader.close();
                    System.out.println(oldtext.length());


                    //System.out.println(oldtext);
                    FileWriter writer = new FileWriter("F:\\Dambe\\mammals\\scale2down\\"+String.valueOf(ii)+"edited12.fasta");
                    //writer.write(replacedtext);
                    int i = 0;
                    char[] old = oldtext.toCharArray();
                    while (i < oldtext.length()) {
                        //System.out.println(i);
                        if (oldtext.charAt(i) == 'M' && oldtext.charAt(i + 1) == 'O' && oldtext.charAt(i + 2) == 'N') {


                            System.out.println(oldtext.substring(i + 5, i + 1635));
                            for (int j = i + 5; j < (i + 820); j++) {

                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }
                        if (oldtext.charAt(i) == 'M' && oldtext.charAt(i + 1) == 'A' && oldtext.charAt(i + 2) == 'C') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 820; j < (i + 1635); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }

                        if (oldtext.charAt(i) == 'B' && oldtext.charAt(i + 1) == 'O' && oldtext.charAt(i + 2) == 'S') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 5; j < (i + 820); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }
                        if (oldtext.charAt(i) == 'S' && oldtext.charAt(i + 1) == 'U' && oldtext.charAt(i + 2) == 'S') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 5; j < (i + 820); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }
                        if (oldtext.charAt(i) == 'V' && oldtext.charAt(i + 1) == 'I' && oldtext.charAt(i + 2) == 'C') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 820; j < (i + 1635); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }

                        if (oldtext.charAt(i) == 'C' && oldtext.charAt(i + 1) == 'A' && oldtext.charAt(i + 2) == 'N') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 5; j < (i + 820); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }
                        if (oldtext.charAt(i) == 'T' && oldtext.charAt(i + 1) == 'U' && oldtext.charAt(i + 2) == 'P') {


                            //System.out.println(oldtext.substring(i+5,i+1635));
                            for (int j = i + 820; j < (i + 1635); j++) {
                                if (Character.isLetter(old[j]))
                                    old[j] = '-';
                            }
                        }


                        i++;

                    }


                    //Random rn = new Random();
                    int replacement = 0;
                    writer.write(old);


                    writer.close();
                    writer = new FileWriter("F:\\Dambe\\mammals\\scale2down\\"+ String.valueOf(ii)+"edited12.dis");
                    writer.write("37");
                    writer.close();

                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}