package Day01;

public class Test {
    public static void main(String[] args) {
        Complex com1 = new Complex();
        com1.realPart = 3;
        com1.imagPart = 4;
        com1.show();

        Complex com2 = new Complex();
        com2.realPart = 5;
        com2.imagPart = 6;
        com2.show();

        Complex sum = com1.add(com2);
        sum.show();

    }
}
