package Day02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //21140114
        Scanner sc= new Scanner(System.in);

        System.out.print("键盘输入你的Java成绩：");
        int score = sc.nextInt();
        System.out.print("你的Java成绩为；"+score+"分");

        if (score>100||score<0){
            System.out.println("成绩非法");
        }else if (score<0){
            System.out.println("成绩非法");
        }else if (score>=90){
            System.out.println("成绩优秀");
        }else if(score >=60){
            System.out.println("成绩及格");
        }else {
            System.out.println("不及格，需要补考，请输入你的补考成绩：");
            int bukao=sc.nextInt();
            System.out.println("您的补考成绩为："+bukao);
            if (bukao>=60) {
                System.out.println("补考通过");
            }else {
                System.out.println("下学期重修");
            }
        }
        sc.close();
    }
}
