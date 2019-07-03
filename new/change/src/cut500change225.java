import java.io.*;
import java.util.Random;

public class cut500change225 {

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    public static void main(String[] args) {




        {
            try {
                File file = new File("F:\\Dambe\\new\\cut500\\editedcut500.fasta");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "", oldtext = "";
                while ((line = reader.readLine()) != null) {
                    oldtext += line + "\r\n";
                    //System.out.println("1");
                }
                reader.close();
                System.out.println(oldtext.length());




                //System.out.println(oldtext);
                FileWriter writer = new FileWriter("F:\\Dambe\\new\\cut500\\edited225.fasta");
                //writer.write(replacedtext);
                int i=0;
                char []old=oldtext.toCharArray();
                while(i<oldtext.length())
                {
                    //System.out.println(i);
                    if(oldtext.charAt(i)=='M' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='N'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='M' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='C'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='T' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='R'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='B' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='S' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='V' && oldtext.charAt(i+1)=='I' && oldtext.charAt(i+2)=='C'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='C' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='N'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='E' && oldtext.charAt(i+1)=='Q' && oldtext.charAt(i+2)=='U'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='P' && oldtext.charAt(i+1)=='T' && oldtext.charAt(i+2)=='E'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='S' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='R'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='M' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='C' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='L'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }




                    if(oldtext.charAt(i)=='T' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='P'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='S' && oldtext.charAt(i+1)=='P' && oldtext.charAt(i+2)=='E'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='D' && oldtext.charAt(i+1)=='I' && oldtext.charAt(i+2)=='P'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='O' && oldtext.charAt(i+1)=='R' && oldtext.charAt(i+2)=='Y'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='D' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='P' && oldtext.charAt(i+1)=='R' && oldtext.charAt(i+2)=='O'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='O' && oldtext.charAt(i+1)=='R' && oldtext.charAt(i+2)=='N'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='G' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='L'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }

                    //225 start
                    if(oldtext.charAt(i)=='F' && oldtext.charAt(i+1)=='E' && oldtext.charAt(i+2)=='L'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='H' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='M'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='G' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='R'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='C' && oldtext.charAt(i+1)=='H' && oldtext.charAt(i+2)=='O'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='L' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='X'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+5;j<(i+505);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='M' && oldtext.charAt(i+1)=='Y' && oldtext.charAt(i+2)=='O'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='C' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='V'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='P' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='N'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='O' && oldtext.charAt(i+1)=='T' && oldtext.charAt(i+2)=='O'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='O' && oldtext.charAt(i+1)=='C' && oldtext.charAt(i+2)=='H'){


                        //System.out.println(oldtext.substring(i+5,i+1005));
                        for(int j=i+505;j<(i+1005);j++)
                        {
                            old[j]='-';
                        }
                    }







                    i++;

                }



                Random rn = new Random();
                int replacement=0;
                writer.write(old);


                writer.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}