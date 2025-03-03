import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("ActionEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the window

        // Create panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create button
        JButton button = new JButton("Click Me");
        panel.add(button);

        // Create label to display message
        JLabel label = new JLabel("Press the button to see a message.");
        panel.add(label);

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}

