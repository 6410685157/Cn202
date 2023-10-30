package Designer;

public class Queue implements QueueADT{
    private Object[] queArray;
    private int front;
    private int rear;

    //prob5
    public Queue(int maxSize){
        queArray = new Object[maxSize];
        front = 0; rear = -1;
    }
    public Queue(){ this(100); }

    public void insert(Object o) throws QueueFullException{
        if (rear == queArray.length - 1) {
            throw new QueueFullException("Queue is full.");
        } else {
            queArray[++rear] = o;
        }
    }

    public int size(){ return rear - front + 1; }

    public boolean isEmpty(){ return (size() == 0); }

    public Object remove() throws QueueEmptyException{
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        } else {
            Object removed = queArray[front];
            for (int i = 0; i < rear; i++) {
                queArray[i] = queArray[i + 1];
            }
            rear--;
            return removed;
        }
    }

    public Object front() throws QueueEmptyException{
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        } else {
            return queArray[front];
        }
    }

    //prob6
    private Object[] queArray;
    private int nItems;
    private int front;
    private int rear;

    public Queue(int maxSize){
        queArray = new Object[maxSize];
        nItems = 0; front = 0; rear = -1;
    }
    public Queue(){ this(100); }
    public void insert(Object o) throws QueueFullException{

        if (nItems == queArray.length)
            throw new QueueFullException("Queue is full");
        rear = (rear + 1) % queArray.length;
        queArray[rear] = o;
        nItems++;
    }
    public int size(){ return nItems; }
    public boolean isEmpty(){ return (nItems == 0); }
    public Object remove() throws QueueEmptyException{
        if (isEmpty())
            throw new QueueEmptyException("Queue is empty");
        Object temp = queArray[front];
        front = (front + 1) % queArray.length;
        nItems--;
        return temp;
    }
    public Object front() throws QueueEmptyException{
        if (isEmpty())
            throw new QueueEmptyException("Queue is empty");
        return queArray[front];
    }

    public void reverseQueue(){
        if (isEmpty())
            throw new QueueEmptyException("Queue is empty");
        Object[] temp = new Object[size()];
        
        for (int i = 0; i < size(); i++) {
            temp[i] = remove();
        }

        for (int i = size() - 1; i >= 0; i--) {
            insert(temp[i]);
        }
    }
    
    public void replaceInQueue(int thisOne, int thatOne){
        for (int i = front; i > rear; i++){
            if (queArray[i].equals(thisOne)){
                queArray[i] = thatOne;
            }
        }
    }
}
