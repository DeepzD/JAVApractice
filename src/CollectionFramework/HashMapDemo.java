package CollectionFramework;

import com.sun.source.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String args[])
    {
        HashMap mp=new HashMap();
        //HashMap <Integer,String> mp=new HashMap<Integer,String>();

        mp.put(100,"David");
        mp.put(101,"David");
        mp.put(102,"Mona");
        mp.put(103,"Diana");
        mp.put(104,"Rose");
        mp.put(105,"John");

        System.out.println(mp); //{100=David, 101=David, 102=Mona, 103=Diana, 104=Rose, 105=John}

        mp.put(105,"Swiss");
        System.out.println(mp);  // {100=David, 101=David, 102=Mona, 103=Diana, 104=Rose, 105=Swiss}
        System.out.println(mp.get(105)); //Swiss

        mp.remove(05); //{100=David, 101=David, 102=Mona, 103=Diana, 104=Rose, 105=Swiss}
        System.out.println(mp);

        System.out.println(mp.containsKey(101)); //true
        System.out.println(mp.containsKey(106)); // false

        System.out.println(mp.containsValue("Swiss")); //true
        System.out.println(mp.containsValue("Mona")); //true

        System.out.println(mp.isEmpty()); //false

        System.out.println(mp.keySet()); //[100, 101, 102, 103, 104, 105]
        System.out.println(mp.values()); //[David, David, Mona, Diana, Rose, Swiss]
        System.out.println(mp.entrySet()); // [100=David, 101=David, 102=Mona, 103=Diana, 104=Rose, 105=Swiss]

        for(Object e : mp.keySet())
        {
            System.out.println(e);
        }
        for(Object e : mp.values())
        {
            System.out.println(e);
        }
        for(Object e : mp.keySet())
        {
            System.out.println(e +" "+ mp.get(e));
        }

    /*    for(Map.Entry entry : mp.entrySet())
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }*/

        Set s =mp.entrySet();
        Iterator iterator=s.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
