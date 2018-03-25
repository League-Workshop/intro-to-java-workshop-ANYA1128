package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		int score = 0;
		
		String answer = JOptionPane.showInputDialog("What is life? "
				+ " a. poop"
				+ " b. very poopy"
				+ " c. LIFE"
				+ " d. all of the above ");

		if (answer.equals("c")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = c. LIFE");
		}

		answer = JOptionPane.showInputDialog("What is 5+2?"
				+ " a. Why are you asking me?"
				+ " b. 52"
				+ " c. 9"
				+ " d. 7");
		if (answer.equals("d")) {
			score++;

		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = d. 7");
		}

		answer = JOptionPane.showInputDialog("What is 5 to the power of 3?"
				+ " a. 15"
				+ " b. 125"
				+ " c. 0"
				+ " d. I DON'T WANT TO DO MATH!!");
		if (answer.equals("b")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = b. 125");
		}

		answer = JOptionPane.showInputDialog("What is 50+50"
				+ " a. 100"
				+ " b. 5050"
				+ " c. 0"
				+ " d. 2500");
		if (answer.equals("a")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = a. 100");
		}

		
		answer = JOptionPane.showInputDialog("What am I?"
				+ " a. Computer"
				+ " b. A Thing That can Multitask"
				+ " c. A Machine That Can type Back  To You"
				+ " d. all of the above");
				
		if (answer.equals("d")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = d. all of the above");
		}


		answer = JOptionPane.showInputDialog("Who was the second president of the United States of America?"
				+ " a. IDK"
				+ " b. Obama"
				+ " c. Donald Duck"
				+ " d. John Adams");
		if (answer.equals("d")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = d. John Adams");
		}

		answer = JOptionPane.showInputDialog("What is the capital of Venusvela?"
				+ " a. The United States of America"
				+ " b. A place"
				+ " c. Caracas"
				+ " d. Alabama");
		if (answer.equals("c")) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Correct Answer = c. Caracas");
		}
		JOptionPane.showMessageDialog(null, score);
	}
}
