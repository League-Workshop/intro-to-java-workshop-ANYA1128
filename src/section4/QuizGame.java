package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("What is life?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("LIFE")) {
			score++;
		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		answer = JOptionPane.showInputDialog("What is 5+2?");
		if (answer.equals("7")) {
			score++;
		}
		answer = JOptionPane.showInputDialog("What is 5 to the power of 3?");
		if (answer.equals("125")) {
			score++;
		}
		answer = JOptionPane.showInputDialog("What is 5+2?");
		if (answer.equals("7")) {
			score++;
		}

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, score);
	}
}
