package Day02;

public class Test {
    public static void main(String[] args) {
        //21140114
        boolean is = true;
        int i = 0;
        int t = 0;
        while (i<100){
            i ++;
            if (i%3==0&&i%5!=0) {
                System.out.print(i+"\t");
                t ++;
                if (t % 3 ==0){
                    System.out.println();
                }
            }
        }
    }
}
