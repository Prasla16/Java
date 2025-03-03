import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the window

        // Set GridLayout (3 rows, 2 columns, with 10px horizontal and vertical gaps)
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Create buttons and add them to the frame
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Make frame visible
        frame.setVisible(true);
    }
}
