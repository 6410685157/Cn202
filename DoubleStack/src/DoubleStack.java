public class DoubleStack implements DoubleStackADT{
    
    private int[] array;
    private int topA;
    private int topB;
    
    public DoubleStack(int  maxSize) {
        array = new int[maxSize];
        topA = -1; // Initialize the top of stack A
        topB =  maxSize; // Initialize the top of stack B
    }

    public DoubleStack() {
        this(100);
    }

    public void pushA(int In) throws StackFullException{
        if (topA < topB - 1) {
            array[++topA] = In;
        } else {throw new StackFullException("Stack is full.");}
    }

    public void pushB(int In) throws StackFullException{
        if (topA < topB - 1) {
            array[--topB] = In;
        } else {throw new StackFullException("Stack is full.");}
    }
    public boolean isEmptyA(){
        return (sizeA() == 0);
    }
    public boolean isEmptyB(){
        return (sizeB() == 0);
    }

    public int sizeA(){
        return topA + 1;
    }
    
    public int sizeB(){
        // 100-50
        return array.length - topB;
    }

    public int popA() throws StackEmptyException{
        if (isEmptyA()){
            throw new StackEmptyException("Stack A is empty.");
        } else {
            return array[topA--];
        }
    }
    
    public int popB() throws StackEmptyException{
        if (isEmptyB()){
            throw new StackEmptyException("Stack A is empty.");
        } else {
            return array[topB++];
        }
    }

    public int topA() throws StackEmptyException{
        if (isEmptyA()){
            throw new StackEmptyException("Stack A is empty.");
        } else {
            return array[topA];
        }
    }
    
    public int topB() throws StackEmptyException{
        if (isEmptyB()){
            throw new StackEmptyException("Stack A is empty.");
        } else {
            return array[topB];
        }
    }
}
