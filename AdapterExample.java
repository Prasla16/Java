import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends JFrame {  // Changed to JFrame
    public AdapterExample() {
        JButton btn = new JButton("Click Me");  // Changed to JButton
        btn.setBounds(100, 100, 100, 40);  // Adjusted button size

        // Adding MouseAdapter
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse clicked");
            }
        });

        // Frame settings
        setLayout(new FlowLayout()); // Better layout
        add(btn);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Ensures the frame closes properly
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}
