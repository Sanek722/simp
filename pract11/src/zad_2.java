import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class zad_2 {
    public static void main(String[] args)
    {
        SimpleDateFormat fort = new SimpleDateFormat("dd.MM.yyyy");
        Date c = new Date();
        String a,b;
        Calendar userDate = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        System.out.println("Введите месяц");
        int month = in.nextInt();
        System.out.println("Введите день");
        int day = in.nextInt();
        userDate.set(year, month -1, day);
        b = fort.format(c);
        a = fort.format(userDate.getTime());
        if (a.equals(b))
        {
            System.out.println("Правильно");
        }
        else System.out.println("Не правильно");
    }
}
