package state;

import java.util.*;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);

        state = englishState;
    }

    public void pressStarButton() {
        state.pressStarButton();
    }

    public void pressEnglishButton() {
        state.pressEnglishButton();
        setState(englishState);
        selectOptions();

    }

    public void pressHappyButton() {
        state.pressHappyButton();
        selectOptions();
    }

    public void pressFrenchButton() {
        state.pressFrenchButton();
        setState(frenchState);
        selectOptions();
    }

    public void pressSpanishButton() {
        state.pressSpanishButton();
        setState(spanishState);
        selectOptions();
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

    public void playSong(String songName, ArrayList<String> lyrics) {
        for (int i = 0; i < lyrics.size(); i++) {
            System.out.println(lyrics.get(i));
        }
        selectOptions();
    }

    public void selectOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (E)nglish, (F)rench, (S)panish, (T)winkle, (H)appy, Or (Q)uit: ");
        String userInput = scanner.next();
        switch (userInput.toLowerCase()) {
            case "e":
                pressEnglishButton();
                break;
            case "f":
                pressFrenchButton();
                break;
            case "s":
                pressSpanishButton();
                break;
            case "t":
                pressStarButton();
                break;
            case "h":
                pressHappyButton();
                break;

            case "q":
                System.out.println("Goodbye");
                System.exit(0);
                break;
            default:

                break;
        }
    }
}
