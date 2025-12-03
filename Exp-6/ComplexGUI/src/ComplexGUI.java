import javax.swing.*;
import java.awt.*;

public class ComplexGUI extends JFrame {
    public ComplexGUI() {
        super("Complex GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 220);

        // name panel
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("当前打印机: Canon LBP3410/3460"));

        // button panel
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4, 1, 15, 15));
        JButton[] buttons = {
                new JButton("确定"),
                new JButton("取消"),
                new JButton("设置..."),
                new JButton("帮助")
        };
        int maxWidth = 0;
        for (JButton item : buttons) btnPanel.add(item);

        // print setting panel
        JPanel printSettingPanel = new JPanel();
        printSettingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        printSettingPanel.add(new JLabel("打印质量: "));
        JComboBox<String> comboBox = new JComboBox<>();
        String[] comboBoxItem = {"高", "中", "低"};
        for (String item : comboBoxItem) comboBox.addItem(item);
        comboBox.setSelectedIndex(0);
        printSettingPanel.add(comboBox);
        printSettingPanel.add(new JCheckBox("打印到文件"));

        // content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(3, 1, 15, 15));
        contentPanel.add(new JCheckBox("图像"));
        contentPanel.add(new JCheckBox("文本", true));
        contentPanel.add(new JCheckBox("编码"));

        // area panel
        JPanel areaPanel = new JPanel();
        areaPanel.setLayout(new GridLayout(3, 1, 15, 15));
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton[] radioButtons = {
                new JRadioButton("所选区域"),
                new JRadioButton("全部", true),
                new JRadioButton("Applet"),
        };
        for (JRadioButton item : radioButtons) {
            buttonGroup.add(item);
            areaPanel.add(item);
        }

        // print panel
        JPanel printPanel = new JPanel();
        printPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        printPanel.setBackground(Color.white);
        printPanel.add(contentPanel);
        printPanel.add(areaPanel);

        // printer panel
        JPanel printerPanel = new JPanel();
        printerPanel.setLayout(new BorderLayout());
        printerPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        printerPanel.add(namePanel, BorderLayout.NORTH);
        printerPanel.add(printPanel, BorderLayout.CENTER);
        printerPanel.add(printSettingPanel, BorderLayout.SOUTH);

        // top panel
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        top.add(printerPanel, BorderLayout.WEST);
        top.add(btnPanel, BorderLayout.CENTER);

        setContentPane(top);
    }

    static public void main() {
        ComplexGUI frame = new ComplexGUI();
        frame.setVisible(true);
    }
}
