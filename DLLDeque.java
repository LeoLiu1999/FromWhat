import java.util.NoSuchElementException;

public class DLLDeque<T> implements Deque<T>{
    private DLLNode<T> _front, _end;
    private int _size;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

    /*
      Push to the front of the DLLDeque.
      Precondition: x is of generic type <T>
      Postcondition: x is now the first element of DLLDeque
    */	
    public void addFirst( T x){
	DLLNode newNode = new DLLNode(x, null, _front);
	if (_size == 0){
	    _front = _end = newNode;
	} else {
	    _front.setPrev(newNode);
	    _front = newNode;
	    
	}
	_size ++;
    }

    /*
      Push to the end of the DLLDeque
      Precondition: x is of generic type <T>
      Postcondition: x is now the last element of DLLDeque
     */
    public void addLast(T x){
	DLLNode newNode = new DLLNode(x, _end, null);
	if (_size == 0){
	    _front = _end = newNode;
	} else {
	    _end.setNext(newNode);
	    _end = newNode;  
	}
	_size ++;
    }

    /*
      Pop the first element of the DLLDeque
      Precondition: DLLDeque is not empty
      Postcondition: Element at front of DLLDeque is removed from DLLDeque and returned
    */
    public T removeFirst(){
	if(_size == 0){
	    throw new NoSuchElementException();
	} else {
	T output = _front.getCargo();
	_front = _front.getNext();
	_size --;
	return output;
	}
    }

    /*
      Pop the last element of the DLLDeque
      Precondition: DLLDeque is not empty
      Postcondition: Element at end of DLLDeque is removed from DLLDeque and returned
    */    
    public T removeLast(){
	if(_size == 0){
	    throw new NoSuchElementException();
	} else {
	T output = _end.getCargo();
	_end = _end.getPrev();
	_size --;
	return output;
	}
    }
    
    /*
      Peek at the first element of the DLLDeque
      Precondition: DLLDeque is not empty
      Postcondition: Element at front of DLLDeque is returned
    */
    public T getFirst(){
	if(_size == 0){
	    throw new NoSuchElementException();
	}
	return _front.getCargo();
    }
    
    /*
      Peek at the last element of the DLLDeque
      Precondition: DLLDeque is not empty
      Postcondition: Element at end of DLLDeque is returned
    */
    public T getLast(){
	if(_size == 0){
	    throw new NoSuchElementException();
	}
	return _end.getCargo();
    }

    public String toString(){
	String retStr = "";
	DLLNode tmp = _front; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	}
	return retStr;
    }

    public static void main(String[] args){
	DLLDeque ada = new DLLDeque();
	ada.addFirst("Bob");
	ada.addLast("Cal");
	ada.addLast("Tim");
	ada.addLast("Zoe");
	System.out.println(ada);
	System.out.println(ada.removeFirst());//Cal
	System.out.println(ada.removeLast());//Zoe
	System.out.println(ada.getFirst());//Bob
	System.out.println(ada.getLast());//Tim

	//More test cases in DequeTester
    }
}
