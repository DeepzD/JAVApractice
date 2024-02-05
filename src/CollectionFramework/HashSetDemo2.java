package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

    public static void main(String args[])
    {
        //HashSet hs= new HashSet(100, (float)0.90);
        HashSet<Integer> num= new HashSet<Integer>();

        num.add(2);
        num.add(5);
        num.add(10);
        num.add(12);
        num.add(23);
        num.add(24);

        System.out.println(num); //[2, 5, 23, 24, 10, 12]

        HashSet<Integer> newnum= new HashSet<Integer>();
        newnum.addAll(num);
        System.out.println(newnum); //[2, 5, 23, 24, 10, 12]

        newnum.removeAll(num);
        System.out.println(newnum); //[]
    }
}
