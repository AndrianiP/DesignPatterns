package state;

import java.util.*;

public class SpanishState implements State {

    public SpanishState(MusicBox box) {

    }

    public void pressStarButton() {
        ArrayList<String> sStarLyrics = new ArrayList<String>();
        sStarLyrics.add("\nEstrellita, ¿dónde estás?\nQuiero verte cintilar\nen el cielo, sobre el mar.\nUn diamante de verdad.\nEstrellita, ¿dónde estás?\nQuiero verte cintilar.")
    }

    public void pressHappyButton() {
        ArrayList<String> sHappyLyrics = new ArrayList<String>();
        sHappyLyrics.add("\nSi usted esta feliz Apaluda las fuerte.  \nClap, Clap. \nSi usted esta feliz Apaluda las fuerte.  \nClap, Clap. \nSi usted esta feliz \nEn su cara se vera. \nSi usted esta feliz \nApaluda las fuerte.  \nClap, Clap. ")
        sHappyLyrics.add("\nSi usted esta feliz Dese un brazo.\nHug yourself. \nSi usted esta feliz Dese un brazo.   \nHug yourself.\nSi usted esta feliz \nEn su cara se vera. \nSi usted esta feliz \nDese un brazo.   \nHug yourself. \nBese a su cerebro...\nMeneese... \nGrite horrah...\nHagalos todos...")
    }

    public void pressEnglishButton() {
        // TODO Change Music box state to english
    }

    public void pressFrenchButton() {
        // TODO Change Music box state to french
    }

    public void pressSpanishButton() {
        System.out.println("You are already in Spanish mode");
    }
}
