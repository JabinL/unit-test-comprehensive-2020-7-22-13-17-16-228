package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGeneratorTest {

    @Test
    public void should_the_size_of_answer_is_4(){
        //given
        NumberGenerator numberGenerator = new NumberGenerator();
        int[] answer = numberGenerator.generate();
        //when
        int size = answer.length;
        //then
        assertEquals(size,4);
    }

}
