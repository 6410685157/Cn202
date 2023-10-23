public interface VectorADT {

    double A();
    double B();

    public double getA(Vector v);
    public double getB(Vector v);

    public Vector add(Vector v);
    
    public Vector multiVector(double r);

    public Vector subtract(Vector v);

    public boolean compare(Vector v);

    public double ScalarProduct(Vector v);

    public double magnitude();

    public String toString();

}
