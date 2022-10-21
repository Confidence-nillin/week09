package Day03;

import java.util.Random;

public class Test {
    public static int max(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        return max;

    }
    public static int add(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];

        }
        return s;
    }
    public static void input(int [] arr){
        Random r =new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(50);

        }

    }
    public static void output(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // 21140108
        int [] arr   =new int [10];
        input(arr);
        System.out.println("arr数组:");
        output(arr);
        System.out.println("arr数组的平均值为:"+add(arr)/arr.length);
        System.out.println("arr数组最大值为:"+max(arr));

        int [] b=new int [20];
        input(b);
        System.out.println("b数组:");
        output(b);
        System.out.println("b数组的平均值为:"+add(b)/b.length);
        System.out.println("b数组最大值为:"+max(b));
    }


}