package hexlet.code.game;

import hexlet.code.Engine;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProgressionGame {

    public static void startProgressionGame(String name) {
        int origin = 5;
        int bound = 11;

        int progressionLength = ThreadLocalRandom.current().nextInt(origin, bound);
        int hiddenElement = ThreadLocalRandom.current().nextInt(1, progressionLength - 1);
        int beginNumber = ThreadLocalRandom.current().nextInt(0, origin * 10);
        int step = ThreadLocalRandom.current().nextInt(1, origin + 1);
        int currentNumber = 0;
        int rightAnswer = 0;

        List<Integer> list = new ArrayList<>();

        list.add(beginNumber);

        for (int i = 1; i < progressionLength; i += 1) {
            if (i == 1) {
                currentNumber += beginNumber;
            }

            currentNumber += step;

            if (i == hiddenElement) {
                list.add(100);
                rightAnswer = currentNumber;
            } else {
                list.add(currentNumber);
            }
        }

        System.out.println("Question: " + list.toString()
            .replace("[", "")
            .replace("]", "")
            .replace(",", "")
            .replace("100", "..")
        );

        if (Engine.checkAnswer(name, String.valueOf(rightAnswer))) {
            startProgressionGame(name);
        }
    }

}
