/*
Daria Shifrina
APCS2 pd3
HW#29: Stress is the Best
2017-04-05
*/

public class DequeTester{

    public static void main(String[] args){
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n dasha the DADeque\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
	DLLDeque dasha = new DLLDeque<String>();
	dasha.addFirst("poop");
	dasha.addLast("HELLO");
	dasha.addLast("jasper");
	System.out.println(dasha); //poop->hello->jasper
	System.out.println("removing first item via pollFirst(): " + dasha.removeFirst());
	System.out.println(dasha); // hello -> jasper
	System.out.println("removing last item via pollLast():" + dasha.removeLast());
	System.out.println(dasha); // hello
	dasha.addFirst("allard");
	dasha.addFirst("i love food");
	dasha.addLast("allard");
	dasha.addLast("bob"); 
	System.out.println(dasha); // i love food -> allard -> hello -> allard -> bob
	/*	System.out.println("removing bob via removeFirstOcc: " + dasha.removeFirstOccurrence("bob"));
	System.out.println(dasha);
	System.out.println("removing last allard via removeLastOcc: " + dasha.removeLastOccurrence("allard"));
	System.out.println(dasha);
 	System.out.println("removing last madeupthing via removeLastOcc: " + dasha.removeLastOccurrence("madeupthing"));
	System.out.println(dasha);*/
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n tara the DADeque\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
	DLLDeque tara = new DLLDeque<String>();
	System.out.println(tara);
	System.out.println("removing first item via pollFirst(): " + tara.removeFirst());
	System.out.println(tara);
	System.out.println("removing last item via pollLast():" + tara.removeLast());
	System.out.println(tara);
	/*	System.out.println("removing bob via removeFirstOcc: " + tara.removeFirstOccurrence("bob"));
	System.out.println(tara);
	System.out.println("removing last allard via removeLastOcc: " + tara.removeLastOccurrence("allard"));
	System.out.println(tara);
 	System.out.println("removing last madeupthing via removeLastOcc: " + tara.removeLastOccurrence("madeupthing"));
	System.out.println(tara);*/
    }

}
