package day01;

import java.util.*;//导入java.util包中的所有类
import java.util.Scanner;//(1)导入java.util包中的Scanner类

public class Test {
    public static void main(String[] args) {
        //21140114 zxl
        //Scanner
        Scanner input = new Scanner(System.in);//(2)

        //声明一个整数int的变量，用来存放自己的年龄age
        int age;

        System.out.println("请输入一个整型的年龄");
        //把自己的年龄赋值给age
        age=input.nextInt();
        //控制台输出给自己的年龄 age=20
        System.out.println("age="+age);

        //关闭输入流对象
        input.close();

    }

}
