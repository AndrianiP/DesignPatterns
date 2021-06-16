package state;

import java.util.*;

public class FrenchState implements State {
    
    public FrenchState(MusicBox box) {

    }

    public void pressStarButton() {
        ArrayList<String> fStarLyrics = new ArrayList<String>();
        fStarLyrics.add("Brille, brille, petite étoile,\n Je me demande vraiment ce que tu es!\n Au-dessus du monde si haut,\n Comme un diamant dans le ciel.\n Brille, brille, petite étoile,\n Je me demande vraiment ce que tu es!")
    }

    public void pressHappyButton() {
        ArrayList<String> fHappyLyrics = new ArrayList<String>();
        fHappyLyrics.add("\nSi tu as d' la joie au cœur\nFrappe des mains\nSi tu as d' la joie au cœur\nFrappe des mains\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nFrappe des mains.\nSi tu as d' la joie au cœur\nFrappe du pied\nSi tu as d' la joie au cœur\nFrappe du pied\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nFrappe du pied.")
    }
    public void pressEnglishButton() {
        //TODO Change Music box state to English
    }
    public void pressFrenchButton() {
        System.out.println("You are already in French mode");
    }
    public void pressSpanishButton() {
        //TODO Change Music box state to Spanish
    }
}
