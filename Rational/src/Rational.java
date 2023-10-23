import java.math.BigInteger;

public class Rational implements rationalADT{

    public BigInteger num;
    public BigInteger den;

    public BigInteger num() {
        return num;
    }

    public BigInteger den() {
        return den;
    }

    public Rational(BigInteger a, BigInteger b){
        num = a;
        den = b;
    }

    public BigInteger numer() {
        return num;
    }
    public BigInteger denom() {
        return den;
    }

    public Rational add(Rational r) {
        BigInteger newNum = (this.num.multiply(r.den)).add(r.num.multiply(this.den));
        BigInteger newDen = this.den.multiply(r.den);
        return new Rational(newNum, newDen);
    }

    public Rational subtract(Rational r) {
        BigInteger newNum = (this.num.multiply(r.den)).subtract(r.num.multiply(this.den));
        BigInteger newDen = this.den.multiply(r.den);
        return new Rational(newNum, newDen);
    }

    public Rational multiply(Rational r) {
        BigInteger newNum = this.num.multiply(r.num);
        BigInteger newDen = this.den.multiply(r.den);
        return new Rational(newNum, newDen);
    }

    public Rational divide(Rational r) {
        BigInteger newNum = this.num.multiply(r.den);
        BigInteger newDen = this.den.multiply(r.num);
        return new Rational(newNum, newDen);
    }

    public Rational negate() {
        return new Rational(this.num.negate(), this.den);
    }

    public Rational invert() {
        return new Rational(this.den, this.num);
    }

    public void reduce() {
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);
    }

    public String toString() {
        return num + "/" + den;
    }

}
