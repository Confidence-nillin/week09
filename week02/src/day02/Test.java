package day02;
import java.util.*;//(1)
public class Test {

    public static void main(String[] args) {
        //21140114
        Scanner sc = new Scanner(System.in);//(2)
        //声明一个小数类型float/doule的变量，存放自己的平时成绩pscj
        double pscj;//双精度：建议类型
        System.out.println("请输入平时成绩：");
        //给平时成绩键盘输入值，添加适当的提示语句
        pscj = sc.nextDouble();
        //声明一个小数类型变量,存放自己的考试成绩,给考试成绩键盘输入值，添加适当的提示语句，最后输出
        System.out.print("请输入你的考试成绩");
        float kscj=sc.nextFloat();
        //
        double zzcj=pscj *0.7+kscj * 0.3;
        System.out.println("平时成绩为"+pscj);//输出平时成绩
        System.out.println("考试成绩为："+kscj);//输出考试成绩
        System.out.println("最终成绩为："+zzcj);//输出最终成绩
        System.out.println("21140114");
        sc.close();//(4)
    }
}
