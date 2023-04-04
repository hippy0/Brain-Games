package hexlet.code.game;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class CalculatorGame {

    public static void startCalculatorGame(String name) {
        int operation = ThreadLocalRandom.current().nextInt(0, 3);
        int numberOne = ThreadLocalRandom.current().nextInt(25, 51);
        int numberTwo = ThreadLocalRandom.current().nextInt(0, 25);

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
