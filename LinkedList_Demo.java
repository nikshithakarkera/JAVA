
import java.util.*;

public class LinkedList_Demo {
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<Character>();
        //Add elements
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original Contents:"+ll);

        //Demonstrate allLast() and addFirst()
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\nAfter calls to addFirst() and addLast():");
        System.out.println("Contents:"+ll);

        //Add elements at an index
        ll.add(2, 'b');
        ll.add(2, 'c');
        System.out.println("After Insertion");
        System.out.println("Contents:"+ll);
        System.out.println("Here are first and last elements :"+ll.getFirst()+" "+ll.getLast());
        List<Character>sub=ll.subList(2, 5);
        System.out.println("\n Contents of sublist view:"+sub);

        LinkedList<Character>ll2=new LinkedList<Character>(sub);

        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll:");
        System.out.println("Contents:"+ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("\nAfter deleting first and last elements:");
        System.out.println("Contents:"+ll);

        ll.set(0, Character.toLowerCase(ll.get(0)));
        System.out.println("\nAfter change:"+ll);

        // ll.contains(0);
        // System.out.println("Contents:"+ll);

        ll.addFirst('A');
        System.out.println("Added A to first:"+ll);

        ll.containsAll(ll2);
        System.out.println("Contents:"+ll);

        ll.hashCode();
        System.out.println("Contents hashCode :"+ll);

        ll2.contains(2);
        System.out.println("Contents of ll2 :"+ll);

        ll2.add(2, 'c');
        System.out.println("Contents of ll2 :"+ll2);
    }
}