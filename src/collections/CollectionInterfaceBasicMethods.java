package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceBasicMethods {

    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        //Add
        for (int i = 1; i <= 10; i++) {
            collection1.add(i);
        }
        // Add all elements from collection2
        Collection<Integer> collection2 = new ArrayList<>();
        for (int i = 11; i <= 15; i++) {
            collection2.add(i);
        }
        collection1.addAll(collection2);

        //forEach
        System.out.print("collection1: ");
        for (Integer i : collection1)
            System.out.print(i + " ");
        System.out.println();

        //Iterator
        System.out.print("collection2: ");
        Iterator<Integer> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Contains
        System.out.println("\ncollection1 contains 5: " + collection1.contains(5));
        // Contains all
        System.out.println("collection1 contains collection2: " + collection1.containsAll(collection2));
        // Equals
        System.out.println("collection1 equals collection2: " + collection1.equals(collection2));
        // hashCode
        System.out.println("HashCode collection2 is " + collection2.hashCode());
        // isEmpty
        System.out.println("collection1 is empty: " + collection1.isEmpty());
        // remove
        collection1.remove(1);
        System.out.println("number 1 has been removed from the collection1");
        // remove All
        collection1.removeAll(collection2);
        System.out.println("the collection2 has been removed from the collection1");
        // clear
        collection2.clear();
        System.out.println("the collection2 has been cleared");

        // retainAll
        collection2.add(1);
        collection2.add(2);
        collection2.add(3);

        collection1.retainAll(collection2);
        System.out.println("the collection1 has been retain only collection2 elements");

        // Array
        Integer[] array = collection1.toArray(new Integer[0]);
        System.out.println("\ncollection1: " + Arrays.toString(array));
    }
}
