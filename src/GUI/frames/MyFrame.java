package GUI.frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("OMG"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit
        this.setResizable(false);
        this.setSize(300, 300); // sets the width and height of frame
        this.setVisible(true); // make frame visible
        this.getContentPane().setBackground(new Color(40 ,55, 71)); // sets background of frame
    }

}
