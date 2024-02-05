package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

    public static void main(String args[])
    {
        //HashSet hs= new HashSet(100, (float)0.90);
        HashSet hs= new HashSet();

        hs.add("Deepika");
        hs.add(86);
        hs.add("JAVA");
        hs.add("Cambio");
        hs.add(20.23);
        hs.add(15);
        hs.add(true);
        hs.add(null);

       // System.out.println(hs); //[JAVA, 20.23, null, 15, Cambio, Deepika, true, 86]

        hs.remove(20.23);
        System.out.println(hs); //[JAVA, null, 86, Deepika, Cambio, 15, true]

        System.out.println(hs.contains("JAVA"));  //true

        System.out.println(hs.isEmpty()); // false

        for(Object e: hs)
        {
            System.out.println(e);
        }

        Iterator it= hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
