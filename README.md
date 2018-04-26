# Hydration
## Maggie Zhao, Sophia Xia, and Zane Wang
### APCS2 pd01

### Our plan for deque:
We decided on doubly linked nodes, as it allows for easy access to the elements before and after it *and* for the easy addition and removal of objects through nodes. Unlike array/ArrayList based implementations, one does not need to shift all the values when removing or adding something to the queue- instead, we can simply unlink two nodes, insert a node in between them, and link the previous and next pointers to the new node. Like the API specifies, using a DLLNode implementation does not have a fixed capacity, and does not provide support for indexed access to elements.
We will develop deque by first identifying which methods from the API are the most important to implement. Then we will write interface Deque and begin to write the class QQKachoo making sure the two are in compliance with each other. Then we will go down the list of methods (as seen below) and code for each one making sure to put in comments along the way. Lastly, we will test our code in search of bugs to fix and ways to robustify the code.

### The methods that we plan to implement, from most to least important/implementable... 
- [x] public int size();

- [x] Methods to view the ends of the deque
    - public E element();  and public E peek(); 
    - public E getFirst(); and public E peekFirst();
    - public E getLast();  and public E peekLast(); 
    
- [x] Methods to add
    - public boolean add(E e);
    - public void addFirst(E e); //public boolean offerFirst();
    - public void addLast(E e); //public boolean offerLast();
    
- [x] Methods to remove
    - public E remove();
    - public E removeFirst();
    - public E removeLast();
 
We chose these methods first because they seemed to be the easiest to implement, as we have gone over examples in class before, and we decided that its functionality was the most important out of the other methods.  
 
- [] Methods to find x occurence of... 
    - public boolean contains(Object o);
    - public boolean removeFirstOccurence(Object o);
    - public boolean removeLastOccurence(Object o);
    
- [] Iterators
    - public Iterator<E> iterator();
    - public Iterator<E> descendingIterator(); 
  
These two types of methods, at first glance, seem to be more complicated to implement, and we put them on the same level. The iterator methods can be, but do not have to be, used in the search method, as it simply checking each node to see if it matches the object.
  
- [] Stack methods
    - public E poll();
    - public E pollFirst();
    - public E pollLast();
    - public void push(E e); 
 
 Simply repetitions of what we have so far, except in stack form. 
    
