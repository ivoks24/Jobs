import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Job extends JPanel {

    private static float GOAL = 100000;

    private final List<JLabel> labelList = new ArrayList<>();
    private JLabel jobName;

    Job(String jobName, String price, String days, String date) {

        this.setLayout(new GridBagLayout());
        this.setOpaque(false);

        this.jobName = new JLabel(jobName);
        this.jobName.setPreferredSize(new Dimension(140, 32));
//        this.jobName.setFont(new Font("", Font.BOLD, 12));
        this.jobName.setForeground(new Color(198, 215, 233));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;

        this.add(this.jobName, constraints);

        labelList.add(new JLabel(price, JLabel.RIGHT));
        labelList.add(new JLabel(setPercentGoal(Integer.parseInt(price)), JLabel.RIGHT));
        labelList.add(new JLabel(days, JLabel.RIGHT));
        labelList.add(new JLabel(date, JLabel.RIGHT));

        setFontLabels(labelList);
        addLabels(labelList, constraints);

    }

    private void setFontLabels(List<JLabel> list) {

//        UIManager.getLookAndFeelDefaults().put("defaultDimension", new Dimension(100, 40));
//        UIManager.getLookAndFeelDefaults().put("defaultColor", new Color(198, 215, 233));

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

    public String setPercentGoal(int price) {
        float percent = price * 100 / GOAL;
        String formattedFloat = new DecimalFormat("#0.00").format(percent);
        return "%" + formattedFloat;
    }

//    @Override
//    public String toString() {
//        return  jobName + ";" + price + ";" + percentGoal + ";" + days + ";" + date;
//    }
}
