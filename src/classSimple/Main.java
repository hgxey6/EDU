package classSimple;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        Class<?> cl = o.getClass();
        System.out.println(cl);
    }
}
