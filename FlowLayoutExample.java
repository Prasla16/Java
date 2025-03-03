import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the window

        // Set FlowLayout (Center-aligned with default horizontal and vertical gaps)
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create buttons and add them to the frame
        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Make frame visible
        frame.setVisible(true);
    }
}
