package tutorials.basic;

import javax.swing.*;

public class Objects {
    public static void main(String[] args) {
        int number = 5;
        // Create a window
        JFrame window = new JFrame();
        window.setTitle("My Window");
        window.setSize(800, 600);
        window.setVisible(true);

        // Add a label to the window
        JLabel label = new JLabel();
        label.setText("My Label");

        window.add(label);

        String s = "hi";

    }
}
