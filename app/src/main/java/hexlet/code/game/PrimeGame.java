package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeGame {

    public static void startPrimeGame(String name) {
        final int bound = 51;

        int random = ThreadLocalRandom.current().nextInt(0, bound);
        boolean prime = isPrime(random);

        String rightAnswer;

        System.out.println("Question: " + random);

        if (prime) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }

        if (Engine.checkAnswer(name, rightAnswer)) {
            startPrimeGame(name);
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
