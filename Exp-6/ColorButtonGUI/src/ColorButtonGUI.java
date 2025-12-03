import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorButtonGUI extends JFrame {
    public static void main(String[] args) {
        ColorButtonGUI colorButtonGUI = new ColorButtonGUI();
        colorButtonGUI.setVisible(true);
    }

    public ColorButtonGUI() {
        super("ColorButtonGUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();

        JButton btnRed    = new JButton("红色");
        JButton btnYellow = new JButton("黄色");
        JButton btnGreen  = new JButton("绿色");

        btnRed.addActionListener((ActionEvent e) -> cp.setBackground(Color.RED));
        btnYellow.addActionListener((ActionEvent e) -> cp.setBackground(Color.YELLOW));
        btnGreen.addActionListener((ActionEvent e) -> cp.setBackground(Color.GREEN));

        JPanel btnPanel = new JPanel();
        btnPanel.add(btnRed);
        btnPanel.add(btnYellow);
        btnPanel.add(btnGreen);

        cp.add(btnPanel, BorderLayout.NORTH);
        setSize(400, 300);
    }
}