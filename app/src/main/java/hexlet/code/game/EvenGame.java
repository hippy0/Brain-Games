package hexlet.code.game;

import hexlet.code.Cli;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EvenGame {

    public static void startEvenGame(String name) {
        if (Cli.correctAnswersScore == 3) {
            System.out.println("Congratulations, " + name + "!");
            return;
        }

        int random = ThreadLocalRandom.current().nextInt(0, 50);
        boolean rightAnswer = random % 2 == 0;

        System.out.println("Question: " + random);

        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();

        if (playerAnswer.equals("yes")) {
            if (rightAnswer) {
                System.out.println("Correct!");

                Cli.correctAnswersScore += 1;
                startEvenGame(name);
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
            }
        } else {
            if (rightAnswer) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
            } else {
                System.out.println("Correct!");

                Cli.correctAnswersScore += 1;

                startEvenGame(name);
            }
        }
    }
}
