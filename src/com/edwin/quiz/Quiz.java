package com.edwin.quiz;


public class Quiz {
	public static void main(String[] args) {
		QuestionService qs = new QuestionService();
		qs.getQuestions();
		qs.displayQuestions(0);
	}
}
