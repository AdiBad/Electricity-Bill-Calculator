package elecboard;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 class ahatry
{
BufferedWriter writer=null;
BufferedReader reader=null;
BufferedReader rd=null;
    int[] a=new int[]{1,2,3};
    int b[]={1,2,3,4,5,6};
   
    

        FileOutputStream f;

    ahatry() {
    try {
        this.f = new FileOutputStream("lel.txt");
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ahatry.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        
   // byte b[]={" Aha "," Aha again","Aha thrice"};
   public void aha1() throws IOException{
    try
    {
        int i=0;
        writer=new BufferedWriter(new FileWriter("lel.txt"));
        while(i!=3)
        {System.out.print(a[i]);
            f.write(a[i]);
            writer.write("One\n Two\n three\n");
           // f.write(" ");
            i++;
        }
     //   f.close();
    }
    catch(Exception e)
    {
        System.err.println(e.toString());
    }
    finally
    {
        f.close();
        writer.close();
    }
}
   
   public void aha2(){
    try
    {
        FileOutputStream p=new FileOutputStream("lel2.txt");
        FileInputStream r=new FileInputStream("lel2.txt");
        rd=new BufferedReader(new FileReader("lel2.txt"));
        FileInputStream f=new FileInputStream("lel.txt");
        reader=new BufferedReader(new FileReader("lel.txt"));
        int i=0,j;
        j=f.read();
      
         System.out.println("\n"+j);
        while(i!=3)
        {
            System.out.println("\n"+f.read()+"\n"+reader.readLine());
            i++;
            p.write(f.read());
            System.out.println("FROM LEL2.TXT : "+r.read());
        }
        f.close();
    }
    catch(Exception e)
    {
        System.err.println(e.toString());
    }
}
}
    /**
     *
     * @param args
     */
public class aha
{
public static void main(String[] args) throws IOException
   {
       ahatry a=new ahatry();
       a.aha1();
       a.aha2();
   }
}