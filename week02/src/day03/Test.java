package day03;

import java.util.Scanner;//(1)

public class Test {
    public static void main(String[] args) {
        //21140114 zxl
        Scanner sc = new Scanner(System.in);//(2)
        //声明一个变量，存放自己的名字：XXX string:系统提供的字符串类
        System.out.print("请输入你的名字");
        String name = sc.next(); //键盘输入一个字符串
        //声明一个变量，存放自己的性别：'男'
        System.out.print("输入你的性别：");
        char gender =sc.next().charAt(0);//键盘输入一个字符
        System.out.println("名字"+name);
        System.out.println("性别："+gender);
        System.out.println("学号：21140114");
        sc.close();
    }
}
