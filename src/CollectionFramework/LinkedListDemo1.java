package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.add("Deepika");
        list.add(86);
        list.add("October");
        list.add(10);
        list.add(true);
        list.add(65.3);

        System.out.println(list); //[Deepika, 86, October, 10, true, 65.3]

        list.remove(5);
        System.out.println(list); //[Deepika, 86, October, 10, true]

        list.add("JAVA");
        System.out.println(list.get(5)); //JAVA

        list.add(null);
        System.out.println(list); //[Deepika, 86, October, 10, true, JAVA, null]

        list.set(6,1000);
        System.out.println(list); //[Deepika, 86, October, 10, true, JAVA, 1000]

        System.out.println(list.contains("JAVA")); //true
        System.out.println(list.contains("C#")); //false

        System.out.println(list.isEmpty());  //false

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        for(Object e: list)
        {
            System.out.println(e);
        }

        Iterator iterator= list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
