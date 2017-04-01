import java.util.NoSuchElementException;

public class DLLDeque<T> implements Deque<T>{
    private DLLNode<T> _front, _end;
    private int _size;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

    public void addFirst( T x){
	DLLNode newNode = new DLLNode(x, null, _front);
	if (_size == 0){
	    _front = _end = newNode;
	} else {
	    _front = newNode;
	}
	_size ++;
    }

    public void addLast(T x){
	DLLNode newNode = new DLLNode(x, _end, null);
	if (_size == 0){
	    _front = _end = newNode;
	} else {
	    _end = newNode;
	}
	_size ++;
    }
    
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
    
    public T getFirst(){
	return _front.getCargo();
    }
    
    public T getLast(){
	return _end.getCargo();
    }

    public static void main(String[] args){
	/* Make the magic happen team */
    }
}
