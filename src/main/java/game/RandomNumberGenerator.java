package game;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int[] generate() {
        int size = 4;
        int max = 9;
        int min = 0;
        Set<Integer> answerSet = new HashSet<>();
        int[] answer = new int[size];
        while(true) {
            int number = (int) (Math.random() * (max - min+1)) + min;
            answerSet.add(number);
            if(answerSet.size() == size){
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
