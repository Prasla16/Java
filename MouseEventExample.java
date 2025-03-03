import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("MouseEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the window

        // Create JLabel to show mouse events
        JLabel label = new JLabel("Move the mouse over this area", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        label.setPreferredSize(new Dimension(300, 200));

        // Add MouseListener to handle events
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered!");
                label.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited!");
                label.setBackground(Color.LIGHT_GRAY);
            }
        });

        // Add label to frame
        frame.add(label);
        frame.setVisible(true);
    }
}
