package game;

public class GuessNumber {

    private int[] answer;
    private Generator generator;

    public GuessNumber(Generator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {
        int countNumberWithCorrectPisiton = countNumberWithCorrectPisiton(inputNumber);
        int countNumberOnlyWithCorrectAnswer = countNumberOnlyWithCorrectAnswer(inputNumber);
        return String.format("%dA%dB",countNumberWithCorrectPisiton,countNumberOnlyWithCorrectAnswer);
    }

    public int countNumberWithCorrectPisiton(int[] inputNumber) {
        int count = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (answer[index] == inputNumber[index]) {
                ++count;
            }
        }

        return count;
    }

    public int countNumberOnlyWithCorrectAnswer(int[] inputNumber) {
        int count = 0;
        for (int indexOfInputNumber = 0; indexOfInputNumber < inputNumber.length; indexOfInputNumber++) {
            for (int indexOfAnswer = 0; indexOfAnswer < answer.length; indexOfAnswer++) {
                if (inputNumber[indexOfInputNumber] == answer[indexOfAnswer]) {
                        ++count;
                }
            }
        }
        count -= countNumberWithCorrectPisiton(inputNumber);
        return count;
    }

    public boolean validInputNumber(int[] inputNumber) {
        if(inputNumber.length<4 || inputNumber.length>4)
        {
            System.out.println();
            return false;
        }

        return true;
    }
}
