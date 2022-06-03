import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Job extends JPanel {

    private final List<JLabel> labelList = new ArrayList<>();
    private JLabel jobName;

    private static int ID = 0;

    Job(String jobName, String price, String percentGoal, String days, String date) {

        ID++;

        this.setLayout(new GridBagLayout());
        this.setOpaque(false);

        this.jobName = new JLabel(jobName);
        this.jobName.setPreferredSize(new Dimension(140, 32));
        this.jobName.setFont(new Font("", Font.BOLD, 12));
        this.jobName.setForeground(new Color(198, 215, 233));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;

        this.add(this.jobName, constraints);

        labelList.add(new JLabel(price, JLabel.RIGHT));
        labelList.add(new JLabel(percentGoal, JLabel.RIGHT));
        labelList.add(new JLabel(days, JLabel.RIGHT));
        labelList.add(new JLabel(date, JLabel.RIGHT));

        setSettings(labelList);
        addLabels(labelList, constraints);

    }

    private void setSettings(List<JLabel> list) {

        for (JLabel label : list) {
            label.setPreferredSize(new Dimension(100, 40));
            label.setFont(new Font("", Font.BOLD, 12));
            label.setForeground(new Color(198, 215, 233));
        }
    }

    private void addLabels(List<JLabel> list, GridBagConstraints constraints) {

        for (JLabel label : list) {
            this.add(label, ++constraints.gridx);
        }
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Job.ID = ID;
    }

}
