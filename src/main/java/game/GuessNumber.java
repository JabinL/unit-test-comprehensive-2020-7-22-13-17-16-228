package game;

import java.util.*;
import java.util.stream.Collectors;

public class GuessNumber {

    private int[] answer;
    private NumberGenerator generator;

    public GuessNumber(NumberGenerator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {
        int countA = countA(inputNumber);
        int countB = countB(inputNumber);
        return String.format("%dA%dB", countA, countB);
    }

    public int countA(int[] inputNumber) {
        int count = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (answer[index] == inputNumber[index]) {
                ++count;
            }
        }

        return count;
    }

    public int countB(int[] inputNumber) {
        ArrayList<Integer> answerList = (ArrayList<Integer>) Arrays.stream(this.answer).boxed().collect(Collectors.toList());
        int count = 0;
        for (int number : inputNumber) {
            if (answerList.contains(number)) {
                count++;
            }
        }
        return count - countA(inputNumber);
    }

    public boolean validInputNumber(int[] inputNumber) {

        if (validLengthOfInputNumber(inputNumber) && validRangeOfInputNumber(inputNumber) && isNotHaveReapeatNumberInInputNumber(inputNumber)) {
            return true;
        }
        System.out.println("Wrong Input，Input again");
        return false;
    }

    public boolean validLengthOfInputNumber(int[] inputNumber) {
        if (inputNumber.length < 4 || inputNumber.length > 4) {
            return false;
        }
        return true;
    }

    public boolean isNotHaveReapeatNumberInInputNumber(int[] inputNumber) {
        Set<Integer> set = new HashSet<>();

        for (int index = 0; index < inputNumber.length; index++) {
            set.add(inputNumber[index]);
        }
        int size = set.size();
        if (size != 4) {
            return false;
        }
        return true;
    }

    public boolean validRangeOfInputNumber(int[] inputNumber) {
        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] < 0 || inputNumber[index] > 9) {
                return false;
            }
        }
        return true;
    }

    public int[] input() {

        Scanner sc = new Scanner(System.in);

        String[] nums = null;
        nums = sc.nextLine().split(" ");
        int num[] = new int[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.valueOf(nums[i]);
        }

        return num;
    }
}
