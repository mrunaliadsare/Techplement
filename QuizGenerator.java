package Techplement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Quiz quiz = null;

	        while (true) {
	            System.out.println("1. Create Quiz");
	            System.out.println("2. Add Question to Quiz");
	            System.out.println("3. Take Quiz");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter quiz title: ");
	                    String quizTitle = scanner.nextLine();
	                    quiz = new Quiz(quizTitle);
	                    break;
	                case 2:
	                    if (quiz != null) {
	                        System.out.print("Enter question text: ");
	                        String questionText = scanner.nextLine();
	                        System.out.print("Enter number of options: ");
	                        int numOptions = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character

	                        List<String> options = new ArrayList<>();
	                        for (int i = 1; i <= numOptions; i++) {
	                            System.out.print("Enter option " + i + ": ");
	                            options.add(scanner.nextLine());
	                        }

	                        System.out.print("Enter correct answer: ");
	                        String correctAnswer = scanner.nextLine();

	                        Question question = new Question(questionText, options, correctAnswer);
	                        quiz.addQuestion(question);
	                    } else {
	                        System.out.println("Please create a quiz first.");
	                    }
	                    break;
	                case 3:
	                    if (quiz != null) {
	                        quiz.takeQuiz();
	                    } else {
	                        System.out.println("Please create a quiz first.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting program.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }

	}

}
