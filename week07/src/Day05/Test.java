package Day05;

public class Test {
    public static void main(String[] args) {
        //21140114
        //生成Person类对象
        Person person = new Person();
        //使用set方法给对象的属性赋值
        person.setId("32000000");
        person.setHeight(180.5);
        //使用get方法显示对象的属性
        System.out.println(person.getId());
        System.out.println(person.getHeight());
    }
}
