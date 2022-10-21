package Day04;

import java.time.Month;

//21140114
/*
Java程序的访问权限：
1.public:公有，任何地方都可以访问
2. protected: 保护权限，包内或者包外的子类
3.默认：包权限。包内使用
4.private：私有权限，本类中
5。封装：把类的所有成员变量设置为私有
 */
public class Date {
    private int year, month, day;//封装
    /*
    修改/设置值的方法 set属性名字方法
    public void set 属性名（属性同名的形象{
        this.属性名 = 与属性同名的形象；
        }
     */
    public void setYear(int year) {
        this.year = year;//this指代当前对象，此处用于解决成员变量被局部变量屏蔽的问题
    }
    //给month和day添加set方法
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    /*
    获取/查询值的方法：get属性名字方法
    public 属性的类型名（）{
        return 属性；
    }
     */
    public int getYear(){
        return year;
    }
    //给month和day添加get方法
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void show(){
        System.out.println(year + "-" + month + "-" + day);
    }
}

