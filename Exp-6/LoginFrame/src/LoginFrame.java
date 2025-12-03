import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private final JComboBox<String> selBox = new JComboBox<>();
    private final JTextField username = new JTextField(15);
    private final JPasswordField password = new JPasswordField(15);
    private final JButton loginBtn = new JButton("确认");
    private final JButton resetBtn = new JButton("取消");
    private final JButton exitBtn = new JButton("退出");

    public LoginFrame() {
        super("用户登录");
        setSize(230, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel selPanel = new JPanel();
        selPanel.add(new JLabel("用户类型:"));
        selBox.addItem("学生用户");
        selBox.addItem("教师用户");
        selBox.setSelectedIndex(0);
        selPanel.add(selBox);
        add(selPanel, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2, 1));

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel("用户名:"));
        username.setHorizontalAlignment(JTextField.CENTER);
        usernamePanel.add(username);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("密  码:"));
        password.setHorizontalAlignment(JPasswordField.CENTER);
        passwordPanel.add(password);

        center.add(usernamePanel);
        center.add(passwordPanel);
        add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttons.add(loginBtn);
        buttons.add(resetBtn);
        buttons.add(exitBtn);
        add(buttons, BorderLayout.SOUTH);

        loginBtn.addActionListener(e -> doLogin());
        resetBtn.addActionListener(e -> doReset());
        exitBtn.addActionListener(e -> System.exit(0));

    }

    private void doLogin() {
        String user = username.getText().trim();
        String pass = new String(password.getPassword()).trim();
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "用户名不可为空");
            return;
        }
        boolean isTeacher = selBox.getSelectedIndex() == 1;
        boolean ok;
        if (isTeacher) {
            ok = user.equals("teacher") && pass.equals("teacher");
        } else {
            ok = user.equals("student") && pass.equals("student");
        }
        if (ok) {
            String msg = isTeacher ? "教师用户登录成功" : "学生用户登录成功";
            JOptionPane.showMessageDialog(this, msg);
        } else {
            JOptionPane.showMessageDialog(this, "用户名不存在或者密码不正确");
        }
    }

    private void doReset() {
        username.setText("");
        password.setText("");
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}