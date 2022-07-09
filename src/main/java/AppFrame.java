import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class AppFrame extends JFrame {

    private Title title;
    private List list;

    private JButton addJob;

    AppFrame() throws IOException {

//        UIDefaults uiDefaults = UIManager.getDefaults();
//        System.out.println(uiDefaults);

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new Title();
        list = new List();

        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);

        addJob = new JButton("ADD");
        addJob.setPreferredSize(new Dimension(50, 40));
        this.add(addJob, BorderLayout.SOUTH);

        addListeners();

        this.setVisible(true);
    }

    public void addListeners() {

        addJob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showInputDialog(AppFrame.this, "message");
            }
        });
    }
}
