package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.add("A");
        list.add("P");
        list.add("P");
        list.add("L");
        list.add("E");
        list.add("S");

        System.out.println(list); //[A, P, P, L, E, S]

        list.addFirst("An");
        System.out.println(list); //[An, A, P, P, L, E, S]

        list.addLast("are");
        System.out.println(list); //[An, A, P, P, L, E, S, are]

        System.out.println(list.removeFirst()); //An
        System.out.println(list.removeLast()); //are

        System.out.println(list.getFirst()); //A
        System.out.println(list.getLast()); //S
    }
}
