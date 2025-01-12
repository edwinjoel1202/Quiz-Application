package com.edwin.quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.getQuestions();  // Collect questions from the admin
        Scanner sc = new Scanner(System.in);
        int score = 0;

        // Iterate through all the questions
        for (int i = 0; i < qs.getCount(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            String userAnswer = qs.askQuestionAndGetAnswer(i);
            
            if (qs.isAnswerCorrect(i, userAnswer)) {
                System.out.println("Correct answer!");
                score++;  // Increase score for correct answer
            } else {
                System.err.print("Incorrect answer. ");
                System.out.print("Correct answer is: " + qs.getCorrectAnswer(i));
            }
        }
        
        System.out.println();
        System.out.println("\nYour total score is: " + score + " out of " + qs.getCount());
        sc.close();
    }
}
