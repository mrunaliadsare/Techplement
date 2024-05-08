package Techplement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
	private String text;
    private List<String> options;
    private String correctAnswer;

    public Question(String text, List<String> options, String correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(text);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

}
