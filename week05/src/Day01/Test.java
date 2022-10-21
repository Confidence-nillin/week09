package Day01;
                            //21140114
public class Test {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b) {
        return a > b ? a : b;
    }
    public static int max(int a, int b,int c) {
        int m =a > b ? a : b;
        return m > c ? m: c;
    }

    public static void main(String[] args) {


    int a=5,b =10;

    int m1 = max(a,b);
        System.out.println(m1);

        int x =11,y = 22;
        int m2 = max(x,y);
        System.out.println(m2);

        System.out.println(max(8,3));
        System.out.println(max(8,2.5));
        System.out.println(max(5,2,3));
    }
}
