

public class first {
    void stroka(String s)
    {
        System.out.println(s);
        System.out.println("Распечатать последний символ строки: " + s.charAt(13));
        System.out.println("\nзаканчивается ли ваша строка подстрокой “!!!”: " + s.endsWith("!!!"));
        System.out.println("\nначинается ли ваша строка подстрокой “I like”: " + s.startsWith("I like"));
        System.out.println("\nсодержит ли ваша строка подстроку “Java”: " + s.contains("Java"));
        System.out.println("\nНайти позицию подстроки “Java” в строке “I like Java!!!”: " + s.indexOf("Java"));
        System.out.println("\nЗаменить все символы “а” на “о”: " + s.replace('a', 'o'));
        System.out.println("\nПреобразуйте строку к верхнему регистру: " +s.toUpperCase());
        System.out.println("\nПреобразуйте строку к нижнему регистру: " +s.toLowerCase());
        System.out.println("\nВырезать строку Java: " + s.substring(0,6));
    }
    public static void main(String[] args)
    {
        first obj = new first();
        String t = "I like Java!!!";
        obj.stroka(t);

    }
}
