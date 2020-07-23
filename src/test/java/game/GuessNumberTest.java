package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_guess_given_inputNumber_1234(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {1,2,3,4};
        //stub
        NumberGenerator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
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
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("0A0B",result);
    }

    @Test
    public void should_return_2A0B_when_guess_given_inputNumber_1256(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {1,2,5,6};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("2A0B",result);
    }

    @Test
    public void should_return_0A2B_when_guess_given_inputNumber_2156(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {2,1,5,6};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("0A2B",result);
    }
    @Test
    public void should_return_1A1B_when_guess_given_inputNumber_1356(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {1,3,5,6};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("1A1B",result);
    }

    @Test
    public void should_return_0A4B_when_guess_given_inputNumber_4321(){
        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {4,3,2,1};
        //stub
        Generator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        //when
        String result = guessNumber.guess(inputNumber);
        //then
        assertEquals("0A4B",result);
    }

    @Test
    public void should_print_tip_when_inputNumber_length_is_not_equal_4(){
        //given
        int[] inputNumber = {4,3,2};
        Generator generator = new NumberGenerator();
        GuessNumber guessNumber = new GuessNumber(generator);

        //when
         boolean isValid = guessNumber.validInputNumber(inputNumber);
        //then
        assertEquals(false,isValid);
    }




}
