package observer;

import java.util.HashMap;

public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {
        if(votes.containsKey("Jim Roberts")){
            int numVotes = votes.get("Jim Roberts")
        }
    }

    private void display() {

    }
}
