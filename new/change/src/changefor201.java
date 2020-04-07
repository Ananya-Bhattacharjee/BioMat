import java.io.*;

public class changefor201 {


    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    public static void main(String[] args) {




        {
            try {

                File file = new File("F:\\Dambe\\200Taxa\\9\\9.fasta");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "", oldtext = "";
                while ((line = reader.readLine()) != null) {
                    oldtext += line + "\r\n";
                    //System.out.println("1");
                }
                reader.close();
                //System.out.println(oldtext.length());




                //System.out.println(oldtext);
                FileWriter writer = new FileWriter("F:\\Dambe\\200Taxa\\9\\9edited2500.fasta");
                //writer.write(replacedtext);
                int i=0;
                char []old=oldtext.toCharArray();
                //System.out.println(oldtext.charAt(1));

                //if(oldtext.charAt(8)=='\n')
                System.out.println((int)(oldtext.charAt(6)));

                int cut1=0, cut2=0;

                //1 - 514,1027
                //2 - 481,963
                //3 - 467, 935
                //4 - 482,966
                //5 - 310, 620
                //6 - 237, 474
                //7 - 132,263
                //8 - 400, 800
                //9 - 380, 761
                //10 - 227, 455

                while(i<oldtext.length())
                {
                    //System.out.println(i);
                    if(oldtext.charAt(i)=='n' && cut1<=49 && cut2==0){

                        int x=0;
                        if((int)(oldtext.charAt(i+5))==13) x=i+6;
                        if((int)(oldtext.charAt(i+6))==13) x=i+7;
                        if((int)(oldtext.charAt(i+7))==13) x=i+8;



                        //System.out.println(oldtext.substring(i,i+6));
                        for(int j=x+380;j<(x+761);j++)
                        {

                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                        cut1++;
                    }
                    else if(oldtext.charAt(i)=='n' && cut1>49 && cut2<=49){

                        int x=0;
                        if((int)(oldtext.charAt(i+5))==13) x=i+6;
                        if((int)(oldtext.charAt(i+6))==13) x=i+7;
                        if((int)(oldtext.charAt(i+7))==13) x=i+8;



                        //System.out.println(oldtext.substring(i,i+6));
                        for(int j=x;j<(x+380);j++)
                        {

                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                        cut2++;
                    }

     /*               if(oldtext.charAt(i)=='M' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='C'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='B' && oldtext.charAt(i+1)=='O' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+5;j<(i+820);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='S' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+5;j<(i+820);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='V' && oldtext.charAt(i+1)=='I' && oldtext.charAt(i+2)=='C'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='C' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='N'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+5;j<(i+820);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='T' && oldtext.charAt(i+1)=='U' && oldtext.charAt(i+2)=='P'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='S' && oldtext.charAt(i+1)=='P' && oldtext.charAt(i+2)=='E'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='D' && oldtext.charAt(i+1)=='I' && oldtext.charAt(i+2)=='P'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+5;j<(i+820);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='O' && oldtext.charAt(i+1)=='R' && oldtext.charAt(i+2)=='Y'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+5;j<(i+820);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
                    if(oldtext.charAt(i)=='D' && oldtext.charAt(i+1)=='A' && oldtext.charAt(i+2)=='S'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }

                    if(oldtext.charAt(i)=='P' && oldtext.charAt(i+1)=='R' && oldtext.charAt(i+2)=='O'){


                        //System.out.println(oldtext.substring(i+5,i+1635));
                        for(int j=i+820;j<(i+1635);j++)
                        {
                            if(Character.isLetter(old[j]))
                                old[j]='-';
                        }
                    }
*/





                    i++;

                }



                //Random rn = new Random();
                int replacement=0;
                writer.write(old);


                writer.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}
