package Designer;
public interface StackADT {
    
    public void push(Object o)throws StackFullException;
    
    public Object pop() throws StackEmptyException;
    
    public int size();
    
    public boolean isEmpty();
    
    public Object top() throws StackEmptyException;

    public Stack merge(Stack A, Stack B);
}

