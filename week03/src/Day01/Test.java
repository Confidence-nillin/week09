package Day01;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //21140114
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a=sc.nextInt();
        System.out.println("请输入一个数");
        int b=sc.nextInt();
        System.out.println("请输入一个数");
        int d=sc.nextInt();
        System.out.println("排序之前a:"+a+"b:"+b);
        int c;
        if (a>b) {
            c=a;
            a=b;
            b=c;
        }if (a>d){
            c=a;
            a=d;
            b=c;
        }if (b>d){
            c=b;
            b=d;
            b=c;
        }

        System.out.println("交换之后a:"+a+"b:"+b+"d"+d);
        sc.close();
    }
}
