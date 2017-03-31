public interface Deque<E>{
    public void addFirst(E x);
    public void addLast(E x);
    public E removeFirst();
    public E removeLast();
    public E getFirst();
    public E getLast();
}
