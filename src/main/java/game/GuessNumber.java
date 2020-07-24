package game;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

    private int[] answer;
    private Generator generator;
    private int chances;

    public GuessNumber(Generator generator) {
        this.chances = 6;
        this.answer = generator.generateNumbers();
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
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
            System.out.println("Wrong Input，Input again");
            return false;
        }
        Set<Integer> set = new HashSet<>();
        //when
        for(int index= 0 ; index < inputNumber.length; index++){
            set.add(inputNumber[index]);
        }
        int size = set.size();
        if (size!=4){
            System.out.println(" Wrong Input，Input again");
            return  false;
        }
        return true;
    }
}
