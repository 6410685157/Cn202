import java.math.BigInteger;
public class RationalApp{
  public static void main(String[] args, BigInteger A, BigInteger B, BigInteger x0, BigInteger x1) {
    A  = BigInteger.valueOf(0);
    B  = BigInteger.valueOf(1); 
    Rational sum = new Rational(A, B);
        for (int i = 1; i <= 99; i++) {
            x0 = BigInteger.valueOf(i);
            x1 = BigInteger.valueOf(i + 1);
            Rational x = new Rational(x0, x1);
            sum = sum.add(x);
            sum.reduce();
            String result = sum.toString();
            System.out.println(i + ": " + result);
        }
    }
}