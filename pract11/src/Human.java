import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Human {
    Scanner in = new Scanner(System.in);
    Calendar userDate = Calendar.getInstance();
    int year,month,day,min,second;
    Human(int year, int month, int day, int min, int second){
        this.year = year;
        this.month = month;
        this.day = day;
        this.min = min;
        this.second = second;
        userDate.set(year, month - 1, day ,min,second);
    }
    public void date (){
        System.out.println("Выберите вывод даты:");
        System.out.println("1. короткий формат");
        System.out.println("2. средний формат");
        System.out.println("3. полный формат");
        SimpleDateFormat form;
        min = in.nextInt();
        switch (min)
        {
            case 1:
                form = new SimpleDateFormat("dd.MM.yyyy");
                System.out.println(form.format(userDate.getTime()));
                break;
            case 2:
                 form = new SimpleDateFormat("dd MMMM yyyy года");
                System.out.println(form.format(userDate.getTime()));
                break;
            case 3:
                 form = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                System.out.println(form.format(userDate.getTime()));
                break;
        }
    }
}
