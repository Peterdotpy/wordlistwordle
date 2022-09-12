import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class StringFinder
{
    public static void main(String[] args)
    {
         try {
                Scanner s = new Scanner(new File("WordList.txt"));
                
                while (s.hasNext()){
            
                System.out.println(s.next());
            }
            s.close();
        }
        catch (Exception e) {
            
        }
    }
}
