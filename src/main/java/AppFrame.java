import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private Title title;
    private List list;

    private JButton addJob;

    AppFrame() {

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new Title();
        list = new List();

        addJob = list.getAddJob();

        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(new JPanel(), BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void addListeners() {

        addJob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                SpringLayout springLayout = new SpringLayout();
//                Job job = new Job();
            }
        });
    }
}
