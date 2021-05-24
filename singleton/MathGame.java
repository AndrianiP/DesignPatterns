package singleton;

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    private static MathGame mathGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private String[] operands = { "+", "-", "*", "/" };

    private MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    public void play() {
        String uInput;
        while (true) {
            System.out.print("(P)lay or (Q)uit: ");
            reader = new Scanner(System.in);
            uInput = reader.nextLine().toLowerCase();
            switch (uInput) {
                case "p":
                    playRound();
                    break;
                case "q":
                    System.out.println("You won " + score + " game/s! \nGoodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, you must enter P or Q");
                    break;
            }
        }
    }

    private boolean playRound() {
        int answer = 0;
        int uResponse;
        int rNumOne = rand.nextInt(100) + 1;
        int rNumTwo = rand.nextInt(100) + 1;
        int rIndex = rand.nextInt(4);
        System.out.println("Round answer to 1 decimal place");
        switch (operands[rIndex]) {
            case "+":
                answer = rNumOne + rNumTwo;
                System.out.print("\n" + rNumOne + " + " + rNumTwo + " = ");
                break;
            case "-":
                answer = rNumOne - rNumTwo;
                System.out.print("\n" + rNumOne + " - " + rNumTwo + " = ");
                break;
            case "*":
                answer = rNumOne * rNumTwo;
                System.out.print("\n" + rNumOne + " * " + rNumTwo + " = ");
                break;
            case "/":
                answer = rNumOne / rNumTwo;
                System.out.print("\n" + rNumOne + " / " + rNumTwo + " = ");
                break;
        }
        uResponse = reader.nextInt();
        if (uResponse == answer) {
            System.out.println("You got it!");
            score++;
            return true;
        } else {
            System.out.println("You got it wrong. The correct answer is: " + answer);
            return false;
        }
    }
}
