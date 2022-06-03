import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    private JButton addJob;
    private ListHead listHead;
    private ListJobs listJobs;

    List() {

        this.setBackground(new Color(57, 70, 123));
        this.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.NORTH;
        this.add(new ListHead(), constraints);

        constraints.gridy = 1;
        this.add(new ListJobs(), constraints);


        constraints.gridy = 2;
        addJob = new JButton("ADD");
        addJob.setPreferredSize(new Dimension(30, 30));
        this.add(addJob, constraints);
    }

    public JButton getAddJob() {
        return addJob;
    }

}

class ListHead extends JPanel {


    ListHead() {

        this.setBackground(new Color(40, 70, 123));
        this.add(new Job("Job description", "Salary", "Goal", "Days", "Date"));

    }
}

class ListJobs extends JPanel {

    ListJobs() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridy = 0;
        this.add(new Job("OPPO in Beijing TVC", "22000", "%3", "2","2022.06.01"), constraints);
        constraints.gridy = 1;
        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);
        constraints.gridy = 2;
        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);
//        constraints.gridy = 3;
//        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);
//        constraints.gridy = 4;
//        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);
//        constraints.gridy = 5;
//        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);
//        constraints.gridy = 6;
//        this.add(new Job("vivo x80pro plus in Shanghai", "56456", "%2.5", "1","2022.07.01"), constraints);

        System.out.println();
    }
}
