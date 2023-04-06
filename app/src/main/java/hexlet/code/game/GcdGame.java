package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class GcdGame {

    public static void startGcdGame(String name) {
        final int origin = 50;
        final int bound = 101;

        int numberOne = ThreadLocalRandom.current().nextInt(1, origin);
        int numberTwo = ThreadLocalRandom.current().nextInt(origin, bound);

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
