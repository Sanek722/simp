import java.util.Arrays;
public class Test
{
    public static void main(String[] args)
    {
        Student iDNumber[] = new Student[6];
        iDNumber[0]= new Student("valera","grirorievich","popov","inform",2,"ikbo",46);
        iDNumber[1]= new Student("sasha","leonid","sidorov","inform",2,"ikbo",235);
        iDNumber[2]= new Student("vitua","andreyev","ivanov","inform",2,"ikbo",200);
        iDNumber[3]= new Student("andrew","grirorievich","halop","inform",2,"ikbo",23);
        iDNumber[4]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",0);
        iDNumber[5]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",21);

        Student iDNumber1[] = new Student[6];
        iDNumber1[0]= new Student("valera","grirorievich","popov","inform",2,"ikbo",12423);
        iDNumber1[1]= new Student("sasha","leonid","sidorov","inform",2,"ikbo",124);
        iDNumber1[2]= new Student("vitua","andreyev","ivanov","inform",2,"ikbo",745);
        iDNumber1[3]= new Student("andrew","grirorievich","halop","inform",2,"ikbo",346);
        iDNumber1[4]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",4572);
        iDNumber1[5]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",47511);

        Student iDNumber2[] = new Student[6];
        iDNumber2[0]= new Student("valera","grirorievich","popov","inform",2,"ikbo",1);
        iDNumber2[1]= new Student("sasha","leonid","sidorov","inform",2,"ikbo",2);
        iDNumber2[2]= new Student("vitua","andreyev","ivanov","inform",2,"ikbo",234);
        iDNumber2[3]= new Student("andrew","grirorievich","halop","inform",2,"ikbo",4);
        iDNumber2[4]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",10);
        iDNumber2[5]= new Student("vanua","grirorievich","notrov","inform",2,"ikbo",6);

        System.out.println("Быстрая сортировка");
        System.out.println("До");
        for (int i =0; i <iDNumber.length;i++)
            System.out.println(iDNumber[i]);
        SortStudents st = new SortStudents();
        System.out.println("После");
        st.quickSort(iDNumber,0, iDNumber.length-1);
        for (int i =0; i <iDNumber.length;i++)
            System.out.println(iDNumber[i]);
        System.out.println("Сортировка простым слиянием");
        System.out.println("Объединение двух списков в один отсортированный");
        System.out.println("До сотировки");
        for (int i =0; i <iDNumber1.length;i++)
            System.out.println(iDNumber1[i]);
        for (int i =0; i <iDNumber2.length;i++)
            System.out.println(iDNumber2[i]);
        Student[] test = st.back(iDNumber1, iDNumber2);
        System.out.println("После сортировки");
        for (int i =0; i <test.length;i++)
            System.out.println(test[i]);


//
//        int x[] = {46, 235, 200, 23, 0 ,21};
//        System.out.println("До");
//        for (int i =0; i <6;i++)
//            System.out.print(x[i] + " ");
//        System.out.println("после");
//        st.sliv2(x,0,6);
//        for (int i = 0; i<6; i++)
//            System.out.println(x[i] + " ");
    }
}
