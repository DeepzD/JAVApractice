package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String args[])
    {
        PriorityQueue pq= new PriorityQueue();

        pq.add("A");
        pq.add("B");
        pq.add("F");
        pq.add("V");
      //  pq.offer(100);
      //  pq.offer(100);

        System.out.println(pq); //[A, B, F, V, C, X]
/*
        System.out.println(pq.element()); //A

        System.out.println(pq.peek()); //A

        pq.remove(); // A
        System.out.println(pq); //[B, C, F, V, X]

        pq.poll();
        System.out.println(pq);*/


       /* Iterator it= pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/
    }

}
