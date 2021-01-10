package lambda;

import java.util.Comparator;

public class LambdaClass {
    public static void main(String[] args) {
        StringMethod sm = (first, second) -> {
            int difference = first.length() - second.length();
            if (difference < 0) return -1;
            else if (difference > 0) return 1;
            else return 0;
        };
        System.out.println(sm.method("hello", "world"));
    }

    @FunctionalInterface
    public interface StringMethod {
        int method(String first, String second);
    }
}
