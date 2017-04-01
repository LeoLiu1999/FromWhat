/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

import java.util.NoSuchElementException;//YASSSSSS
import java.lang.RuntimeException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;
    private int _length; //I just found this to have some utility in enqueue dequeue to empty queue.

    // default constructor creates an empty queue
    public LLQueue(){ 
	_front = null;
	_end = null;
	_length = 0;
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ){
	LLNode enQ = new LLNode(enQVal, null);
	if (_length == 0){
	    _front = enQ;
	    _end = enQ;
	    _length ++;
	} else {
	_end.setNext(enQ);
	_end = _end.getNext();
	_length ++;
	}
    }//O(1)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() {
	if (_length == 0){
	    throw new NoSuchElementException();
	} else {
	    T out = _front.getValue();
	    _front = _front.getNext();
	    _length --;
	    return out;
	}
    }//O(1)


    // means of peeking at thing next in line for removal
    public T peekFront() {
	if (_length == 0){
	    throw new NoSuchElementException();
	} else {
	    T out = _front.getValue();
	    System.out.println(out);
	    _length --;
	    return out;
	}
    }//O(1)


    public boolean isEmpty() {
	return (_length == 0);
    }//O(1)

    // print each node, separated by spaces
    public String toString() {
	LLNode temp = _front;
	String out = "";
	for(int i = 0; i < _length; i ++){
	    out += " " + temp.getValue();
	    temp = temp.getNext();
	}
	return out;
    }//O(?)



    public static void main( String[] args ) {


	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 

	System.out.println( LLQueuelJ.dequeue() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class LLQueue
