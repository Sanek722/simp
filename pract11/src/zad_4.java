import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class zad_4 {
    public static void main(String[] args)
    {
        SimpleDateFormat obj = new SimpleDateFormat("yyyy.MM.dd h:m:s");
        Date c = new Date();
        Calendar userDate = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        System.out.println("Введите месяц");
        int month = in.nextInt();
        System.out.println("Введите день");
        int day = in.nextInt();
        System.out.println("Введите час");
        int hour = in.nextInt();
        System.out.println("Введите минуты");
        int minute = in.nextInt();
        userDate.set(year, month - 1, day ,hour , minute);
        System.out.println("Calendar: " + obj.format(userDate.getTime()));
        System.out.println("Data: " + obj.format(c));
    }
}
