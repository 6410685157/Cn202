public class Rational implements rationalADT{

    public int num;
    public int den;

    public int num() {
        return num;
    }

    public int den() {
        return den;
    }

    public Rational(int a, int b){
        num = a;
        den = b;
    }

    public int numer() {
        return num;
    }
    public int denom() {
        return den;
    }

    public Rational add(Rational r) {
        int newNum = (this.num * r.den) + (r.num * this.den);
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    public Rational subtract(Rational r) {
        int newNum = (this.num * r.den) - (r.num * this.den);
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    public Rational multiply(Rational r) {
        int newNum = this.num * r.num;
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    public Rational divide(Rational r) {
        int newNum = this.num * r.den;
        int newDen = this.den * r.num;
        return new Rational(newNum, newDen);
    }

    public Rational negate() {
        return new Rational(-1 * this.num, this.den);
    }

    public Rational invert() {
        return new Rational(this.den, this.num);
    }

    public void reduce() {
        double a = num;
        double b = den;

        while (b != 0) {
            double temp = b;
            b = a % b;
            a = temp;
        }

        double gcd = a;
        num /= gcd;
        den /= gcd;
    }

    public String toString() {
        return num + "/" + den;
    }

}
