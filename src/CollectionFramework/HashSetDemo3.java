package CollectionFramework;

import java.util.HashSet;

public class HashSetDemo3 {

    public static void main(String args[])
    {
        //HashSet hs= new HashSet(100, (float)0.90);
        HashSet<Integer> numset1= new HashSet<Integer>();

        numset1.add(2);
        numset1.add(5);
        numset1.add(10);
        numset1.add(12);
        numset1.add(23);
        numset1.add(24);

        System.out.println(numset1); //[2, 5, 23, 24, 10, 12]

        HashSet<Integer> numset2= new HashSet<Integer>();
        numset2.add(5);
        numset2.add(23);
        numset2.add(24);

        System.out.println(numset2); //[5, 23, 24]

     //   numset1.addAll(numset2);
      //  System.out.println(numset1); //[2, 5, 23, 24, 10, 12]

      //  numset1.retainAll(numset2);
      //  System.out.println(numset1); //[5, 23, 24]

     //   numset1.removeAll(numset2);
     //   System.out.println(numset1); //[2,10,12]

         numset1.containsAll(numset2);
        System.out.println(numset1); //[2, 5, 23, 24, 10, 12]
    }
}
