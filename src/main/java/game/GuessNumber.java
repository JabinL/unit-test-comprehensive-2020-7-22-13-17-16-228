package game;

import java.util.*;

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
        ArrayList<Integer> answerList = new ArrayList<>();
        for( int answer: this.answer){
            answerList.add(answer);
        }
        int count = 0;
        for( int number : inputNumber){
            if(answerList.contains(number)){
                count++;
            }
        }
        return count-countA(inputNumber);
    }

    public boolean validInputNumber(int[] inputNumber) {
        if(inputNumber.length<4 || inputNumber.length>4)
        {
            System.out.println();
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
