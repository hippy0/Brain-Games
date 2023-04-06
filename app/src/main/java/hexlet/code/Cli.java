package hexlet.code;

import hexlet.code.game.CalculatorGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.GcdGame;
import hexlet.code.game.PrimeGame;
import hexlet.code.game.ProgressionGame;
import java.util.Scanner;

public class Cli {

    private static int correctAnswersScore = 0;

    private static String startBrainGames() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static void startProgram() {
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("""
            1 - Greet
            2 - Even
            3 - Calculator
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit
            """);

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int gameNumber = Integer.parseInt(scanner.next());

        switch (gameNumber) {
            case 0 -> System.exit(0);
            case 1 -> startBrainGames();
            case 2 -> {
                String name = startBrainGames();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                EvenGame.startEvenGame(name);
            }
            case 3 -> {
                String name = startBrainGames();
                System.out.println("What is the result of the expression?");
                CalculatorGame.startCalculatorGame(name);
            }
            case 4 -> {
                String name = startBrainGames();
                System.out.println("Find the greatest common divisor of given numbers.");
                GcdGame.startGcdGame(name);
            }
            case 5 -> {
                String name = startBrainGames();
                System.out.println("What number is missing in the progression?");
                ProgressionGame.startProgressionGame(name);
            }
            case 6 -> {
                String name = startBrainGames();
                System.out.println(
                    "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                PrimeGame.startPrimeGame(name);
            }
            default -> System.out.println("I don't know this game, try again..");
        }

    }

    public static int getAnswersScore() {
        return correctAnswersScore;
    }

    public static void addScore() {
        correctAnswersScore += 1;
    }
}
