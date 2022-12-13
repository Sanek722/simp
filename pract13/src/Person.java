import javax.print.attribute.standard.MediaSize;
public class Person {
    String first_name;
    String second_name;
    String third_name;
    Person(String fam ,String nam,String ot){
        second_name = fam;
        first_name = nam;
        third_name = ot;
    }
    void change()
    {
        if(first_name == "" && third_name == "")
        {
            System.out.println(second_name);
        }
        if(first_name != "" && third_name == "")
        {
            System.out.println(second_name + " " + first_name.charAt(0));
        }
        if(first_name != "" && third_name != "")
        {
            System.out.println(second_name + " " + first_name.charAt(0) + "." + third_name.charAt(0));
        }
    }
    public static void main(String[] args) {
        Person obj1 = new Person("Лавка","Алесандр","Дмитриевич");
        Person obj2 = new Person("Лавка","","");
        Person obj3 = new Person("Лавка","Алесандр","");
        obj1.change();
        obj2.change();
        obj3.change();
    }
}
