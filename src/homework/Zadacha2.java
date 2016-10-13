package homework;


import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Пыльный on 11.10.2016.
 */
//   В date хранится количество миллисекунд. В классе должны быть методы: getDate() - который вернет дату
//        в виде "7 апрель 1987" по количеству миллисекунд, прошедших с 1 января 1970 года 00:00
//        а также метод getTime() который вернет текущее время ("07:24")
public class Zadacha2
{
    public static void main(String[] args)
    {
        String date = getDate();
        String time = getTime();
        System.out.println(date);
        System.out.println(time);
    }
    private static String getDate()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy");
        String t1 = date.format(cal.getTime());
        return (t1);

    }
    private static String getTime()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        String t2 = time.format(cal.getTime());
        return t2;
    }

}



//public class Zadacha2 {
//    public static void main(String[] args) throws Exception {
//        SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy");
//        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
//
//        Calendar calendar = new GregorianCalendar();
//
//        System.out.println(date.format(calendar.getTime()));
//        System.out.println(time.format(calendar.getTime()));
//
//        int year = calendar.get(Calendar.YEAR);
//
//        System.out.println(year);
//    }
//}



//public class Zadacha2
//{
//     public static void main(String[] args) throws Exception
//{
//        Locale local = new Locale("ru", "RU");
//
//        DateFormatSymbols russSymbol = new DateFormatSymbols(local);
//        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy", russSymbol);
//        Date currentDate = new Date();
//        System.out.println("currentDateTime = " + sdf.format(currentDate));
//        DateFormat df = DateFormat.getTimeInstance(DateFormat.DEFAULT, local);
//        currentDate = new Date();
//        System.out.println("currentTime = " + df.format(currentDate));
//        }
//}