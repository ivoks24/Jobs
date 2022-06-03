import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Title extends JPanel {

    Title() {

        this.setPreferredSize(new Dimension(600,250));
        this.setBackground(new Color(56, 64, 250));

        JLabel moneyMonth = new JLabel("moneyMonth", JLabel.CENTER);
        moneyMonth.setForeground(new Color(223, 227, 255));

        JLabel money = new JLabel("7000", JLabel.CENTER);
        money.setForeground(new Color(231, 232, 255));
        money.setFont(new Font("", Font.BOLD, 40));

        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridy = 0;
        constraints.weighty = 1;
        this.add(moneyMonth, constraints);

        constraints.gridy = 1;
        this.add(money, constraints);

        constraints.gridy = 2;
        this.add(new Statistics(), constraints);

    }
}

class Statistics extends JPanel {

    private final String[] headings = {"jobs", "income", "goal", "average"};
    private final List<JLabel> values = new ArrayList<>();

    Statistics() {

        this.setLayout(new GridLayout(2, 4, 10, 10));
        this.setOpaque(false);

        values.add(new JLabel("value1", JLabel.CENTER));
        values.add(new JLabel("value2", JLabel.CENTER));
        values.add(new JLabel("value3", JLabel.CENTER));
        values.add(new JLabel("value4", JLabel.CENTER));

        labelHeading();
        labelValue();
    }

    private void labelHeading() {

        for (String name: headings) {

            JLabel label = new JLabel(name, JLabel.CENTER);
            label.setForeground(new Color(152, 162, 255));
            label.setFont(new Font("", Font.BOLD, 15));
            label.setPreferredSize(new Dimension(130, 30));
            this.add(label);
        }
    }

    private void labelValue() {

        for (JLabel label: values) {
            label.setForeground(new Color(231, 232, 255));
            label.setFont(new Font("", Font.BOLD, 20));
            label.setPreferredSize(new Dimension(130, 30));
            this.add(label);
        }
    }

}
