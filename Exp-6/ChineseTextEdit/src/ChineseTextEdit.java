import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChineseTextEdit extends JFrame {
    private static final String FILE_NAME = "myText.txt";
    private JTextArea textArea = new JTextArea();

    public ChineseTextEdit() {
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JScrollPane center = new JScrollPane(textArea);
        add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JButton saveBtn = new JButton("保存");
        JButton cancelBtn = new JButton("取消");
        JButton exitBtn = new JButton("退出");
        buttons.add(saveBtn);
        buttons.add(cancelBtn);
        buttons.add(exitBtn);
        add(buttons, BorderLayout.SOUTH);

        saveBtn.addActionListener(e -> saveFile());
        cancelBtn.addActionListener(e -> textArea.setText(""));
        exitBtn.addActionListener(e -> System.exit(0));

        loadFile();
    }

    private void loadFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            textArea.setText(sb.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void saveFile() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(FILE_NAME), StandardCharsets.UTF_8))) {
            bw.write(textArea.getText());
            JOptionPane.showMessageDialog(this, "已保存");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ChineseTextEdit chineseTextEdit = new ChineseTextEdit();
        chineseTextEdit.setVisible(true);
    }
}