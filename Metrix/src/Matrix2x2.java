
public class Matrix2x2 implements Matrix2x2ADT{

    private double[][] matrix = new double[2][2];

    public Matrix2x2(double a, double b, double c, double d) {
        matrix[0][0] = a;
        matrix[0][1] = b;
        matrix[1][0] = c;
        matrix[1][1] = d;
    }

    public double getElem(int i, int j) {
        if (i < 0 || i >= 2 || j < 0 || j >= 2) {
            throw new IndexOutOfBoundsException("“Invalid Index");
        }
        return matrix[i][j];
    }

    public boolean equals(Matrix2x2 b){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (this.getElem(i, j) != b.getElem(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix2x2 transpose(){
        return new Matrix2x2(matrix[0][0], matrix[1][0], matrix[0][1], matrix[1][1]);
    }

    public Matrix2x2 add(Matrix2x2 b){
        double result00 = this.getElem(0, 0) + b.getElem(0, 0);
        double result01 = this.getElem(0, 1) + b.getElem(0, 1);
        double result10 = this.getElem(1, 0) + b.getElem(1, 0);
        double result11 = this.getElem(1, 1) + b.getElem(1, 1);

        return new Matrix2x2(result00, result01, result10, result11);
    }

    public Matrix2x2 multiply(double c){
        double result00 = this.getElem(0, 0) * c;
        double result01 = this.getElem(0, 1) * c;
        double result10 = this.getElem(1, 0) * c;
        double result11 = this.getElem(1, 1) * c;

        return new Matrix2x2(result00, result01, result10, result11);
    }

    public Matrix2x2 multiply(Matrix2x2 b){
        double result00 = (this.getElem(0, 0) * b.getElem(0, 0)) + (this.getElem(0, 1) * b.getElem(1, 0));
        double result01 = (this.getElem(0, 0) * b.getElem(0, 1)) + (this.getElem(0, 1) * b.getElem(1, 1));
        double result10 = (this.getElem(1, 0) * b.getElem(0, 0)) + (this.getElem(1, 1) * b.getElem(1, 0));
        double result11 = (this.getElem(1, 0) * b.getElem(0, 1)) + (this.getElem(1, 1) * b.getElem(1, 1));
        return new Matrix2x2(result00, result01, result10, result11);
    }

    public double det(){
        double a = this.getElem(0, 0);
        double b = this.getElem(0, 1);
        double c = this.getElem(1, 0);
        double d = this.getElem(1, 1);

        return (a * d) - (b * c);
    }

    public double cofactor(int i, int j)throws IndexOutOfBoundsException{
        // Cofactor(i, j) = (-1)^(i+j) * Minor(i, j)
        if (i < 0 || i >= 2 || j < 0 || j >= 2) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        double co;
        double minor00 = this.getElem(1, 1);
        double minor01 = (-1) * this.getElem(1, 0);
        double minor10 = (-1) * this.getElem(0, 1);
        double minor11 = this.getElem(0, 0);

        if (i == 0 && j == 0){co = minor00;}
        else if (i == 0 && j == 1) {co = minor01;}
        else if (i == 1 && j == 0) {co = minor10;}
        else {co = minor11;}

        return co;
    }

    public Matrix2x2 adjoint(){
        Matrix2x2 A = new Matrix2x2(this.cofactor(0,0), this.cofactor(0,1), this.cofactor(1,0), this.cofactor(1,1));
        
        return A.transpose();
    }

    public boolean isSingular(){
        return this.det() == 0;
    }

    public Matrix2x2 inverse(){
        if (isSingular()){
            return null;
        }
        
        double invFac = 1/det();
        Matrix2x2 adjointMatrix = adjoint();

        return adjointMatrix.multiply(invFac);
    }

    public String toString(){
       
        return "[" + getElem(0, 0) + "," + getElem(0, 1) + "]\n" + //
               "[" + getElem(1, 0) + "," + getElem(1, 1) + "]";
        
    }
}
