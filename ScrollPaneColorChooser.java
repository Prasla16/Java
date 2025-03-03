import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileViewer {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Text File Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); // Center the window

        // Create JTextArea inside JScrollPane
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Make it read-only
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Create Open Button
        JButton openButton = new JButton("Open File");

        // Panel to hold button
        JPanel panel = new JPanel();
        panel.add(openButton);

        // Add components to frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Button Click Event - Open File Chooser
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    displayFileContent(selectedFile, textArea);
                }
            }
        });

        frame.setVisible(true);
    }

    // Method to read file content and display in JTextArea
    private static void displayFileContent(File file, JTextArea textArea) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            textArea.setText(""); // Clear previous text
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
