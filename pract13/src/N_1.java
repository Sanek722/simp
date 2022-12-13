import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N_1 {
    public static String N_1_1(String s,String p){
        return Arrays.toString(s.split(p));
    }
    public static ArrayList<String> N_1(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
    public static boolean N_2(String s){
        Matcher m = Pattern.compile("((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])" +
                "|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|" +
                "(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))").matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static boolean N_3(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String[] args) {
        System.out.println(N_1_1("a b c"," "));
        System.out.println();

        System.out.println(N_1("25.98 USD,44 ERR, 0.004 EU"));
        System.out.println();

        System.out.println(N_2("29/02/2000"));
        System.out.println(N_2("30/04/2003"));
        System.out.println(N_2("30-04-2003"));
        System.out.println(N_2("1/1/1899"));
        System.out.println();

        System.out.println(N_3("F032Password"));
        System.out.println(N_3("smart_pass"));
        System.out.println();
    }
}
