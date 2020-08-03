package game;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {
    public static final int SIZE = 4;
    public static final int  MAX = 9;
    public static final int MIN = 0;
    @Override
    public int[] generate() {

        Set<Integer> answerSet = new HashSet<>();
        int[] answer = new int[SIZE];
        while(true) {
            int number = (int) (Math.random() * (MAX - MIN +1)) + MIN;
            answerSet.add(number);
            if(answerSet.size() == SIZE){
                break;
            }
        }
        Iterator iterator = answerSet.iterator();
        int index = 0;
        while(iterator.hasNext()){
             answer[index] = (int) iterator.next();
             index ++;
        }

        return answer;
    }
}
