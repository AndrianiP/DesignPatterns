package observer;

import java.util.HashMap;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {
        numVotes = votes.get("Jim Roberts") + votes.get("Cindy Smith");
    }

    private void display() {
        System.out.println("Current Percent of Votes:");
        float jimPercent = votes.get("Jim Roberts") / (float) numVotes;
        float cindyPercent = votes.get("Cindy Smith") / (float) numVotes;
        System.out.println("Jim roberts: " + jimPercent + "%");
        System.out.println("Cindy smith: " + cindyPercent + "%");
    }
}
