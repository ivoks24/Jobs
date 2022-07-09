import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class List extends JPanel {

    final private String jobsFile = "data/jobs.txt";
    public static ArrayList<Job> jobList = new ArrayList<>();

    List() throws IOException {

        readFile();
        this.setBackground(new Color(57, 70, 123));
        this.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 0;
        this.add(new ListJobs(), constraints);
    }

    private void readFile() throws IOException {

        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get(jobsFile));
        for (String line : lines) {
            String[] fragments= line.split(";");
            jobList.add(new Job(fragments[0], fragments[1], fragments[2], fragments[3]));
        }
    }

}

class ListJobs extends JPanel {

    ListJobs() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 0;

        List.jobList.forEach(j -> {
            constraints.gridy += 1;
            this.add(j, constraints);
        });

    }
}
