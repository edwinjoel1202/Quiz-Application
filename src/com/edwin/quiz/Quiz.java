package com.edwin.quiz;

import java.util.Scanner;


public class Quiz 
{
	public static void main(String[] args) 
	{
		QuestionService qs = new QuestionService();
		qs.getQuestions();		
		int count = qs.count;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < count; i++) {
			String qsAnswer = qs.displayQuestionGetAnswer(i);
			System.out.println("Enter your answer correctly :  ");
			String userAnswer = sc.nextLine();
			
			if(userAnswer.equalsIgnoreCase(qsAnswer)) {
				System.out.println("Answer is correct !");
			} else {
				System.err.print("Wrong answer ! Correct answer : ");
				System.out.print(qsAnswer);
			}		
		}	
		sc.close();
	}
}
