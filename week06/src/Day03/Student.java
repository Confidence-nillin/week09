package Day03;

public class Student {
    String stuID;//System.out.println("学号：" + stuID);
    int height;//180mSystem.out.println("身高" + height);
    double javaScore;//System.out.println("Java课程成绩" + javaScore);
    double linuxScore;//System.out.println("Linux" + linuxScore);
    double netScore;//System.out.println("网路课程成绩" + netScore);

    public void info(){
        System.out.println("学号：" + stuID);
        System.out.println("身高" + height);
        System.out.println("Java课程成绩" + javaScore);
        System.out.println("Linux" + linuxScore);
        System.out.println("网路课程成绩" + netScore);
        System.out.println("总成绩为：" +  sum());
    }
    public double sum(){
        return  javaScore + linuxScore + netScore;
    }
    public void compare(Student s){
        if (this.sum() > s.sum()){
            System.out.println(this.stuID + "的分数高～");
        } else if (this.sum() < s.sum()) {
            System.out.println(s.stuID + "的分数高～");
        }else{
            System.out.println(this.stuID + "和" + s.stuID + "分数一样高～");
        }
    }
}
