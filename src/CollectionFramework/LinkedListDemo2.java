package CollectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.add("A");
        list.add("P");
        list.add("P");
        list.add("L");
        list.add("E");
        list.add("S");

        LinkedList newlist=new LinkedList();
        newlist.addAll(list);
        System.out.println(newlist); //[A, P, P, L, E, S]

        newlist.removeAll(list);
        System.out.println(newlist); // []
        System.out.println(list); // [A, P, P, L, E, S]

        Collections.sort(list);
        System.out.println(list); //[A, E, L, P, P, S]

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list); //[S, P, P, L, E, A]

        Collections.shuffle(list);
        System.out.println(list); //[L, P, S, P, A, E]
    }
}
