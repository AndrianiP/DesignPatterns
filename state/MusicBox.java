package state;

import java.util.*;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox(){

    }

    public void pressStarButton() {

    }

    public void pressEnglishButton() {

    }

    public void pressHappyButton() {

    }
    public void pressFrenchButton() {
        
    }
    public void pressSpanishButton() {
        
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return englishState;
    }
    public State getFrenchState() {
        return frenchState;
    }
    public State getSpanishState() {
        return spanishState;
    }
    public ArrayList<String> playSong(String songName, ArrayList<String> lyrics) {

        return lyrics;
    }
}
