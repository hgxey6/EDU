package classSimple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        Class<?> example1 = scanner.getClass(); // get info about class
        System.out.println(example1);
        System.out.println(example1.getCanonicalName()); // get class name
        System.out.println("Class Scanner is array: " + example1.isArray()); // checks if the class is an array

        //Array
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) array[i] = i;
        Class<?> example2 = array.getClass();
        System.out.println("Object array is array: " + example2.isArray());
        System.out.println("Object array is primitive: " + example2.isPrimitive());
    }
}
