public class RationalApp{
  public static void main(String[] args) {
    Rational sum = new Rational(0, 1);
        for (int i = 1; i <= 99; i++) {
            Rational x = new Rational(i, i + 1);
            sum = sum.add(x);
            sum.reduce();
            String result = sum.toString();
            System.out.println(i + ": " + result);
        }
    }
}