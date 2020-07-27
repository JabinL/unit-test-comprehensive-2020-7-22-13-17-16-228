package game;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GuessNumber {

    private int[] answer;
    private Generator generator;

    public GuessNumber(Generator generator) {
        this.answer = generator.generate();
    }

    public String guess(int[] inputNumber) {
        int countA = countA(inputNumber);
        int countB = countB(inputNumber);
        return String.format("%dA%dB",countA,countB);
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
        int count = 0;
        for (int indexOfInputNumber = 0; indexOfInputNumber < inputNumber.length; indexOfInputNumber++) {
            for (int indexOfAnswer = 0; indexOfAnswer < answer.length; indexOfAnswer++) {
                if (inputNumber[indexOfInputNumber] == answer[indexOfAnswer]) {
                        ++count;
                }
            }
        }
        count -= countA(inputNumber);
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
            return  false;
        }
        return true;
    }

    public int[] input(){

        Scanner sc=new Scanner(System.in);

        String[] nums = null;
        nums = sc.nextLine().split(" ");
        int num[]=new int[nums.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.valueOf(nums[i]);
        }

        return num;
    }
}
