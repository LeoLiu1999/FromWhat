// cuddly-pancake's update
// 2017-04-05

public class DequeTester{

    public static void main( String[] args ){
		System.out.println();

	Deque plant = new DLLDeque();
	
	for( int i = 0; i < 10; i++ ){
	    int n =  (int)(Math.random() * 2);
	    if( n == 0){
		plant.addLast("LEAF");
	    }
	    else{ plant.addFirst("STEM"); }
	}

	plant.addFirst("FLOWER");
	System.out.println("Plant: " + plant);

	System.out.println( "\nRemoving element from the end and adding it to the end... \n");
	plant.addLast(plant.removeLast());
	System.out.println( plant + "\n Did it work?");

	System.out.println( "\nRemoving element from the beginning and adding it to the beginning... \n");
	plant.addFirst(plant.removeFirst());
	System.out.println( plant + "\n Did it work?");
	
	/* --------------------------------------------------*/
	/** OLD TEST METHODS FOR EVEN MORE THOROUGH TESTING **/
	/* --------------------------------------------------*/



		Deque ship = new DLLDeque();

// ~~~~~~~~~ Tests adding to the front and end ~~~~~~~~~~~~~~
		System.out.println("\nnow adding to the front");
		ship.addFirst("James");
		ship.addFirst("Todd");
		System.out.println("\nnow adding to the end");
		ship.addLast("Smith");
		ship.addLast("William");
		System.out.println("\nnow adding to the front");
		ship.addFirst("Joe");
		ship.addLast("Ed");

// ~~~~~~~~~ Tests toString() method  ~~~~~~~~~~~~~~
		System.out.println("\nnow testing toString()...");
		System.out.println( ship ); // Should be Joe -> Todd -> James -> Smith -> William -> Ed

// ~~~~~~~~~ Tests removing from the front and end  ~~~~~~~~~~~~~~
		System.out.println("\nnow removing from the front");
		System.out.println(ship.removeFirst()); //Joe
		System.out.println(ship.removeFirst()); //Todd

		System.out.println( ship ); // Should be James -> Smith -> William -> Ed

		System.out.println(ship.removeLast()); //Ed

		System.out.println( ship ); // Should be James -> Smith -> William


// ~~~~~~~~~ Tests peeking from the front and end  ~~~~~~~~~~~~~~
		System.out.println("peek front: \n" + ship.getFirst()); //James
		System.out.println("remove front: \n" + ship.removeFirst()); //James
		System.out.println("peek tail: \n" + ship.getLast()); //William
		System.out.println("remove tail: \n" + ship.removeLast()); //William
		System.out.println(ship.removeLast());

		System.out.println( ship );




// ~~~~~~~~~ Removing from an emty Deque should return an error ~~~~~~~~~~~~~~
		System.out.println("\nRemoving from empty Deque should yield error...");
		System.out.println( ship.removeFirst() );

    }
}
