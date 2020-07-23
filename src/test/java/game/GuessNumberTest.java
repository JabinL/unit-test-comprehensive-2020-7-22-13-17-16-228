package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_guess_given_inputNumber_1234(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {1,2,3,4};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(inputNumber);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_inputNumber_5678(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {5,6,7,8};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(inputNumber);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("0A0B",result);
    }

}
