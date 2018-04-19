public class QQKachoo<D> implements Deque<D>{

    //Instance Variables
    private DLLNode<D> _front, _end;
    private int _size;

    public boolean add(D d){
	addLast(d);
	return true;
    }
    public void addLast(D d){
	
    }
}
