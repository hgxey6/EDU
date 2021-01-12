package generics;

public class Main {
    public static void main(String[] args) {
        Entry<Integer, String> list = new Entry<>(4, "GREEN");
        System.out.println(list.getKey());
        System.out.println(list.getValue());
        System.out.println(list.findByKey(5));
    }
}
