package Designer;

public interface QueueADT{
    public void insert(Object o);
    public Object remove() throws QueueEmptyException;
    public int size();
    public boolean isEmpty();
    public Object front() throws QueueEmptyException;
    public void reverseQueue();
}
