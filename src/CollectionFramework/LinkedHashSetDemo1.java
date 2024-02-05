package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String args[])
    {
        LinkedHashSet hsList = new LinkedHashSet();

        hsList.add("Deepika");
        hsList.add(86);
        hsList.add("JAVA");
        hsList.add("Cambio");
        hsList.add(20.23);
        hsList.add(15);
        hsList.add(true);
        hsList.add(null);

        System.out.println(hsList); //[Deepika, 86, JAVA, Cambio, 20.23, 15, true, null]
    }
}
