package observer;

import java.util.HashMap;

public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int i = 0;

    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        i++;
        if(i == 4) {
            display();
        }
    }

    private void display() {
        System.out.println("\nCurrent Tallies");
        
        System.out.println("Jim roberts: " + votes.get("Jim Roberts"));
        System.out.println("Cindy smith: " + votes.get("Cindy Smith"));
    }
}

