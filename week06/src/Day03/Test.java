package Day03;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //21140114

        Student stu = new Student();
        stu.stuID = "21140114";
        stu.height = 180;
        stu.javaScore = 99.5;
        stu.linuxScore = 98.5;
        stu.netScore = 97.5;
        stu.info();

        Student stu2 = new Student();
        stu2.stuID = "21140100";
        stu2.height = 180;
        stu2.javaScore = 99.5;
        stu2.linuxScore = 98.5;
        stu2.netScore = 97.5;
        stu2.info();

        stu.compare(stu2);
    }
}
