package Dhruvil;

import java.io.*;
import java.util.Scanner;

public class Tp {
    void createNewFile(String s) throws IOException
    {
        File f=new File("Database\\"+s);
        if(f.createNewFile())
        {
            BufferedReader r=null;
            BufferedWriter w=null;
            try{
                r=new BufferedReader(new FileReader("Database\\SeatDataOfDifferentRoute.txt"));
                w=new BufferedWriter(new FileWriter(f));
                for(int i=1;i<=60;i++)
                {
                w.write(r.readLine());
                w.write("\n");
                }
                w.flush();
            }
            catch(FileNotFoundException e)
            {
                System.err.println("File Not Found");
            }
            catch(IOException e)
            {
                System.err.println("Some Error Occur");
            }
            finally{
                  r.close();
                  w.close();
            }
        }
        else{
            return;
        }
    }
    void deleteFile(String s)
    {
        File f=new File("Database\\"+s);
        f.delete();
    }
    public static void main(String[] args) throws IOException{
        Tp t=new Tp();
        Scanner scan=new Scanner("Database\\Date Data.txt");
        /*   r.readLine();
        r.readLine();*/
      //  System.out.println(scan.);
        
        
    }
}
