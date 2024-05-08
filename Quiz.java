package Techplement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz {
	 private String title;
	    private List<Question> questions;

	    public Quiz(String title) {
	        this.title = title;
	        this.questions = new ArrayList<>();
	    }

	    public void addQuestion(Question question) {
	        questions.add(question);
	    }

	    public void takeQuiz() {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;
	        for (Question question : questions) {
	            question.displayQuestion();
	            System.out.print("Enter your answer: ");
	            String userAnswer = scanner.nextLine();
	            if (question.checkAnswer(userAnswer)) {
	                score++;
	            }
	        }
	        System.out.println("Your score: " + score + "/" + questions.size());
	        if (score == questions.size()) {
	            System.out.println("Congratulations! You got all answers correct.");
	        } else {
	            System.out.println("You can review the correct answers to improve.");
	        }
	    }

}
