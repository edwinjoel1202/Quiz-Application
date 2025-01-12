package com.edwin.quiz;

import java.util.Scanner;

public class QuestionService {
    private Question[] questions;
    private int count;

    public int getCount() {
        return count;
    }

    public void getQuestions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of questions: ");
        count = sc.nextInt();
        sc.nextLine();  // Consume the newline left by nextInt()

        questions = new Question[count];

        // Admin enters the questions and options
        for (int i = 0; i < count; i++) {
            questions[i] = new Question();
            questions[i].setId(i + 1);

            System.out.print("\nEnter question " + (i + 1) + ": ");
            questions[i].setQuestion(sc.nextLine());

            System.out.print("Enter options for question " + (i + 1) + " (separated by spaces): ");
            String[] options = sc.nextLine().split(" ");
            questions[i].setOptions(options);

            System.out.print("Enter correct answer for question " + (i + 1) + ": ");
            questions[i].setAnswer(sc.nextLine());
        }
    }

    public String askQuestionAndGetAnswer(int i) {
        Question q = questions[i];
        System.out.println(q.getQuestion());
        for (int j = 0; j < q.getOptions().length; j++) {
            System.out.println((j + 1) + ". " + q.getOptions()[j]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: ");
        return sc.nextLine();
    }

    public boolean isAnswerCorrect(int i, String userAnswer) {
        String correctAnswer = getCorrectAnswer(i);
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public String getCorrectAnswer(int i) {
        return questions[i].getAnswer();
    }
}
