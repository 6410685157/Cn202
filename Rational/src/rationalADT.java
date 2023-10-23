import java.math.BigInteger;

public interface rationalADT{
  
  BigInteger num();
  BigInteger den();

  public Rational add(Rational r);

  public Rational subtract(Rational r);

  public Rational multiply(Rational r);

  public Rational divide(Rational r);

  public Rational negate();

  public Rational invert();

  public void reduce();

  public String toString();

}