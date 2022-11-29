public class pr15
{
    public void go(int a)
    {
        System.out.println(a%10);
        int b = a/10;
        if(b==0)
        {
            return;
        }
        go(b);
    }
}
