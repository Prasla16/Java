import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("KeyEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout()); // Better layout handling

        // Create JTextField to capture key events
        JTextField textField = new JTextField(20);
        
        // Create JLabel to display key events
        JLabel label = new JLabel("Press any key...");
        label.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add KeyListener using KeyAdapter
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        // Create panel and add components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Type something: "));
        panel.add(textField);
        panel.add(label);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
