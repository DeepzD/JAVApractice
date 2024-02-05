package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String args[])
    {
        ArrayList arrayList1 = new ArrayList();

        // add
        arrayList1.add("Camen");
        arrayList1.add(1986);
        arrayList1.add("Turky");
        arrayList1.add(65.5);
        arrayList1.add('M');
        arrayList1.add(true);

        // addAll
        ArrayList arrayList2 =new ArrayList();
        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2); //[Camen, 1986, Turky, 65.5, M, true]

        //removeAll
        arrayList2.removeAll(arrayList1);  //[]
        System.out.println(arrayList2);

        //sort()

        ArrayList arrayList3 =new ArrayList();
        arrayList3.add("Z");
        arrayList3.add("U");
        arrayList3.add("M");
        arrayList3.add("B");
        arrayList3.add("A");

        Collections.sort(arrayList3);
        System.out.println(arrayList3); // [A, B, M, U, Z]

        //Shuffle
        Collections.shuffle(arrayList3);
        System.out.println(arrayList3);
    }
}
