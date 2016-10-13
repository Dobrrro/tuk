package homework;
import java.lang.reflect.Field;

/**
 * Created by Пыльный on 11.10.2016.
 */
//сделать класс, который преобразует число (1987 например) в строку (одна тысяча девятьсот восемьдесят седьмой)
//и использовать этот класс как свойство для класса из предыдущей задачи для использования в методе getDate()
public class Zadacha3
{
//    public static void main(String[] args) {
//
//
//        System.out.println(Num.toString(12345));
//    }
}
//{
//    public static class IntInText {
//        public final static String x1="один";
//        public final static String xx1="одина";
//
//        public final static String x2="два";
//        public final static String xx2="две";
//
//
//        public final static String x3="три";
//        public final static String x4="четыре";
//        public final static String x5="пять";
//        public final static String x6="шесть";
//        public final static String x7="семь";
//        public final static String x8="восемь";
//        public final static String x9="девять";
//        public final static String x10="десять";
//
//        public final static String x11="одинадцать";
//        public final static String x12="двенадцать";
//        public final static String x13="тринадцать";
//        public final static String x14="четырнадцать";
//        public final static String x15="пятнадцать";
//        public final static String x16="шеснадцать";
//        public final static String x17="сернадцать";
//        public final static String x18="восемнадцать";
//        public final static String x19="девятнадцать";
//
//        public final static String x20="двадцать";
//        public final static String x30="тридцать";
//        public final static String x40="сорок";
//        public final static String x50="пятдесят";
//        public final static String x60="шесдесят";
//        public final static String x70="семдесят";
//        public final static String x80="восемдесят";
//        public final static String x90="девяноста";
//
//        public final static String x100="сто";
//        public final static String x200="двести";
//        public final static String x300="триста";
//        public final static String x400="четыреста";
//        public final static String x500="пятсот";
//        public final static String x600="шестсот";
//        public final static String x700="семсот";
//        public final static String x800="восемсот";
//        public final static String x900="девятсот";
//
//        public final static String x1000="тысяча";
//        public final static String xx1000="тысячи";
//        public final static String xхx1000="тысяч";
//
//
//
//        public static String convert(int x){
//            String no=String.valueOf(x);
//            String res="";
//            Field fild;
//            try{
//                Class clas = IntInText.class;
//
//                if(no.charAt(no.length()-1)!='0'){
//                    fild = IntInText.class.getField("x"+no.charAt(no.length()-1));
//                    res=" "+fild.get(clas).toString();
//                }
//
//                if(no.length()-2>-1 && no.charAt(no.length()-2)=='1'){
//                    fild = IntInText.class.getField("x1"+no.charAt(no.length()-1));
//                    res=" "+fild.get(clas).toString();
//                }
//
//                if(x>19 && no.charAt(no.length()-1)=='0'){
//                    fild = IntInText.class.getField("x"+no.charAt(no.length()-2)+"0");
//                    res=" "+fild.get(clas).toString()+res;
//                }
//
//                if(x>99 && no.charAt(no.length()-3)!='0'){
//                    fild = IntInText.class.getField("x"+no.charAt(no.length()-3)+"00");
//                    res=" "+fild.get(clas).toString()+res;
//                }
//
//
//                if(x>999 && no.length()-5==-1){
//                    String isRes=no.charAt(no.length()-4)+"";
//
//                    if(isRes.equals("1")){
//                        fild = IntInText.class.getField("xx"+no.charAt(no.length()-4));
//                        res=" "+fild.get(clas).toString()+" "+x1000+res;
//                    }
//                    if(isRes.equals("2")){
//                        fild = IntInText.class.getField("xx"+no.charAt(no.length()-4));
//                        res=" "+fild.get(clas).toString()+" "+xx1000+res;
//                    }
//                    if(isRes.equals("3")|| isRes.equals("4")){
//                        fild = IntInText.class.getField("x"+no.charAt(no.length()-4));
//                        res=" "+fild.get(clas).toString()+" "+xx1000+res;
//                    }
//                    if(no.charAt(no.length()-4)!='0' && !isRes.equals("1")&&!isRes.equals("2") && !isRes.equals("3") && !isRes.equals("4")){
//                        fild = IntInText.class.getField("x"+no.charAt(no.length()-4));
//                        res=" "+fild.get(clas).toString()+" "+xхx1000+res;
//                    }
//                }
//
//
//
//                if(x>9999 && no.charAt(no.length()-5)=='1'){
//                    fild = IntInText.class.getField("x1"+no.charAt(no.length()-4));
//                    res=" "+fild.get(clas).toString()+" "+xхx1000+res;
//                }
//
//
//
//                if(x>19999){
//
//                    fild = IntInText.class.getField("x"+no.charAt(no.length()-5)+"0");
//                    if(no.charAt(no.length()-4)=='0')
//                        res=" "+fild.get(clas).toString()+" "+xхx1000+res;
//                    else
//                        res=" "+fild.get(clas).toString()+res;
//
//                }
//
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//            return res;
//        }
//
//        public static void main(String [] argm){
//            int x = 11112;
//            String text = convert(x);
//            System.out.println("text="+text);
//        }
//
//    }
//}
