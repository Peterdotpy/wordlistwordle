import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class StringFinder
{
    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<String>();
        try {
            Scanner s = new Scanner(new File("C:\\Users\\yaoji\\Downloads\\StringLab\\WordList.txt"));

            while (s.hasNext()){
                wordList.add(s.next());
            }
            s.close();
        }

        catch (Exception e) {

        }
        //example:         world
        //slot:            12345
        //count the frequencies of each letter in each slot
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int r = 0;
        int s = 0;
        int u = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
       for(String word : wordList){
           System.out.println(word.substring(0,1));
           if(word.substring(0,1).equalsIgnoreCase("a") );
                a++;
           }
       System.out.println(a); // stuck here because whenever printing a it shows 14855 which is the total word list number need fix here****

        //calculate the most frequent letter in each slot then assemble it as word.




           }


       }




