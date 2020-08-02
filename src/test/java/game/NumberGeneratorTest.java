package game;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGeneratorTest {

    @Test
    public void should_the_size_of_answer_is_4() {
        //given
        RandomNumberGenerator ramdonNumberGenerator = new RandomNumberGenerator();
        int[] answer = ramdonNumberGenerator.generate();
        //when
        int size = answer.length;
        //then
        assertEquals(size, 4);
    }

    @Test
    public void should_the_answer_do_not_have_repeat_number() {
        //given
        RandomNumberGenerator ramdonNumberGenerator = new RandomNumberGenerator();
        int[] answer = ramdonNumberGenerator.generate();
        Set<Integer> set = new HashSet<>();
        //when
        for (int index = 0; index < answer.length; index++) {
            set.add(answer[index]);
        }
        int size = set.size();
        //then
        assertEquals(size, 4);
    }

    @Test
    public void should_the_number_in_answer_between_0_and_9() {
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int[] answer = randomNumberGenerator.generate();
        boolean isConform = true;
        //when
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] < 0 || answer[index] > 9) {
                isConform = false;
                break;
            }
        }
        //then
        assertEquals(true, isConform);
    }

}
