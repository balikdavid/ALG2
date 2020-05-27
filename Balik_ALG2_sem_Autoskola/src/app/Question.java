package app;

/**
 *
 * @author David Bálik
 */
public class Question {
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String correctAnswer;
    private int points;

    /**
     * Creates a new instance of Question
     * @param question String - question
     * @param points int - number of points for correct answer
     * @param answerA String - possible answer A
     * @param answerB String - possible answer B 
     * @param answerC String - possible answer C
     * @param correctAnswer String - correct answer (String with value a, b, or c) 
     */
    public Question(String question, int points, String answerA, String answerB, String answerC, String correctAnswer) {
        this.question = question;
        this.points = points;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Getter to String question
     * @return String - the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Getter to answer - a
     * @return String - answer a
     */
    public String getAnswerA() {
        return answerA;
    }

    /**
     * Getter to answer - b
     * @return String - answer b
     */
    public String getAnswerB() {
        return answerB;
    }

    /**
     * Getter to answer - c
     * @return String - answer c
     */
    public String getAnswerC() {
        return answerC;
    }

    /**
     * Getter to correct answer - a
     * @return String - correct answer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     *
     * @return
     */
    public int getPoints() {
        return points;
    }   
    
    /**
     * Returns a text representation of instance question with questiona and possible answers
     * @return String representation of Question
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(question).append("\n");
        sb.append("a) ").append(answerA).append("\n");
        sb.append("b) ").append(answerB).append("\n");
        sb.append("c) ").append(answerC).append("\n");
        return sb.toString();
    }
}