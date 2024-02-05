package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String args[])
    {
        ArrayList arrayList = new ArrayList();

        // add
        arrayList.add("Deepika");
        arrayList.add(86);
        arrayList.add("Palugama");
        arrayList.add(65.5);
        arrayList.add('F');
        arrayList.add(true);

        System.out.println(arrayList);

        //size()
        System.out.println(arrayList.size());

        //remove()
        arrayList.remove(4);
        System.out.println(arrayList);

        //set()
        arrayList.set(4,"Female");
        System.out.println(arrayList);

        //contains()
        System.out.println(arrayList.contains("Dam"));

        //isEmpty()
        System.out.println(arrayList.isEmpty());

        //add(index,object)
        arrayList.add(5,"SLIIT");
        System.out.println(arrayList);

        //get(index)
        System.out.println(arrayList.get(1));

        //forLoop-1
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

       // forloop-2
        for(Object e:arrayList)
        {
            System.out.print(e +" , ");
        }

        //Iterator
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()); //printing the element move to the next
        }

    }
}
