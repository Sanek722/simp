import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class zad_1
{
    public static void main(String[] args)
    {
        SimpleDateFormat fort = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Date obj1 = new Date();
        Calendar obj = Calendar.getInstance();
        obj.set(Calendar.YEAR,2022);
        obj.set(Calendar.MONTH,Calendar.DECEMBER);
        obj.set(Calendar.DAY_OF_MONTH,23);
        obj.set(Calendar.HOUR_OF_DAY,12);
        obj.set(Calendar.MINUTE,46);
        obj.set(Calendar.SECOND, 34);
        System.out.println("Лавка Александр " + "получил задание " + fort.format(obj.getTime()));
        System.out.println("Лавка Александр " + "сдал задание "+ fort.format(obj1));
    }
}