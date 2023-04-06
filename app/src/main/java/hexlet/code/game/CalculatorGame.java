package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class CalculatorGame {

    public static void startCalculatorGame(String name) {
        int operationsCount = 3;
        int origin = 25;
        int bound = 51;

        int operation = ThreadLocalRandom.current().nextInt(0, operationsCount);
        int numberOne = ThreadLocalRandom.current().nextInt(origin, bound);
        int numberTwo = ThreadLocalRandom.current().nextInt(0, origin);

        int rightAnswer;

        if (operation == 0) {
            rightAnswer = numberOne + numberTwo;

            System.out.println("Question: " + numberOne + " + " + numberTwo);
        } else if (operation == 1) {
            rightAnswer = numberOne - numberTwo;

            System.out.println("Question: " + numberOne + " - " + numberTwo);
        } else {
            rightAnswer = numberOne * numberTwo;

            System.out.println("Question: " + numberOne + " * " + numberTwo);
        }

        if (Engine.checkAnswer(name, String.valueOf(rightAnswer))) {
            startCalculatorGame(name);
        }

    }

}
