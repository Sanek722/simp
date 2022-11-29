import java.util.Scanner;
public class pr13
{
    Scanner in = new Scanner(System.in);
    public void go()
    {
        int n = in.nextInt();
        if (n ==0)
        {
            return;
        }
        int b = in.nextInt();
        if (b==0)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.println(n);
            go();
        }

    }
}
