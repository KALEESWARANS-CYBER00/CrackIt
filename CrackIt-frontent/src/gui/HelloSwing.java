// CrackIt-frontend/src/gui/HelloSwing.java
package gui;

import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CrackIt GUI");
        JLabel label = new JLabel("Hello from CrackIt-frontend!", SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
