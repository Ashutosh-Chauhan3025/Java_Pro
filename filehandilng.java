import java.util.*;
import java.io.*;
public class filehandilng {
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("NEW.txt");
            FileWriter wr=new FileWriter("NEW.txt",true);
            BufferedReader br=new BufferedReader(fr);
            String line;
            int n=1234;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            BufferedWriter wri=new BufferedWriter(wr);
            wri.write(n);
            wri.close();
        }
        catch(IOException e){
            System.out.println("not found");
        }
        catch(Exception e){
            System.out.println("cannot write integer"+e.getMessage());
            e.printStackTrace(); 
        }
    }
}
