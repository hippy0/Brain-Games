package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class EvenGame {

    public static void startEvenGame(String name) {
        int random = ThreadLocalRandom.current().nextInt(0, 50);
        boolean even = random % 2 == 0;

        String rightAnswer;

        System.out.println("Question: " + random);

        if (even) rightAnswer = "yes";
            else rightAnswer = "no";

        if (Engine.checkAnswer(name, rightAnswer))
            startEvenGame(name);
    }
}
