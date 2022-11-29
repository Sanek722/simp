import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        pr13 obj = new pr13();
        obj.go();
        pr14 obj1 = new pr14();
        System.out.println("Введите число");
        int b = in.nextInt();
        obj1.go(b);
        pr15 obj2 = new pr15();
        System.out.println("Введите число");
        b = in.nextInt();
        obj2.go(b);
    }
}
