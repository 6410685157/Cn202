import java.math.BigInteger;
public class RationalApp{
  public static void main(String[] args) {
    BigInteger A  = BigInteger.valueOf(0);
    BigInteger B  = BigInteger.valueOf(1); 
    Rational sum = new Rational(A, B);
        for (int i = 99; i >= 1; i--) {
            BigInteger x0 = BigInteger.valueOf(i);
            BigInteger x1 = BigInteger.valueOf(i + 1);
            Rational x = new Rational(x0, x1);
            sum = sum.add(x);
        }
    sum.reduce();
    String result = sum.toString();
    System.out.println("result: " + result);
    }
}