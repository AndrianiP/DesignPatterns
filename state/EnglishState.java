package state;

import java.util.*;

public class EnglishState implements State {

    private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> eStarLyrics = new ArrayList<String>();
        eStarLyrics.add("Twinkle twinkle little star");
        eStarLyrics.add("How I wonder what you are");
        eStarLyrics.add("Up above the world so high");
        eStarLyrics.add("Like a diamond in the sky");
        eStarLyrics.add("Twinkle twinkle little start");
        eStarLyrics.add("How i wonder what you are");
        box.playSong("Twinkle Twinkle Little Star", eStarLyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> eHappyLyrics = new ArrayList<String>();
        eHappyLyrics.add("If you're happy and you know it, clap your hands.\n Clap, Clap. ");
        eHappyLyrics.add("If you're happy and you know it, clap your hands.\n Clap, Clap. ");
        eHappyLyrics.add("If you're happy and you know it, then your face will surely show it. ");
        eHappyLyrics.add("If you're happy and you know it, clap your hands. ");
        eHappyLyrics.add("Clap, Clap. If you're angry and you know it, stamp your feet.\nStomp, Stomp. ");
        eHappyLyrics.add("If you're angry and you know it, stamp your feet.\nStomp, Stomp. ");
        eHappyLyrics.add("If you're angry and you know it, then your feet will surely show it.");
        eHappyLyrics.add("If you're angry and you know it, stamp your feet.");
        eHappyLyrics.add("Stomp, Stomp. If you're happy and you know it, shout Hooray! ");
        eHappyLyrics.add("Hoo-ray! ");
        eHappyLyrics.add("If you're happy and you know it, shout Hooray!");
        eHappyLyrics.add("Hoo-ray!");
        eHappyLyrics.add("If you're happy and you know it, then your voice will surely show it");
        eHappyLyrics.add("If you're happy and you know it, shout Hooray! \n Hoo-ray!");
        box.playSong("Happy Song", eHappyLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }

}
