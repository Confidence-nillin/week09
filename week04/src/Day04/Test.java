package Day04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //21140114
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入上半部分图形的行数:");
        int x=sc.nextInt();
        System.out.println("图形一共"+(x+x-1)+"行");
        for (int k = 1; k <= x; k++) {
            for (int i = 1; i <=x-k; i++) {

                System.out.print(" ");
            }
            for (int i = 1; i <= 2*k-1; i++) {

                System.out.print("*");
            }
            System.out.println();

        }
        for (int k = 1; k <= x-1; k++) {
            for (int i = 1; i <=k; i++) {

                System.out.print(" ");
            }
            for (int i = 1; i <= 2*(x-k)-1; i++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }

}
