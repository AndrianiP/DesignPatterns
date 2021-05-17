package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    public StudentGovPoll(String school) {
        this.school = school;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(votes);
        }
    }

    public void addCandidate(String president) {
        notifyObservers();
    }

    public void enterVotes(String president, int num) {
        numUpdates = votes.get(president) + num;
        votes.put(president, numUpdates);
        notifyObservers();
    }

    public String getSchool() {
        return this.school;
    }
}
