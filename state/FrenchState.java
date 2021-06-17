package state;

import java.util.*;

public class FrenchState implements State {
    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> fStarLyrics = new ArrayList<String>();
        fStarLyrics.add("Brille, brille, petite étoile,\n Je me demande vraiment ce que tu es!\n Au-dessus du monde si haut,\n Comme un diamant dans le ciel.\n Brille, brille, petite étoile,\n Je me demande vraiment ce que tu es!");
        box.playSong("Twinkle Twinkle Little Star", fStarLyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> fHappyLyrics = new ArrayList<String>();
        fHappyLyrics.add("\nSi tu as d' la joie au cœur\nFrappe des mains\nSi tu as d' la joie au cœur\nFrappe des mains\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nFrappe des mains.\nSi tu as d' la joie au cœur\nFrappe du pied\nSi tu as d' la joie au cœur\nFrappe du pied\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nSi tu as d' la joie au cœur\nFrappe du pied.");
        box.playSong("Happy Song", fHappyLyrics);
    }
    public void pressEnglishButton() {
        System.out.println("Passer en mode anglais");
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
    }
    public void pressSpanishButton() {
        System.out.println("Passer en mode espagnol");
        box.setState(box.getSpanishState());
    }
}
