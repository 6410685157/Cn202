public class Metrix2x2App {
    public static void main(String[] args){
        Matrix2x2 b = new Matrix2x2(1, 9, 4, 16);
        Matrix2x2 bt = b.transpose();
        Matrix2x2 B = bt.multiply(4);

        Matrix2x2 C = new Matrix2x2(1, 0, 0, 1);

        Matrix2x2 A = C.multiply(B.inverse());
        String MatA = A.toString();
        System.out.println("A = ");
        System.out.println(MatA);

        Matrix2x2 A_1 = A.inverse();
        String MatA_1 = A_1.toString();
        System.out.println("A^-1 = ");
        System.out.println(MatA_1);
    }
}
