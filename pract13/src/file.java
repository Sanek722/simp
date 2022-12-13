
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class file
{
    public static StringBuilder getLine(String... words)
    {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(words[0], " ");
        while (st.hasMoreTokens())
        {
            list.add(st.nextToken());
        }
        char next =  list.get(0).toUpperCase().charAt(0);
        StringBuilder sb = new StringBuilder();
        while (!list.isEmpty()) {
            for (String s : list) {
                char ch = s.toUpperCase().charAt(0);
                if (ch == next) {
                    sb.append(s);
                    sb.append(" ");
                    System.out.print(s + " ");
                    list.remove(s);
                    next = s.toUpperCase().charAt(s.length() - 1);
                    break;
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }
    public static void main(String[] args) throws FileNotFoundException
    {
         file q = new file();
         File doc = new File("D:\\project\\pract13\\src\\text.txt");
         Scanner obj = new Scanner(doc);
         String str = null;
         while (obj.hasNextLine()) {
             str = obj.nextLine();
         }
        str = str + " ";
         q.getLine(str);
    }
}

