package game;

public class GuessNumber {

    private int[] answer;
    private Generator generator;

    public GuessNumber(Generator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {

        boolean isAllCorrect = true;

        for(int index = 0; index < inputNumber.length; index++){
            if(inputNumber[index]!= answer[index]){
                isAllCorrect = false;
                break;
            }
        }
        if(isAllCorrect){
            return "4A0B";
        }

        return "0A0B";
    }
}
