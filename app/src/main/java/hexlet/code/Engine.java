package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static boolean checkAnswer(String name, String rightAnswer) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();
        int winScore = 3;

        if (playerAnswer.equals(String.valueOf(rightAnswer))) {
            System.out.println("Correct!");

            Cli.addScore();;

            if (Cli.getAnswersScore() == winScore) {
                System.out.println("Congratulations, " + name + "!");
                return false;
            }

            return true;
        } else {
            System.out.println(
                "'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                    + "'.");
            System.out.println("Let's try again, " + name + "!");

            return false;
        }
    }

}
