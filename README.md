#DLLDeque

##Methods

###addFirst

Push to the front of the DLLDeque.
Precondition: x is of generic type <T>
Postcondition: x is now the first element of DLLDeque

###addLast

Push to the end of the DLLDeque
Precondition: x is of generic type <T>
Postcondition: x is now the last element of DLLDeque

###removeFirst

Pop the first element of the DLLDeque
Precondition: DLLDeque is not empty
Postcondition: Element at front of DLLDeque is removed from DLLDeque and returned

###removeLast

Pop the last element of the DLLDeque
Precondition: DLLDeque is not empty
Postcondition: Element at end of DLLDeque is removed from DLLDeque and returned

###getFirst

Peek at the first element of the DLLDeque
Precondition: DLLDeque is not empty
Postcondition: Element at front of DLLDeque is returned

###getLast

Peek at the last element of the DLLDeque
Precondition: DLLDeque is not empty
Postcondition: Element at end of DLLDeque is returned

##Method selection

We decided to include the basic operations of a Deque, namely push, pop, and peek for both end of the deque.

##Why Doubly Linked Nodes

###Avoid complications

With structures such as array and ArrayList, expansions must be made to both sides of the underlying data structure, which would be linear time.

###Constant time, constantly

With doubly linked list as the underlying data structure, all methods described above runs with a worst case and average case of O(1).