public class pr14
{
    public void go(int a)
    {
        int b = a%10;
        if(b!=0)
        {
            go(a/10);
            System.out.println(a%10);
        }
    }
}