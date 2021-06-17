package state;

import java.util.*;

public class SpanishState implements State {
    private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> sStarLyrics = new ArrayList<String>();
        sStarLyrics.add("\nEstrellita, ¿dónde estás?\nQuiero verte cintilar\nen el cielo, sobre el mar.\nUn diamante de verdad.\nEstrellita, ¿dónde estás?\nQuiero verte cintilar.");
        box.playSong("Twinkle Twinkle Little Star", sStarLyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> sHappyLyrics = new ArrayList<String>();
        sHappyLyrics.add("\nSi usted esta feliz Apaluda las fuerte.  \nClap, Clap. \nSi usted esta feliz Apaluda las fuerte.  \nClap, Clap. \nSi usted esta feliz \nEn su cara se vera. \nSi usted esta feliz \nApaluda las fuerte.  \nClap, Clap. ");
        sHappyLyrics.add("\nSi usted esta feliz Dese un brazo.\nHug yourself. \nSi usted esta feliz Dese un brazo.   \nHug yourself.\nSi usted esta feliz \nEn su cara se vera. \nSi usted esta feliz \nDese un brazo.   \nHug yourself. \nBese a su cerebro...\nMeneese... \nGrite horrah...\nHagalos todos...");
        box.playSong("Happy Song", sHappyLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("Cambiando al modo de ingles");
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("Cambiando al modo de francés");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("Ya estas en el mode de español");
    }
}
