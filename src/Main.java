import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String valueFirst, valueIn;
        int pos;

        System.out.println("Задача 4.1");
        System.out.println("Введите строку");
        valueFirst = in.nextLine();
        System.out.println("Введите подстроку");
        valueIn = in.nextLine();

        int amount = 0;
        boolean flag = true;

        while (flag) {
            pos = valueFirst.indexOf(valueIn);
            if (pos == -1) flag = false;
             else {
                 amount++;
                 valueFirst = valueFirst.substring(pos + valueIn.length());
            }
        }

        if (amount>0) {
            if (amount%10 >1 && amount%10 <5) System.out.println("Подстрока '" + valueIn +"' встречается " + amount + " раза");
                else System.out.println("Подстрока '" + valueIn +"' встречается " + amount + " раз");
        }


        System.out.println("");
        System.out.println("Задача 4.2");
        System.out.println("Введите строку");
        valueFirst = in.nextLine();
        boolean flag2=true;

        while (flag2) {
            pos = valueFirst.indexOf("бяка");
            if (pos == -1) flag2 = false;
             else {
                 valueFirst = valueFirst.substring(0,pos) + "вырезано цензурой" + valueFirst.substring(pos+4, valueFirst.length());
            }
        }

        flag2=true;

        while (flag2) {
            pos = valueFirst.indexOf("кака");
            if (pos == -1) flag2 = false;
            else {
                valueFirst = valueFirst.substring(0,pos) + "вырезано цензурой" + valueFirst.substring(pos+4, valueFirst.length());
            }
        }

        System.out.println(valueFirst);


        System.out.println("");
        System.out.println("Задача 4.3");
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        valueFirst = in.nextLine();

        pos = valueFirst.indexOf(".");
        valueIn = valueFirst.substring(0, pos);
        valueFirst = valueFirst.substring(pos+1, valueFirst.length());
        pos = valueFirst.indexOf(".");
        valueIn = valueFirst.substring(0, pos) + "-" + valueIn;
        valueIn = valueFirst.substring(pos+1, valueFirst.length())+ "-" + valueIn;

        System.out.println(valueIn);


        System.out.println("");
        System.out.println("Задача 4.4");
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        valueFirst = in.nextLine();

        Date date;
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        try {
            date = ft.parse(valueFirst);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        SimpleDateFormat ft2 = new SimpleDateFormat ("yyyy-MM-dd");
        valueIn = ft2.format(date);
        System.out.println(valueIn);
    }
}