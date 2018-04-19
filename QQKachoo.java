//Team Hydration
//Roster: Zane Wang, Sophia Xia, Maggie Zhao
//APCS2 pd1
//

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
	
    }
    public D getFirst(){
	return _head.getValue();
    }
    public D getLast(){
	return _tail.getValue();
    }

    //Add Methods
    public boolean add(D d){
	
    }
    public void addFirst(D d){
	
    }
    public void addLast(D d){
	
    }

    //Remove Methods
    public D remove(){
	
    }
    public D removeFirst(){
	
    }
    public D removeLast(){
	
    }

}
