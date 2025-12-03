import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomSumGUI extends JFrame {

    private static Random rand = new Random();

    public static void main(String[] args) {
        RandomSumGUI randomSumGUI = new RandomSumGUI();
        randomSumGUI.setVisible(true);
    }

    public RandomSumGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 1, 5, 5));
        setSize(250, 180);

        JTextField tfNum1 = new JTextField(15);
        JTextField tfNum2 = new JTextField(15);
        JTextField tfResult = new JTextField(15);

        JPanel p1 = new JPanel();
        p1.add(new JLabel("数字一"));
        tfNum1.setEditable(false);
        tfNum1.setHorizontalAlignment(JTextField.CENTER);
        p1.add(tfNum1);

        JPanel p2 = new JPanel();
        p2.add(new JLabel("数字二"));
        tfNum2.setEditable(false);
        tfNum2.setHorizontalAlignment(JTextField.CENTER);
        p2.add(tfNum2);

        JPanel p3 = new JPanel();
        p3.add(new JLabel("结果"));
        tfResult.setEditable(false);
        tfResult.setHorizontalAlignment(JTextField.CENTER);
        p3.add(tfResult);

        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnRandom = new JButton("随机产生");
        JButton btnCalc = new JButton("计算");
        p4.add(btnRandom);
        p4.add(btnCalc);

        btnRandom.addActionListener(e -> {
            int n1 = rand.nextInt(100);
            int n2 = rand.nextInt(100);
            tfNum1.setText(String.valueOf(n1));
            tfNum2.setText(String.valueOf(n2));
            tfResult.setText("");
        });

        btnCalc.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(tfNum1.getText());
                int n2 = Integer.parseInt(tfNum2.getText());
                tfResult.setText(String.valueOf(n1 + n2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}