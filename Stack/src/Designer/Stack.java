package Designer;
public class Stack implements StackADT{
    
    // instance variables
  private int stackArray[];
  private int top;

  // constructors
  public Stack(int maxSize)
  {
    stackArray = new int[maxSize];
    top = -1;
  }
  public Stack()
  {
    stackArray = new int[100];
    top = -1; // maxSize is 100, by default
  }

  // methods
  public void push(Object o) throws StackFullException
  {
    if (size() == stackArray.length)
     throw new StackFullException("Stack is full.");
    stackArray[++top] = ((Integer) o).intValue();
  }
  public Object pop() throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top--];
  }
  public int size()
  {
    return top+1;
  }
  public boolean isEmpty()
  {
    return (size() == 0);
  }
  public Object top()
    throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top];
  }
public Stack merge(Stack A, Stack B) {
    
    Stack C = new Stack(A.size() + B.size());
    
    while (!A.isEmpty() && !B.isEmpty()) {
        int topA = (int) A.top();
        int topB = (int) B.top();

        if ((topA) - (topB) >= 0) {
            C.push(A.pop());
        } else {
            C.push(B.pop());
        }
    }

    while (!A.isEmpty()) {
        C.push(A.pop());
    }

    while (!B.isEmpty()) {
        C.push(B.pop());
    }

    return C;

}

    public Object[] multiPop(int k) throws StackEmptyException, IllegalArgumentException{
        if (k < 0){
            throw new IllegalArgumentException();
        }
        if (k == 0) {
            return new Object[0];
        }
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }

        Object[] popped = new Object[k];

        for (int i = 0; i < k; i++) {
           if (isEmpty()){
                throw new StackEmptyException("Stack is empty before popping" + k + " times.");
           }else {
                popped[i] = pop();
           }
        }
        return popped;
    }


}
