package observer;

import java.util.HashMap;

public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes;

    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {

    }

    private void display() {
    
    }
}
