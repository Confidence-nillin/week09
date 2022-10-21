package Day05;
//21140114
public class Person {
    private String id;//身份证号码
    private double height;//身高

    //给身份证号码和身高添加set方法
    public void setId(String id){
        this.id = id;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //给身份证号码和身高添加get方法
    public String getId(){
        return id;
    }
    public double getHeight(){
        return height;
    }
}
