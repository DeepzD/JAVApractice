package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo3 {
    public static void main(String args[])
    {

        String animal[]={"Dog","Cat","Parrot"};

        ArrayList al = new ArrayList(Arrays.asList(animal));
        System.out.println(al);


    }
}
