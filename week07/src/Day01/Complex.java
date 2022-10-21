package Day01;

public class Complex {
    int realPart;
    int imagPart;

    public void show(){
        System.out.println(realPart + "+" + imagPart + "i");
    }

    public Complex add(Complex com){
        Complex sum = new Complex();
        sum.realPart = realPart + com.realPart;
        sum.imagPart = imagPart + com.imagPart;
        return sum;
    }

}
