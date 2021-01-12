package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListInterfaceMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zero");
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        System.out.println("index=5, value=" + arrayList.get(5));
        System.out.println("'Zero' contains in list: " + arrayList.contains("Zero"));
        System.out.println("value=Two, index=" + arrayList.indexOf("Two"));
    }
}
