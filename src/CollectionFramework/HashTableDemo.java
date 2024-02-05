package CollectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String args[])
    {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
       // Hashtable ht=new Hashtable();
        ht.put(100,"David");
        ht.put(101,"David");
        ht.put(102,"Mona");
        ht.put(103,"Diana");
        ht.put(104,"Rose");
        ht.put(105,"John");

        System.out.println(ht); //{105=John, 104=Rose, 103=Diana, 102=Mona, 101=David, 100=David}

        System.out.println(ht.get(103)); //Diana

        ht.remove(103);
        System.out.println(ht); //{105=John, 104=Rose, 102=Mona, 101=David, 100=David}

        System.out.println(ht.containsValue("David")); //true
        System.out.println(ht.containsValue("Diana")); // false

        System.out.println(ht.isEmpty()); // false

        System.out.println(ht.keySet()); //[105, 104, 102, 101, 100]

        System.out.println(ht.values()); //[John, Rose, Mona, David, David]

        System.out.println(ht.entrySet()); //[105=John, 104=Rose, 102=Mona, 101=David, 100=David]

        for(int key:ht.keySet())
        {
            System.out.println(key);
        }

        Set s =ht.entrySet();
        Iterator iterator=s.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
