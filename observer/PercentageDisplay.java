package observer;

import java.util.HashMap;
import java.text.DecimalFormat;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;
    private int i = 0;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {
        numVotes = votes.get("Jim Roberts") + votes.get("Cindy Smith");
        this.votes = votes;
        i++;
        if(i == 4) {
            display();
        }
    }

    private void display() {
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("\nCurrent Percent of Votes:");
        float jimPercent = (votes.get("Jim Roberts") / (float) numVotes) * 100;
        float cindyPercent = (votes.get("Cindy Smith") / (float) numVotes) * 100;
        System.out.println("Jim roberts: " + df.format(jimPercent) + "%");
        System.out.println("Cindy smith: " + df.format(cindyPercent) + "%");
    }
}
