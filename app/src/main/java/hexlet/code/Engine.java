package hexlet.code;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Engine {

    public static boolean checkAnswer(String name, String rightAnswer) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();

        if (playerAnswer.equals(String.valueOf(rightAnswer))) {
            System.out.println("Correct!");

            Cli.correctAnswersScore += 1;

            if (Cli.correctAnswersScore == 3) {
                System.out.println("Congratulations, " + name + "!");
                return false;
            }

            return true;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");

            return false;
        }
    }

}
