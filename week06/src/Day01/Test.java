package Day01;

import java.util.Random;

public class Test {
    public static void input(int a[][]){
        Random ran = new Random();

        //a[0][0] a[0][1] a[0][2] a[0][a[]]

        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a[i].length ; j++){
                a[i][j] = ran.nextInt(50);
            }
        }
    }
    public static void output(int a[][]){
        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int max(int a[][]){
        int m = a[0][0];
        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a[i].length ; j++){
                if (m < a[i][j]){
                    m = a[i][j];
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        //21140114
        int a[][] = new int[3][];
        a[0] = new int[10];
        a[1] = new int[8];
        a[2] = new int[6];
        System.out.println("a数组的元素个数为：" + a.length);
        System.out.println("a[0]数组的元素个数为：" + a[0].length);
        System.out.println("a[1]数组的元素个数为：" + a[1].length);
        System.out.println("a[2]数组的元素个数为：" + a[2].length);
        input(a);
        output(a);
        System.out.println("a数组的最大值为：" + max(a));
    }
}
