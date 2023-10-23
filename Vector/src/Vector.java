public class Vector implements VectorADT{

    private double A;
    public double A() {return A;}
    private double B;
    public double B() {return B;}

    public Vector(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public double getA(Vector v) {
        return v.A();
    }

    public double getB(Vector v) {
        return v.B();
    }

    public Vector add(Vector v) {
        double newA = this.A() + v.A();
        double newB = this.B() + v.B();
        return new Vector(newA, newB);
    }

    public Vector multiVector(double r) {
        double newA = this.A * r;
        double newB = this.B * r;
        return new Vector(newA, newB);
    }

    public Vector subtract(Vector v) {
        double newA = this.A() - v.A();
        double newB = this.B() - v.B();
        return new Vector(newA, newB);
    }

    public boolean compare(Vector v) {
        return this.A() == v.A() && this.B() == v.B();
    }

    public double ScalarProduct(Vector v) {
        return this.A() * v.A() + this.B() * v.B();
    }

    public double magnitude() {
        return Math.sqrt(this.A * this.A + this.B * this.B);
    }

    public String toString() {
        return "(" + A + ", " + B + ")";
    }
    
}
