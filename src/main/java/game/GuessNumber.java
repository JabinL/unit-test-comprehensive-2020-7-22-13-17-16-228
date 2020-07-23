package game;

public class GuessNumber {

    private int[] answer;
    private Generator generator;

    public GuessNumber(Generator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {

        return "null";
    }
}
