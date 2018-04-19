//Team Hydration
//Roster: Zane Wang, Sophia Xia, Maggie Zhao
//APCS2 pd1
//L02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2018-04-18

public class QQKachoo<D> implements Deque<D>{

    //Instance Variables
    private DLLNode<D> _head, _tail;
    private int _size;

    //Methods--------------------

    //Size
    public int size(){
	return _size;
    }
    
    //Accessor Methods
    public D element(){	
	return _head.getCargo();
    }
    public D getFirst(){
	return _head.getCargo();
    }
    public D getLast(){
	return _tail.getCargo();
    }

    //Add Methods
    public boolean add(D d){
	
    }
    public void addFirst(D d){
	DLLNode<D> newNode= new DLLNode<D>(d, null, _head);
	_head.setPrev(newNode);
	_head = newNode;
    }
    public void addLast(D d){
	DLLNode<D> newNode = new DLLNode<D>(d, _tail, null);
	_tail.setNext(newNode);
	_tail = newNode;
    }

    //Remove Methods
    public D remove(){
	
    }
    public D removeFirst(){
	D temp = _head.getCargo();
	_head = _head.getNext();
	_head.setPrev(null);
	return temp;
    }
    public D removeLast(){
	D temp = _tail.getCargo();
	_tail = _tail.getPrev();
	_tail.setNext(null);
	return temp;
    }

    public static void main(String[] args){
	
    }
    
}
