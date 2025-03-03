import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomColorChanger {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Random Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create JPanel and Button
        JPanel panel = new JPanel();
        JButton button = new JButton("Change Color");

        // Add button to panel
        panel.add(button);
        frame.add(panel);

        // Action Listener to change color
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                panel.setBackground(randomColor);
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
