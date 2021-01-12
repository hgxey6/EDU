package collections;

import java.util.*;

public class MapInterfaceBasicMethods {
    public static void main(String[] args) {
        // put
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "First");
        map1.put(2, "Second");
        map1.put(3, "Third");
        map1.put(4, "Fourth");
        // put all
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(5, "Fifth");
        map2.put(6, "Sixth");
        map1.putAll(map2);
        // get values as a collection
        Collection<String> collection = map1.values();
        // get elements in map as a set(value and key)
        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        // clear
        map2.clear();
        // Contains
        System.out.println("map1 contains key = 1: " + map1.containsKey(1));
        System.out.println("map1 contains value = 'First': " + map1.containsValue("First"));


    }
}
