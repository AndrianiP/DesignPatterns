import java.util.*;

public class Listing implements SortBehavior{
    
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;
    /**
     * 
     * @param aT pass through the name for the list
     */
    public Listing(String aT) {
        this.setTitle(aT);
        this.setSortBehavior(sortBehavior);
        items = new ArrayList<String>();
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String aT) {
        this.title = aT;
    }
    public void setSortBehavior(SortBehavior sortBehavior) {
        //TODO struggling with understanding the idea with this
    }

    public ArrayList<String> getSortedList() {
        ArrayList<String> sortedList = items;
        //TODO Call sort method i think
        return sortedList;
    }

    public ArrayList<String> getUnsortedList() {
        
        return items;
    }

    @Override
    public ArrayList<String> sort(ArrayList<String> data) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
