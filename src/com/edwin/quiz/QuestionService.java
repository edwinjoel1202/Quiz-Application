package com.edwin.quiz;
import java.util.Scanner;

public class QuestionService {
	Question[] questions;
	public int count;
	
	public void getQuestions() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of. questions you are going to enter : ");
		count = sc.nextInt();
		sc.nextLine();
		questions = new Question[count];
		
		for(int i = 0; i < count; i++) {
			
			questions[i] = new Question();
			
			questions[i].setId((i + 1));
			
			System.out.print("\nEnter question " + (i+1) + " :  ");
			String question = sc.nextLine();
			questions[i].setQuestion(question);
			
			System.out.print("\nEnter options for question " + (i+1) + " (seperated by spaces) : \n");
			String[] options = sc.nextLine().split(" ");
			questions[i].setOptions(options);
			
			System.out.print("\nEnter answer for question " + (i+1) + " :  ");
			String answer = sc.nextLine();
			questions[i].setAnswer(answer);				
		}
	}
	
	public String displayQuestionGetAnswer(int i) {
			int id = questions[i].getId();
			String question = questions[i].getQuestion();
			String[] options = questions[i].getOptions();
			
			System.out.print(id + ". ");
			System.out.print(question + "\n");
			System.out.println("Options :");
			for(int j = 0; j < options.length; j++) {
				System.out.println((j+1) +". " + options[j]);
			}
			
			String answer = questions[i].getAnswer();
			return answer;
	}
}
