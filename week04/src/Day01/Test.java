package Day01;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //21140114
    Scanner sc = new Scanner(System.in);
        System.out.println("请输入现在的季节：");
        String season = sc.next();
        System.out.println("现在的季节为："+ season);

        switch (season){
            case "春天":System.out.println("春天到了，万物复苏的季节");
            case "夏天":System.out.println("夏天到了，炎热干燥的季节");
            case "秋天":System.out.println("秋天到了，落叶归根的季节");
            case "冬天":System.out.println("冬天到了，冰天雪地的季节");
            break;
            default:System.out.println("输入有误，请输入正确的中文季节名称");
        }
        sc.close();
    }
}
