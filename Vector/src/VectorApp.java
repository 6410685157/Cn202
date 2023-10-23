public class VectorApp {
    public static void main(String[] args){
        Vector a = new Vector(3, 4);
        System.out.println("a = "+ a.toString());
        Vector b = new Vector(2, 1);
        System.out.println("b = "+ b.toString());
        Vector c = new Vector(5, 12);
        System.out.println("c = "+ c.toString());

        double ab = a.ScalarProduct(b);
        System.out.println("a . b = " + ab);
        Vector d = c.multiVector(ab);
        System.out.println("(a . b)c = " + d);
        
        double x = d.magnitude();
        System.out.println("|(a . b)c| = " + x);
    }
}
