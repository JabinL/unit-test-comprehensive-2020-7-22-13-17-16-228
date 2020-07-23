package game;

public class GuessNumber {

    private int[] answer;
    private Generator generator;

    public GuessNumber(Generator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {

        boolean isAllCorrect = true;

        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] != answer[index]) {
                isAllCorrect = false;
                break;
            }
        }
        if (isAllCorrect) {
            return "4A0B";
        }

        return "0A0B";
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
}
