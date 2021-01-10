package GUI.basicGUI;

import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "hello, " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You was born in " + (2021 - age));
    }
}
