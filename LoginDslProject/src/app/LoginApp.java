package app;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LoginApp {

    public static WindowBuilder window(String title, int width, int height) {
        return new WindowBuilder(title, width, height);
    }
}

class WindowBuilder {

    private final String title;
    private final int width;
    private final int height;
    private PanelBuilder panel;

    public WindowBuilder(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public PanelBuilder panel(String title) {
        this.panel = new PanelBuilder(this, title);
        return panel;
    }

    public void show() {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        if (panel != null) {
            frame.add(panel.createPanel());
        }

        frame.setVisible(true);
    }
}

class PanelBuilder {

    private final WindowBuilder window;
    private final String title;

    private final List<String[]> fields = new ArrayList<>();
    private final List<String[]> buttons = new ArrayList<>();

    public PanelBuilder(WindowBuilder window, String title) {
        this.window = window;
        this.title = title;
    }

    public PanelBuilder field(String label, String name, String type) {
        fields.add(new String[] { label, name, type });
        return this;
    }

    public PanelBuilder button(String text, String action) {
        buttons.add(new String[] { text, action });
        return this;
    }

    public void show() {
        window.show();
    }

    public JPanel createPanel() {

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createTitledBorder(title));

        JPanel fieldPanel = new JPanel(
                new GridLayout(fields.size(), 2, 5, 5));

        for (String[] field : fields) {

            fieldPanel.add(new JLabel(field[0]));

            if (field[2].equalsIgnoreCase("password")) {
                fieldPanel.add(new JPasswordField(15));
            } else {
                fieldPanel.add(new JTextField(15));
            }
        }

        JPanel buttonPanel = new JPanel(new FlowLayout());

        for (String[] button : buttons) {

            JButton jButton = new JButton(button[0]);

            String action = button[1];

            jButton.addActionListener(e ->
                    System.out.println(action + " button clicked"));

            buttonPanel.add(jButton);
        }

        mainPanel.add(fieldPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        return mainPanel;
    }
}