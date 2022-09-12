import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class letterFinder
{
    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<String>();
        try {
            Scanner s = new Scanner(new File("WordList.txt"));

            while (s.hasNext()){
               wordList.add(s.next());
            }
            s.close();
        }

        catch (Exception e) {

        }
        System.out.println(wordList);
    }
}