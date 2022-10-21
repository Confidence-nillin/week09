package Day03;

public class Test {
    public static void main(String[] args) {
        //21140114
        double s=0;
        int f=1;
        for(int i=1;i<10;i++) {
            if (i%3==0) {
                s += 1.0 / i * f;
                f = f * -1;//符号位
            }

            System.out.println(s);
    }
}}
