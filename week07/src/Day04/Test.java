package Day04;
//21140114
public class Test {
    public static void main(String[] args) {

                Date date0 = new Date();
                date0.setYear(2002);
                date0.setMonth(5);//date0.month = 5;
                date0.setDay(25);
                date0.show();
                Date date2 = new Date();
                date2.setYear(2004);
                date2.setMonth(9);//date2.month = 9;
                date2.setDay(10);//date2.day = 10;
                date2.show();

        System.out.println(date2.getYear());
        System.out.println(date2.getMonth());
        System.out.println(date2.getDay());
    }
}
