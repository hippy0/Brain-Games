package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class GcdGame {

    public static void startGcdGame(String name) {
        int numberOne = ThreadLocalRandom.current().nextInt(1, 50);
        int numberTwo = ThreadLocalRandom.current().nextInt(50, 101);

        int rightAnswer = getGcd(numberOne, numberTwo);

        System.out.println("Question: " + numberOne + " " + numberTwo);

        if (Engine.checkAnswer(name, String.valueOf(rightAnswer))) {
            startGcdGame(name);
        }
    }

    private static int getGcd(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }

        return getGcd(numberTwo, numberOne % numberTwo);
    }
}
