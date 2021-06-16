package state;

import java.util.*;

public class EnglishState implements State {
    private MusicBox box;

    public EnglishState(MusicBox box) {

    }

    public void pressStarButton() {
        ArrayList<String> eLyrics = new ArrayList<String>();
        eLyrics.add("Twinkle twinkle little star");
        eLyrics.add("How I wonder what you are");
        eLyrics.add("Up above the world so high");
        eLyrics.add("Like a diamond in the sky");
        eLyrics.add("Twinkle twinkle little start");
        eLyrics.add("How i wonder what you are");
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
    }

    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    public void pressFrenchButton() {
        //TODO Change Music box state to french
    }

    public void pressSpanishButton() {
        //TODO Change Music box state to spanish
    }

}
