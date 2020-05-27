package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author David Bálik
 */
public class Test {

    //data
    private final int SUCCESS__POINT_LIMIT = 43;
    private final int NUMBER_OF_QUESTIONS = 25;
    private int points;
    private boolean successful;
    private Question[] questions;
    
    /**
     * Creates a new instance of Test
     * @throws FileNotFoundException if the account file has not been found
     */
    public Test() throws FileNotFoundException {
        points = 0;
        questions = new Question[NUMBER_OF_QUESTIONS];
        loadQuestions();
    }

    private void loadQuestions() throws FileNotFoundException {
        ArrayList<Question> allQuestions = loadAllQuestions();
        chooseRandomQuestions(allQuestions);

    }
    /**
     * nacteni vsech otazek ze souboru questions.txt
     * @return
     * @throws FileNotFoundException 
     */
    private ArrayList<Question> loadAllQuestions() throws FileNotFoundException {
        ArrayList<Question> allQuestions = new ArrayList();
        File questionsFile = new File("textovesoubory\\questions.txt");
        Scanner in = new Scanner(questionsFile);

        String question;
        int questionPoints;
        String answerA, answerB, answerC, correctAnswer;

        while (in.hasNext()) {
            question = in.nextLine();
            questionPoints = Integer.parseInt(in.nextLine());
            answerA = in.nextLine();
            answerB = in.nextLine();
            answerC = in.nextLine();
            correctAnswer = in.nextLine();       
            allQuestions.add(new Question(question,questionPoints,answerA,answerB,answerC,correctAnswer)); 
        }
        return allQuestions;
    }
    /**
     * this method choose random question
     * @param allQuestions 
     */
    private void chooseRandomQuestions(ArrayList<Question> allQuestions) {
        Collections.shuffle(allQuestions);
        questions = allQuestions.subList(0, questions.length).toArray(new Question[questions.length]);
    }

    public int getSUCCESS__POINT_LIMIT() {
        return SUCCESS__POINT_LIMIT;
    }

    public int getNUMBER_OF_QUESTIONS() {
        return NUMBER_OF_QUESTIONS;
    }

    public int getPoints() {
        return points;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public Question[] getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return "Test" + (successful ? "uspesny" : "neuspesny") + " " + "ziskal/a jste: " + points;

    }
    
    
    
    

}
