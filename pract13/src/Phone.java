public class Phone {
    String str1,str2,str3,str4,str5;

    Phone (String num)
    {
        str1 = num;
    }
    void sort(){
        char f = str1.charAt(0);
        if(f == '+')
        {
            str2 = str1.substring(1,5);
            str3 = str1.substring(5,8);
            str4 = str1.substring(8,10);
            str5 = str1.substring(10,12);
            System.out.println(f  + str2  + "-" + str3 + "-" + str4 + str5);
        }
        if (f=='8')
        {
            str2 = str1.substring(1,4);
            str3 = str1.substring(4,7);
            str4 = str1.substring(7,9);
            str5 = str1.substring(9,11);
            System.out.println("+7" + str2  + "-" + str3 + "-" + str4 + str5);
        }
    }
    public static void main(String[] args) {
        Phone obj1 = new Phone("+79175655655");
        Phone obj2 = new Phone("+104289652211");
        Phone obj3 = new Phone("89175655655");
        obj1.sort();
        obj2.sort();
        obj3.sort();
    }
}
